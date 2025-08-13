package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager {
    private static volatile ExtentReports extent;
    private static String reportFilePath;

    public static ExtentReports getInstance() {
        if (extent == null) {
            synchronized (ExtentReportManager.class) {
                if (extent == null) {
                    createInstance();
                }
            }
        }
        return extent;
    }

    private static void createInstance() {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String baseDir = System.getProperty("user.dir") + "/reports/";
        try {
            Files.createDirectories(Paths.get(baseDir));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create report directory: " + baseDir, e);
        }

        reportFilePath = baseDir + "Report_" + timeStamp + ".html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportFilePath);
        spark.config().setReportName("Automation Test Report");
        spark.config().setDocumentTitle("QA Test Results");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("Tester", "Tarun Kumar");
        extent.setSystemInfo("Environment", System.getProperty("env", "QA"));
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Browser", System.getProperty("browser", "Chrome"));
    }

    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }

    public static String getReportPath() {
        return reportFilePath;
    }

    public static void copyToLatest() {
        if (reportFilePath == null) return;
        Path src = Paths.get(reportFilePath);
        Path destDir = Paths.get(System.getProperty("user.dir") + "/latestReport/");
        try {
            Files.createDirectories(destDir);
            Path dest = destDir.resolve("ExtentReport.html");
            Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Failed to copy latest report: " + e.getMessage());
        }
    }
}

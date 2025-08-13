package utils;

import com.aventstack.extentreports.MediaEntityBuilder;

public class ReportLogger {

    public static void logInfo(String message) {
        ExtentTestManager.getTest().info(message);
    }

    public static void logPass(String message) {
        ExtentTestManager.getTest().pass(message);
    }

    public static void logFail(String message, String screenshotPath) {
        try {
            if (screenshotPath != null) {
                ExtentTestManager.getTest().fail(message,
                        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            } else {
                ExtentTestManager.getTest().fail(message);
            }
        } catch (Exception e) {
            ExtentTestManager.getTest().fail(message + " (screenshot attach failed)");
        }
    }
}

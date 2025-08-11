package stepDefs;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import utils.ExtentReportManager;
import utils.ExtentTestManager;
import utils.ReportLogger;
import utils.ScreenshotUtils;
import utils.DriverManager;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        // Ensure report is initialized and create a test entry
        ExtentReportManager.getInstance(); // safe init
        ExtentTest test = ExtentReportManager.getInstance().createTest(scenario.getName());

        // Optionally assign Cucumber tags as categories
        test.assignCategory(scenario.getSourceTagNames().toArray(new String[0]));

        ExtentTestManager.setTest(test);

        // Initialize WebDriver
        WebDriver driver = DriverManager.getDriver();
        test.info("Browser session started");
    }

//    @AfterStep
//    public void afterStep(Scenario scenario) {
//        if (scenario.isFailed()) {
//            WebDriver driver = DriverManager.getDriver(); // current driver
//            String screenshotPath = ScreenshotUtils.captureScreenshot(driver, scenario.getName());
//            ReportLogger.logFail("Step failed: " + scenario.getName(), screenshotPath);
//        }
//    }

    @After
    public void afterScenario(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                ReportLogger.logFail("Scenario failed: " + scenario.getName(), null);
            } else {
                ReportLogger.logPass("Scenario passed: " + scenario.getName());
            }
        } finally {
            // Teardown
            DriverManager.quitDriver();
            ExtentReportManager.flush();
            ExtentReportManager.copyToLatest(); // keeps a fixed "latest" report
            ExtentTestManager.removeTest();
        }
    }
}

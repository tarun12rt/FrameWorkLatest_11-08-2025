package utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private static final ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    public static void setTest(ExtentTest test) {
        testThread.set(test);
    }

    public static ExtentTest getTest() {
        return testThread.get();
    }

    public static void removeTest() {
        testThread.remove();
    }
}

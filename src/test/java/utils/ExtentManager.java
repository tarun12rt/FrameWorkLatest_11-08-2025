package utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return extentTest.get();
    }

    public static void setTest(ExtentTest test) {
        extentTest.set(test);
    }

    public static void removeTest() {
        extentTest.remove();
    }
}

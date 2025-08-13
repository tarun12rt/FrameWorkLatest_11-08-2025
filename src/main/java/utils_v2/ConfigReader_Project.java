package utils_v2;

public class ConfigReader_Project {

    // Timeout settings
    public static String getDriverTimeout() {
        return System.getProperty("DriverTimeOut", "30");
    }

    public static String getWaitTimeout() {
        return System.getProperty("WaitTimeOut", "20");
    }

    public static String getFluentWaitTimeout() {
        return System.getProperty("FluentWaitTimeOut", "10");
    }

    // Execution platform
    public static String getExecutionProvider() {
        return System.getProperty("strExecutionProvider", "local");
    }

    public static String getExecutionEnvironment() {
        return System.getProperty("strExecutionEnvironment", "QA");
    }

    public static String getOSType() {
        return System.getProperty("strOSType", "Windows");
    }

    public static String getBrowserType() {
        return System.getProperty("strBrowserType", "chrome");
    }

    public static String getApplicationType() {
        return System.getProperty("strApplicationType", "web");
    }

    public static String getExecMode() {
        return System.getProperty("ExecMode", "ExecutionSingleTest");
    }

    // Mobile platform configs
    public static String getPlatformVersion() {
        return System.getProperty("PlatformVersion", "13.0");
    }

    public static String getDeviceName() {
        return System.getProperty("DeviceName", "emulator-5554");
    }

    public static String getAppPath() {
        return System.getProperty("AppPath", "./apps/");
    }

    public static String getAndroidAppName() {
        return System.getProperty("AndroidAppName", "myapp.apk");
    }

    public static String getIOSAppName() {
        return System.getProperty("IOSAppName", "myapp.ipa");
    }

    public static String getPackageName() {
        return System.getProperty("PackageName", "com.example.app");
    }

    public static String getAppActivity() {
        return System.getProperty("AppActivity", "com.example.MainActivity");
    }

    // Appium
    public static String getAppiumServer() {
        return System.getProperty("AppiumServer", "127.0.0.1");
    }

    public static String getAppiumPort() {
        return System.getProperty("AppiumPort", "4723");
    }

    public static String getUDID() {
        return System.getProperty("UDID", "");
    }

    public static String getReset() {
        return System.getProperty("Reset", "true");
    }

    public static String getFullReset() {
        return System.getProperty("FullReset", "false");
    }

    // BrowserStack
    public static String getBSUsername() {
        return System.getProperty("BrowserStackName", "");
    }

    public static String getBSAccessKey() {
        return System.getProperty("BrowserStackKey", "");
    }

    public static String getBSWebBrowser() {
        return System.getProperty("BSWebBrowser", "chrome");
    }

    public static String getBSDevice() {
        return System.getProperty("BSDevice", "Samsung Galaxy S22");
    }

    public static String getBSOSVersion() {
        return System.getProperty("BSOSVersion", "13.0");
    }

    public static String getBSWebBuildName() {
        return System.getProperty("BSWebBuildName", "WebBuild1");
    }

    // JIRA
    public static String getJiraIssue() {
        return System.getProperty("JIRA_ISSUE", "");
    }

    public static String getJiraUserId() {
        return System.getProperty("JIRA_USERID", "");
    }

    public static String getJiraUserPassword() {
        return System.getProperty("JIRA_USER_PASSWORD", "");
    }

    public static String getJiraUrl() {
        return System.getProperty("JIRA_URL", "");
    }

    public static String getJiraProject() {
        return System.getProperty("JIRA_PROJECT", "");
    }

    public static String getJiraAssignee() {
        return System.getProperty("JIRA_ASSIGNEE", "");
    }


}

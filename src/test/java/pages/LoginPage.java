package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }

    public void launchUrl(String browserName) throws InterruptedException {
        driver.get("https://practice.automationtesting.in/");
//        ReportLogger.logStep("Launched Amazon in " + browserName);
        Thread.sleep(3000);
    }

    public void hoverMosueOverSignInButton() {
//        ReportLogger.logStep("Hovered over sign in button (dummy step)");
        // Add actual action later
    }
}

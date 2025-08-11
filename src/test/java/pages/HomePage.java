package pages;

import org.openqa.selenium.By;
import utils.DriverManager;
import utils.SeleniumActions;
import utils.ConfigReader;

public class HomePage {

    private SeleniumActions actions;

    public HomePage() {
        this.actions = new SeleniumActions(DriverManager.getDriver());
    }

    By homepageBanner = By.xpath("//img[@alt=\"Shop Selenium Books\"]");
    By searchIcon = By.id("s");
    By shopButton = By.xpath("//a[contains(text(),'Shop')]");
    By logo = By.xpath("//a[@title='Automation Practice Site']");
    By youtubeIcon = By.id("logo-icon");
    By myAccountButton = By.xpath("//a[normalize-space()='My Account']");
    By testCasesBtn= By.xpath("//a[normalize-space()='Test Cases']");
    By aTSiteBtn= By.xpath("//a[normalize-space()='AT Site']");
    By demoSiteBtn= By.xpath("//a[normalize-space()='Demo Site']");
    By addToCartBtn= By.xpath("//a[@title='Start shopping']");

    public void clickYouTubeIcon() {
        actions.fnClick(youtubeIcon);
    }

    public boolean verifyPageHeader(String strValue) {
        switch (strValue.toLowerCase()) {
            case "search icon":
                return actions.fnIsDisplayed(searchIcon);
            case "shop button":
                return actions.fnIsDisplayed(shopButton);
            case "logo":
                return actions.fnIsDisplayed(logo);
            case "my account button":
                return actions.fnIsDisplayed(myAccountButton);
            case "test cases button":
                return actions.fnIsDisplayed(testCasesBtn);
            case "at site button":
                return actions.fnIsDisplayed(aTSiteBtn);
            case "demo site button":
                return actions.fnIsDisplayed(demoSiteBtn);
            case "add to cart button":
                return actions.fnIsDisplayed(addToCartBtn);
            default:
                return false;
        }
    }


    public boolean verifyBanner() {
        return actions.fnIsDisplayed(homepageBanner);
    }

    public void launchUrl() {
        DriverManager.getDriver().get(ConfigReader.getProperty("url"));
    }


}

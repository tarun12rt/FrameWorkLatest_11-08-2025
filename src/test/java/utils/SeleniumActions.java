package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions {

    private WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver = driver;
    }

    // Generic findElement
    private WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    // Click
    public void fnClick(By locator) {
        getElement(locator).click();
    }

    // Type text
    public void fnType(By locator, String text) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Get text
    public String fnGetText(By locator) {
        return getElement(locator).getText();
    }

    // Is displayed
    public boolean fnIsDisplayed(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

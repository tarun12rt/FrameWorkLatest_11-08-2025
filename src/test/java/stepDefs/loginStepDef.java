package stepDefs;

import io.cucumber.java.en.And;
import pages.LoginPage;
import io.cucumber.java.en.Given;

public class loginStepDef {
    private LoginPage loginPage = new LoginPage();

    @Given("I launch the URL on {string} Browser")
    public void i_launch_the_url_on_browser(String browserName) throws InterruptedException {
        loginPage.launchUrl(browserName);
    }

    @And("I hover mouse over sign in button")
    public void iHoverMouseOverSignInButton() {
        loginPage.hoverMosueOverSignInButton();
    }
}

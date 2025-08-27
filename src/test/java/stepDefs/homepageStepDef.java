package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HomePage;

public class homepageStepDef {

    private HomePage homePage = new HomePage();

    @And("I click YouTube icon on web page")
    public void i_click_youtube_icon_on_web_page() {
        homePage.clickYouTubeIcon();
    }

    @Then("I verify {string} on page header")
    public void iVerifyOnPageHeader(String strValue) {
        Assert.assertTrue(homePage.verifyPageHeader(strValue));
    }

    @Then("I verify banner on homepage")
    public void iVerifyBannerOnHomepage() {
        Assert.assertTrue(homePage.verifyBanner());
    }

    @Given("I launch the URL")
    public void iLaunchTheURL() {
        homePage.launchUrl();
    }

    @And("I verify {string} in footer")
    public void iVerifyInFooter(String strValue) {
        Assert.assertTrue(homePage.verifyFooterElements(strValue));
    }
}

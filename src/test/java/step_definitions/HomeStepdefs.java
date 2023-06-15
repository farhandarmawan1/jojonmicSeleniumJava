package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.HomeUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomeStepdefs {
    private WebDriver webDriver;
    public HomeStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^user already on home page$")
    public void userAlreadyOnHomePage() {
        HomeUser homeUser = new HomeUser(webDriver);
        Assert.assertEquals("Service NSW makes it easier to find government information and services",homeUser.setVerifyHomePage());
    }

    @When("^user search service \"([^\"]*)\"$")
    public void userSearchService(String search) throws Throwable {
        HomeUser homeUser = new HomeUser(webDriver);
        homeUser.setFieldSearch(search);
    }

    @And("^user click button search$")
    public void userClickButtonSearch() throws InterruptedException {
        HomeUser homeUser = new HomeUser(webDriver);
        homeUser.setButtonSearch();
        Thread.sleep(2000);
    }

    @Then("^user succesfully search Apply for number plate and go to page search$")
    public void userSuccesfullySearchApplyForNumberPlateAndGoToPageSearch() {
        HomeUser homeUser = new HomeUser(webDriver);
        Assert.assertEquals("Order special number plates",homeUser.setVerifySearchPage());
    }

    @When("^user click menu Find location$")
    public void userClickMenuFindLocation() throws InterruptedException {
        HomeUser homeUser = new HomeUser(webDriver);
        homeUser.setButtonMenuLocation();
        Thread.sleep(2000);
    }

    @Then("^user fill field location \"([^\"]*)\">$")
    public void userFillFieldLocation(String fieldLocation) throws Throwable {
        HomeUser homeUser = new HomeUser(webDriver);
        homeUser.setGetFieldSearchLocation(fieldLocation);
        Thread.sleep(2000);
    }

    @And("^click button location$")
    public void clickButtonLocation() {
        HomeUser homeUser = new HomeUser(webDriver);
        homeUser.setButtonSearchLocation();
    }
}

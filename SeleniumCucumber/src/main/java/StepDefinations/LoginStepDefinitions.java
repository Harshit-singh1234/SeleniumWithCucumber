package StepDefinations;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends Setup {
    LoginPage loginPage;
    HomePage homePage;
    @Given("user visits the websites")
    public void user_visits_the_websites() {
        driver.get("https://release3410.learn-staging.auzmor.com/");

    }
    @Then("user can view the Home page")
    public void user_can_view_the_Home_page() {
        homePage=new HomePage(driver);
        homePage.userInHomepage();
    }
    @And("browser closes")
    public void browserCloses() {
        driver.quit();
    }

    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.doLogin(username,password);
    }

    @Then("user can't view the Home page")
    public void userCanTViewTheHomepage() {
        loginPage = new LoginPage(driver);
        loginPage.assertingErrorMessage();
    }


}

package TestData;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import StepDefinations.LoginStepDefinitions;
import TestBase.Setup;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test

public class LoginTest extends Setup {
    WebDriver driver;
@Test
 public  void UserIsonLoginPage()
    {

        LoginStepDefinitions loginStepDefinitions=new LoginStepDefinitions();
        loginStepDefinitions.user_visits_the_websites();
       LoginPage loginPage=new LoginPage(driver);
       loginPage.doLogin("release3410lea1@mailinator.com","Test@123");








    }


}

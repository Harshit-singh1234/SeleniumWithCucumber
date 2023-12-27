package PageObjects;

import TestBase.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage  extends Setup{

    @FindBy(xpath = "//*[@data-testid='login-username']")
    WebElement txt_username;

    @FindBy(xpath = "//*[@data-testid='login-password']")
    WebElement txt_password;

    @FindBy(xpath = "//*[@data-testid='login-submit-btn']")
    WebElement btn_submit;

    @FindBy(xpath = "//[@id='root']/div[1]/div/div/form/div[1]")
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_submit.click();
    }
    public void assertingErrorMessage(){
        Assert.assertTrue(errorMessage.getText().contains("This session belongs to a different user. Please try logging into a different session!"));
    }
}

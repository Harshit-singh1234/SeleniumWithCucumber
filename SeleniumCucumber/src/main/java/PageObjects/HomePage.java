package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    @FindBy(className = "title")
    WebElement pageTitle;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void userInHomepage(){
        Assert.assertEquals(pageTitle.getText(),"Home");
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class LogInPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement loginPageUserName;

    @FindBy(id="password")
    WebElement loginPasswordTextBox;

    @FindBy(xpath = "//input[@name='login']")
    WebElement clickOnLoginBtn;
    @FindBy(xpath = "//a[text()='Click here']")
    WebElement registerElement;

    public LogInPage(){   //to initialize to make the constructor
        PageFactory.initElements(driver,this);
    }


    public void clickOnTheRegister() {
        WebDriverUtil.waitElementUntilClickable(registerElement);
    }

    public void setLogin(String userName,String password){
        WebElementUtil.sendKeysOnElement(loginPageUserName,userName);
        WebElementUtil.sendKeysOnElement(loginPasswordTextBox,password);
        WebDriverUtil.waitElementUntilClickable(clickOnLoginBtn);


    }

}

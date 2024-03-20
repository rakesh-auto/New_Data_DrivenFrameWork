package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class RegisterPage extends WebTestBase {

    @FindBy (id="reg_email")
    WebElement emailAddressElement;

    @FindBy (id="reg_password")
    WebElement passwordElement;

    @FindBy(id = "mailchimp_woocommerce_newsletter")
    WebElement checkbox;

    @FindBy (xpath="//input[@name='register']")
    WebElement registerElement;

    public   RegisterPage(){
        PageFactory.initElements(driver ,this);
    }
    public void setRegisterUsername(String registerMail,String registerPass){
        WebElementUtil.sendKeysOnElement(emailAddressElement,registerMail);
        WebElementUtil.sendKeysOnElement(passwordElement,registerPass);
        WebElementUtil.clickOnElement(checkbox);
        WebDriverUtil.waitElementUntilClickable(registerElement);
    }


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebDriverUtil;
import util.WebElementUtil;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath="//h2[text()='My Account']")
    WebElement myAccountElement;

    @FindBy(xpath="//strong[text()='Error:']")
    WebElement myAccountErrorElement;

    @FindBy(xpath="//a[text()='Orders']")
    WebElement clickToolTipOrder;

@FindBy(xpath = "//a[text()='My Subscription']")
WebElement clickToolTipSubscription;

@FindBy(xpath ="//div[@class='wc-block-components-notice-banner__content']" )
WebElement errorForInvalidData;

    @FindBy(xpath = "//a[normalize-space()='Brew Guides']")
    WebElement clickOnBrewGuidElement;

    @FindBy(xpath = "//a[text()='View']")
    WebElement viewElement;



    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public String  getMyAccountElement() {
        return WebElementUtil.getTextOfElement(myAccountElement);
    }
    public String  getMyAccountErrorMassageElement() {
        return WebElementUtil.getTextOfElement(myAccountErrorElement);
    }

    public void clickOnOrder(){
        WebDriverUtil.waitElementUntilClickable(clickToolTipOrder);
    }
    public void clickOnSubscription(){
        WebDriverUtil.waitElementUntilClickable(clickToolTipSubscription);
    }
    public String  getErrorForInvalidData() {
        return WebElementUtil.getTextOfElement(errorForInvalidData);
    }

    public void setClickOnBrewGuid(){
        WebDriverUtil.waitElementUntilClickable(clickOnBrewGuidElement);
    }

    public void setClickOnViewBtn(){
        WebDriverUtil.waitElementUntilClickable(viewElement);
    }
}

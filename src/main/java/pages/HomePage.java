package pages;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.*;

import java.util.List;

import static util.WebElementUtil.isDisplay;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeAd;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginAndRegister;

    @FindBy(xpath = "(//a[text()='DISCOVER MORE'])[1]")
    WebElement discoverMBtn;

    @FindBy(id = "gform_confirmation_message_13")
    WebElement discountMail;

    @FindBy(id = "input_13_1")
    WebElement discountEmailIdTextBox;

    @FindBy(id = "gform_submit_button_13")
    WebElement discountSubmitBtn;

    @FindBy(xpath = "//a[text()='Privacy' and @class='footer__legal-menu__li__a']")
    WebElement privacyBtn;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopBtn;



    @FindBy(xpath = "(//a[text()='Capsules'])[1]")
    WebElement capsule;

    @FindBy(xpath = "//a[text()='Shop']//following::a")
    List<WebElement> allHiddenOption;

    @FindBy(xpath = "//h2[text()='Explore the range']")
    WebElement textOfTheExploreTheRange;

    @FindBy(xpath = "(//img[@alt='Campos Superior Blend'])[1]")
    WebElement productCamposSuperiorBlend;

    @FindBy(xpath = "//div[@class='header__logo-container']")
    WebElement logoElement;

    @FindBy(xpath = "//h6[@class='article-inner-content-header-category']")
    WebElement imgOFDiscoverBtn;







    public HomePage() {        // for initialize the class make constructor
        PageFactory.initElements(driver, this);
    }

    public void closeFirstAd() {
        //  closeAd.click();    ---------------apart from we use the explicit wait
        WebDriverUtil.waitElementUntilClickable(closeAd);
    }

    public void clickOnLoginAndRegister() {
        WebDriverUtil.waitElementUntilClickable(loginAndRegister);
    }

    public void clickOnDiscoverMoreBtn() {
        ActionUtil.clickToElementCommand(discoverMBtn);
        //WebDriverUtil.waitElementUntilClickable(discoverMBtn);-------------use the action class
    }
public boolean isDisplayOfDiscoverMoreText(){
        return WebElementUtil.isDisplay(imgOFDiscoverBtn);
}
    public void setDiscountMail(String discountMail) {
        WebElementUtil.sendKeysOnElement(discountEmailIdTextBox, discountMail);
        WebDriverUtil.waitElementUntilClickable(discountSubmitBtn);


    }

    public String getDiscountMail() {
        return WebElementUtil.getTextOfElement(discountMail);
    }

    public void checkPrivacyBtn() {
        WebDriverUtil.waitElementUntilClickable(privacyBtn);
    }

    public void clickOnTheShopBtn() {
        WebDriverUtil.waitElementUntilClickable(shopBtn);
    }

    public void actionOnTheShopBtn() {
        ActionUtil.moveToElementCommand(shopBtn);
    }

    public void allDropDwn() {
        LoopsUtil.selectOptionFromMultipleOptions(allHiddenOption, capsule);
       // WebDriverUtil.waitElementUntilClickable(capsule);
    }

    public void ScrollToTheText() {
        JavaScriptExecutorUtil.scrollByElement(textOfTheExploreTheRange);
    }
    public String getScrollToTheText() {
        return WebElementUtil.getTextOfElement(textOfTheExploreTheRange);
    }

    public void clickOnTheProduct() {
        WebDriverUtil.waitElementUntilClickable(productCamposSuperiorBlend);
    }
    public void logoOfBrand() {
        ActionUtil.moveToElementCommand(logoElement);
    }
    public  boolean logoOfBrandIsDisplay() {
      return WebElementUtil.isDisplay(logoElement);
    }



}







package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class PrivacyPage extends WebTestBase {
    @FindBy(tagName = "h2")
    WebElement privacyPageTxt;

    public PrivacyPage(){
        PageFactory.initElements(driver,this);
    }
    public String getPrivacyPageTxt(){
        return WebElementUtil.getTextOfElement(privacyPageTxt);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebElementUtil;

import static testbase.WebTestBase.driver;

public class SubscriptionPage {

    @FindBy(xpath = "//p[@class='no_subscriptions woocommerce-message woocommerce-message--info woocommerce-Message woocommerce-Message--info woocommerce-info']")
    WebElement subscriptionElement;

    public SubscriptionPage(){
        PageFactory.initElements(driver,this);
    }

    public String getSubscriptionElement(){
        return WebElementUtil.getTextOfElement(subscriptionElement);
    }


}

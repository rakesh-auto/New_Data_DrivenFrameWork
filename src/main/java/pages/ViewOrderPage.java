package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class ViewOrderPage extends WebTestBase {
    @FindBy(xpath="//h2[@class='woocommerce-order-details__title']")
    WebElement textviewOrderElement;

    public ViewOrderPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTextOfViewText(){
        return WebElementUtil.getTextOfElement(textviewOrderElement);
    }
}

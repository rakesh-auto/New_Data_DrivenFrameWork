package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class NewsPage extends WebTestBase {

@FindBy(xpath = "//span[text()='Cup Of Excellence® Month At Campos']")
    WebElement textOfOneProduct;
    public NewsPage(){
        PageFactory.initElements(driver,this);
    }
    public String getTheText(){
    return WebElementUtil.getTextOfElement(textOfOneProduct);
    }
}

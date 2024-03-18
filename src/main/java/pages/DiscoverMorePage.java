package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

import static testbase.WebTestBase.driver;

public class DiscoverMorePage extends WebTestBase {

    @FindBy(xpath = "//img[@class='article-inner-image']")
    WebElement discoverMorePageTitle;

    public DiscoverMorePage() {
        PageFactory.initElements(driver, this);
    }

    public String getDiscoverMorePageTitle(){
        return WebElementUtil.getTextOfElement(discoverMorePageTitle);

    }public void  getDiscoverMorePageDisplay(){
      WebElementUtil.isDisplay(discoverMorePageTitle);

    }
}

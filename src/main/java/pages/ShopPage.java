package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.DropDownUtil;
import util.WebDriverUtil;
import util.WebElementUtil;

public class ShopPage extends WebTestBase {
    @FindBy(id = "sort")
    WebElement drpElement;

    @FindBy(xpath ="//select['text()=Latest']")
    WebElement latestElement;

    @FindBy(xpath = "//img[@alt='Campos Superior Blend']")
    WebElement proCampusSuperior;

    @FindBy(xpath = "//Select[@class='pa_weight']")
    WebElement drpCampusSuperior;

    @FindBy(xpath = "//h1[text()='Campos Superior Blend']")
    WebElement composSuperiorBlendTxt;


    public ShopPage(){
        PageFactory.initElements(driver,this);
    }
    public void selectDrp(){
        WebDriverUtil.waitElementUntilClickable(drpElement);
        DropDownUtil.selectDropDownByVisibleText(latestElement,"Latest");
    }
    public String getLatestElement(){
        return  WebElementUtil.getTextOfElement(drpElement);
    }
    public void clickProCampusSuperior(){
        WebDriverUtil.waitElementUntilClickable(proCampusSuperior);
}
    public String getProElement(){
        return  WebElementUtil.getTextOfElement(composSuperiorBlendTxt);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class CapsulePage extends WebTestBase {

    @FindBy(xpath = "//img[@alt='Campos Superior Capsules']")
    WebElement camposSuperiorCapsule;


    public CapsulePage() {
        PageFactory.initElements( driver, this );
    }

        public String getTextOfCapsule () {
           return WebElementUtil.getTextOfElement( camposSuperiorCapsule );

    }
}

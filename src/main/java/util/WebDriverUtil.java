package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {
    public static final long IMPLICIT_WAIT=30;

    public static final long PAGE_LOAD_WAIT=30;

    public static final long EXPLICIT_WAIT=50;

    public static WebDriverWait webDriverWait;                                          //2
    public static void waitElementUntilClickable(WebElement element){                //1
        webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));    //3
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();  //4
    }
}

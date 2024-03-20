package util;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

import java.util.List;

public class iframeUtil extends WebTestBase {

    public static void iFrame(WebElement elementC,WebElement elementP ){
        driver.switchTo().frame(elementC);
        System.out.println(elementC.getText());
        driver.switchTo().parentFrame();
        System.out.println(elementP.getText());
    }
    public static void iFrameCount(List<WebElement> elements){
        System.out.println(elements.size());
    }

    public static void iframeUsingIndex(List<WebElement> elements){
        driver.switchTo().frame(1);
        System.out.println(elements.getClass());
        driver.switchTo().parentFrame();
    }
    public static void iFrameUsingNameOrId(List<WebElement> elements){
        driver.switchTo().frame((WebElement) elements);
    }

}

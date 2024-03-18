package util;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

import java.util.List;

public class LoopsUtil extends WebTestBase {

    public static void selectOptionFromMultipleOptions(List<WebElement> allElement, WebElement element){
        for (WebElement e : allElement){
            if (e.getText().equalsIgnoreCase(element.getText())){
                e.click();
                break;
            }
        }
    }

}

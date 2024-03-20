package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static testbase.WebTestBase.driver;

public class JavaScriptExecutorUtil {

    public static void scrollByElement(WebElement element){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;{
            javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);

        }
    }











}

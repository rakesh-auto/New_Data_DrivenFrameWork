package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;

import static testbase.WebTestBase.driver;

public class ActionUtil extends WebTestBase{
    public static void moveToElementCommand(WebElement element){
        Actions moveEle=new Actions(driver);
        moveEle.moveToElement(element);
    }

    public static void clickToElementCommand(WebElement element){
        Actions clickEle=new Actions(driver);
        clickEle.click(element);
    }
    public static void doubleClickToElementCommand(WebElement element){
        Actions clickEle=new Actions(driver);
        clickEle.click(element);
    }
}

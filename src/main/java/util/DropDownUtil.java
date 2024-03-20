package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;

import java.util.List;

public class DropDownUtil extends WebTestBase {
Select select;
    public static void selectDropDownByVisibleText(WebElement element,String visibleText){
        Select dropdown=new Select(element);
        dropdown.selectByVisibleText(visibleText);

    }
    public static void selectListOfDropDownByVisibleText(List<WebElement> elements, String visibleText){
        Select dropdown=new Select((WebElement) elements);
        dropdown.selectByVisibleText(visibleText);

    }
    public void selectDropDownByIndex(WebElement element,int index){
        Select dropdown=new Select(element);
        dropdown.selectByIndex(index);

    }
    public void deselectDropDownByVisibleText(WebElement element,String visibleText){
        Select dropdown=new Select(element);
        dropdown.deselectByVisibleText(visibleText);

    }
}

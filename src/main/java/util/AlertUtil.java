package util;

import org.openqa.selenium.Alert;
import testbase.WebTestBase;

public class AlertUtil extends WebTestBase {
    public static Alert alert;
    public static void alertAccept(){
         alert=driver.switchTo().alert();
        alert.accept();
    }
    public static void alertDismiss(){
        alert=driver.switchTo().alert();
        alert.dismiss();
    }
    public static void alertText(){
        alert=driver.switchTo().alert();
        alert.getText();
    }
    public static void alertSendKey(String text){
        alert=driver.switchTo().alert();
        alert.sendKeys(text);
    }
}

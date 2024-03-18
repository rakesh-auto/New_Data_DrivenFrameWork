package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class NewsTest extends WebTestBase {

    HomePage homePage;

    LogInPage logInPage;
    MyAccountPage myAccountPage;
    BrewGuidePage brewGuidePage;

    NewsPage newsPage;

   public NewsTest() {
       super();// intention to call parent class in the current class
   }
       @BeforeMethod
       public void preRequisite () {
           initialization();   // from parent page to initialize the browser
           homePage = new HomePage();
           logInPage = new LogInPage();
           myAccountPage=new MyAccountPage();

       }
       @Test(description ="Verify The News Page Of Product" )
       public void verifyTheNewsPageOfProduct() {
           SoftAssert softAssert = new SoftAssert();
           homePage.closeFirstAd();
           homePage.clickOnLoginAndRegister();
           logInPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
           myAccountPage.setClickOnBrewGuid();
           brewGuidePage.getDrpOfBrewGuidSelectNews();
           brewGuidePage.getClickOnFindBtn();
           softAssert.assertEquals(newsPage.getTheText(),"CUP OF EXCELLENCE® MONTH AT CAMPOS","text should be match");
           softAssert.assertAll();

       }


       @AfterTest
       public void tearDown(){
           driver.close();
       }

   }



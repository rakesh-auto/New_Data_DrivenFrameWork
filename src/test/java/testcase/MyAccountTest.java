package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class MyAccountTest extends WebTestBase {

    HomePage homePage;

    LogInPage logInPage;
    MyAccountPage myAccountPage;

    OrderPage orderPage;

    SubscriptionPage subscriptionPage;
    ViewOrderPage viewOrderPage;


    public MyAccountTest(){
        super();
    }
    @BeforeMethod
    public void preRequisite () {
        initialization();   // from parent page to initialize the browser
        homePage = new HomePage();
        logInPage = new LogInPage();
        myAccountPage = new MyAccountPage();
          orderPage =new OrderPage();
          subscriptionPage=new SubscriptionPage();
          viewOrderPage=new ViewOrderPage();

    }
@Test
public void verifyTheToolTipOrder() {
    SoftAssert softAssert=new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        logInPage.setLogin(prop.getProperty("userName"),prop.getProperty("password"));
        myAccountPage.clickOnOrder();
        softAssert.assertEquals(orderPage.getOrderElement(),"BROWSE PRODUCTS" , "GETTING THE TEXT" );
        softAssert.assertAll();

}
    @Test
    public void verifyTheToolTipSubscription() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        logInPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
        myAccountPage.clickOnSubscription();
        softAssert.assertEquals(subscriptionPage.getSubscriptionElement(), "You have no active subscriptions.", "GETTING THE TEXT");
        softAssert.assertAll();
    }
    @Test(description ="Verify the order Detail")
    public void verifyTheOrderDetail() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        logInPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
        myAccountPage.clickOnOrder();
        myAccountPage.setClickOnViewBtn();
        softAssert.assertEquals(viewOrderPage.getTextOfViewText(), "ORDER DETAILS", "TEXT SHOULD BE MATCH");
        softAssert.assertAll();

    }

        @AfterTest
    public void tearDown(){
        driver.close();
    }
}





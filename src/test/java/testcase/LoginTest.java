package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    HomePage homePage;          // object initialize
    LogInPage logInPage;
    MyAccountPage myAccountPage;

    public LoginTest() {

        super();// intention to call parent class in the current class
    }
        @BeforeMethod
        public void preRequisite () {
            initialization();   // from parent page to initialize the browser
            homePage = new HomePage();
            logInPage = new LogInPage();
            myAccountPage = new MyAccountPage();

        }
        @Test(description ="Verify Login With Valid UserName And Valid Password" )
        public void verifyLoginWithValidUsernameAndValidPassword() {
            SoftAssert softAssert = new SoftAssert();
            homePage.closeFirstAd();
            homePage.clickOnLoginAndRegister();
            logInPage.setLogin(prop.getProperty("userName"), prop.getProperty("password"));
            softAssert.assertEquals(myAccountPage.getMyAccountElement(), "MY ACCOUNT", "My ACCOUNT text should match");
            softAssert.assertAll();
        }
            @Test(description ="Verify Login With Valid UserName And InValid Password" )
            public void verifyLoginWithValidUsernameAndInvalidPassword() {
                SoftAssert softAssert= new SoftAssert();
                homePage.closeFirstAd();
                homePage.clickOnLoginAndRegister();
                logInPage.setLogin(prop.getProperty("userName"),prop.getProperty("invalidPassword"));
                softAssert.assertEquals(myAccountPage.getErrorForInvalidData(),"ERROR: The username or password you entered is incorrect. Lost your password?","My ACCOUNT text should match");
                softAssert.assertAll();

        }
    @Test(description ="Verify Login With InValid UserName And InValid Password" )
    public void verifyLoginWithInValidUsernameAndInvalidValidPassword() {
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        logInPage.setLogin(prop.getProperty("invalidUserName"),prop.getProperty("invalidPassword"));
        softAssert.assertEquals(myAccountPage.getErrorForInvalidData(),"ERROR: The username or password you entered is incorrect. Lost your password?","My ACCOUNT text should match");
        softAssert.assertAll();

    }
    @Test(description ="Verify Login With InValid UserName And Valid Password" )
    public void verifyLoginWithInValidUsernameAndInValidPassword() {
        SoftAssert softAssert= new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        logInPage.setLogin(prop.getProperty("invalidUserName"),prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getErrorForInvalidData(),"ERROR: The username or password you entered is incorrect. Lost your password?","My ACCOUNT text should match");
        softAssert.assertAll();

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}

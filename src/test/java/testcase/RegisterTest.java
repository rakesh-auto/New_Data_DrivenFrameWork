package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;
import pages.RegisterPage;
import testbase.WebTestBase;

public class RegisterTest extends WebTestBase {
    HomePage homePage;          // object initialize
    LogInPage loginPage;
    RegisterPage registerPage;
    MyAccountPage myAccountPage;

    public RegisterTest() {

        super();// intention to call parent class in the current class
    }
    @BeforeMethod
    public void preRequisite () {
        initialization();   // from parent page to initialize the browser
        homePage = new HomePage();
        loginPage = new LogInPage();
        registerPage = new RegisterPage();
        myAccountPage=new MyAccountPage();

    }
    @Test(description ="Verify Register With Valid email And Valid Password" )
    public void verifyRegisterWithValidEmailAndValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.clickOnTheRegister();
        registerPage.setRegisterUsername(prop.getProperty("registerMail"), prop.getProperty("registerPass"));
        softAssert.assertEquals(myAccountPage.getMyAccountElement(), "MY ACCOUNT", "My ACCOUNT text should match");
        softAssert.assertAll();
    }
    @Test(description ="Verify Register With InValid email And Valid Password" )
    public void verifyRegisterWithInValidEmailAndValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnLoginAndRegister();
        loginPage.clickOnTheRegister();
        registerPage.setRegisterUsername(prop.getProperty("inValidRegisterMail"), prop.getProperty("registerPass"));
        softAssert.assertEquals(myAccountPage.getMyAccountErrorMassageElement(), "Error:", "My ACCOUNT Error text should match");
        softAssert.assertAll();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}

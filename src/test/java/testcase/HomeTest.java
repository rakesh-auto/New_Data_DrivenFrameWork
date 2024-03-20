package testcase;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;
import util.LoopsUtil;
import util.WebElementUtil;

import java.util.WeakHashMap;

import static testbase.WebTestBase.driver;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    DiscoverMorePage discoverMorePage;
    PrivacyPage privacyPage;
    CapsulePage capsulePage;

    public HomeTest() {

        super();// intention to call parent class in the current class
    }

    @BeforeMethod
    public void preRequisite() {
        initialization();   // from parent page to initialize the browser
        homePage = new HomePage();
        discoverMorePage = new DiscoverMorePage();
        privacyPage = new PrivacyPage();
        capsulePage=new CapsulePage();

    }

    @Test(description = "Verify the Discover Btn from Home Page")
    public void VerifyTheDiscoverMoreBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnDiscoverMoreBtn();
        softAssert.assertTrue(homePage.isDisplayOfDiscoverMoreText(),"The image should match");
        softAssert.assertAll();
    }

    @Test(description = "Verify the discount mail")
    public void VerifyTheDiscountEmailOffer() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.setDiscountMail(prop.getProperty("discountMail"));
        softAssert.assertEquals(homePage.getDiscountMail(), "Thanks for signing up! Enter the code WELCOMECAMPOS10 at checkout for 10% off your first order.");
        softAssert.assertAll();
    }

    @Test
    public void VerifyThePrivacyBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.checkPrivacyBtn();
        softAssert.assertEquals(privacyPage.getPrivacyPageTxt(), "CAMPOS COFFEE PRIVACY POLICY");
        softAssert.assertAll();
    }

    @Test
    public void VerifyTheDropdownOfShopBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.actionOnTheShopBtn();
        homePage.allDropDwn();
        softAssert.assertEquals(capsulePage.getTextOfCapsule(),"CAMPOS SUPERIOR CAPSULES");
        softAssert.assertAll();






    }
    @Test(description="Verify the text on middle of the page")
    public void VerifyScrollToTheProduct() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.ScrollToTheText();
        softAssert.assertEquals(homePage.getScrollToTheText(),"EXPLORE THE RANGE","Text Should Be Match ");
        softAssert.assertAll();

    }
    @Test(description = "Verify Logo Of Application")
    public void verifyLogo(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.logoOfBrand();
        softAssert.assertTrue(homePage.logoOfBrandIsDisplay(),"logo should match");


    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}



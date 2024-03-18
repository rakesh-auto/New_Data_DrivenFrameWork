package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DiscoverMorePage;
import pages.HomePage;
import pages.PrivacyPage;
import pages.ShopPage;
import testbase.WebTestBase;

import static testbase.WebTestBase.driver;

public class ShopTest extends WebTestBase {

    HomePage homePage;
    ShopPage shopPage;

    public ShopTest() {

        super();// intention to call parent class in the current class
    }
    @BeforeMethod
    public void preRequisite () {
        initialization();   // from parent page to initialize the browser
        homePage = new HomePage();
       shopPage=new ShopPage();
    }
    @Test(description = "Verify the ShopBtn ")
    public void VerifyDropdownOfShortedBy() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        homePage.clickOnTheShopBtn();
        homePage.closeFirstAd();
        shopPage.selectDrp();
        softAssert.assertEquals(shopPage.getLatestElement(), "POPULARITY\n" +
                " LATEST\n" +
                " PRICE (LOWEST)\n" +
                " PRICE (HIGHEST)", "LATEST TEXT SHOULD BE MATCH");
        softAssert.assertAll();
    }
@Test(description = "verify the product is clickable")
public void verifyTheClickOnProduct(){
    SoftAssert softAssert = new SoftAssert();
    homePage.closeFirstAd();
    homePage.clickOnTheShopBtn();
    homePage.closeFirstAd();
    shopPage.clickProCampusSuperior();
    softAssert.assertEquals(shopPage.getProElement(),"CAMPOS SUPERIOR BLEND");
    softAssert.assertAll();

}






    @AfterTest
    public void tearDown(){
        driver.close();
    }
}

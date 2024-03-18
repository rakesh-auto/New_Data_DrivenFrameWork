package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;
import pages.ProductPage;
import testbase.WebTestBase;

import static testbase.WebTestBase.driver;

public class OrdersTest extends WebTestBase {

    HomePage homePage;
    ProductPage productPage;


    public OrdersTest() {
        super();

    }

    @BeforeMethod
    public void preRequisite() {
        initialization();   // from parent page to initialize the browser
        homePage = new HomePage();
        productPage = new ProductPage();

    }


    @Test(description ="Verify the Product Add TO Cart" )
    public void verifyTheProductAddToCart() {
        SoftAssert softAssert=new SoftAssert();
         homePage.closeFirstAd();
         homePage.clickOnTheProduct();
        homePage.closeFirstAd();
        productPage.selectDropDn();
        productPage.clickOnGrind();
        productPage.clickOnSubmitBtn();
        productPage.clickOnCheckout();
        softAssert.assertEquals(productPage.getTextOfOrder(),"YOUR ORDER","Text Should Be Match");
        softAssert.assertAll();


    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }
}




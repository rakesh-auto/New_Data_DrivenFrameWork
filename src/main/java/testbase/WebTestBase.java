package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.WebDriverUtil;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public Properties prop;
    public static WebDriver driver;

    public WebTestBase() {
        FileInputStream fileInputStream = null; //DECLARE GENERIC
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/config.properties");
            //2. to locate the file path use fileInputStream          //fetch local machine path
        } catch (Exception e) {
            e.printStackTrace();
        }
        //-------------------------------------------------------------------------
        prop = new Properties(); // 1. to accesS the config.properties file

        //load property files
        try {
            prop.load(fileInputStream);   //3. TO LOAD  PROPERTIES FILE
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------
    //BROWSER INITIALIZATION

    public void initialization(){
        String browserName= prop.getProperty("browser"); //4. create the variable +to get browser from config.properties
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/browser/chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/browser/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/browser/msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            throw new RuntimeException("please select the correct browser Name");
        }
        //--------------------------------------
        //5. to access the url
        driver.get(prop.getProperty("url"));

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebDriverUtil.PAGE_LOAD_WAIT));  //pageload from util package
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebDriverUtil.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();

    }}


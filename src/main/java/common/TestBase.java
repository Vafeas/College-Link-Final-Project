package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import common.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import static org.openqa.selenium.WebDriver.*;

public class TestBase {


//    @BeforeClass
//    @Parameters({"url","timeout.duration"})
//    public void openBrowser1 (String url, String timeOut){
//        WebDriver driver = new EdgeDriver();
////        WebDriver driver = new ChromeDriver();
//        WebDriverFactory.setDriver(driver);
//        driver.navigate().to(url);
//        driver.manage().window().maximize();
//        WebDriverFactory.setWait(new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(timeOut))));
//    }
//}

    WebDriver driver;

    /**
     * Before class set up method
     * Executed before each test
     *
     * @param url set at testng.xml test parameter
     */
    @Parameters({"url", "timeout.duration"})
    @BeforeClass
    public void openBrowser1 (String url, String timeOut){
        // Overcome issue: https://www.selenium.dev/blog/2022/using-java11-httpclient/
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        // Set Microsoft Edge as default driver
        String browser = System.getProperty("browser", "edge");

        // Select webdriver by browser system property
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        // open browser, maximize window & set wait
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverFactory.setDriver(driver);
        WebDriverFactory.setWait(new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(timeOut))));
    }

    /**
     * After class tear down method
     * Executed after each test
     */
    @AfterClass
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }
}



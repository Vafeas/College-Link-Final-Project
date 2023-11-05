package config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {
    @BeforeClass
    @Parameters({"url","timeout.duration"})
    public void openBrowser1 (String url, String timeOut){
        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new ChromeDriver();
        WebDriverFactory.setDriver(driver);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebDriverFactory.setWait(new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(timeOut))));
    }
}




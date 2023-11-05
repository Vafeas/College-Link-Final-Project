package page.objects.AmazonPO;

import config.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonVerificationPO {

    final String theSizeIs65 = "//span[normalize-space()='65 Inches']";
    final String theBrandIsLG = "//span[@class='a-size-base po-break-word'][normalize-space()='LG']";

    WebDriver driver = WebDriverFactory.getDriver();

    public Boolean verifyTheSize(){

        return driver.findElement(By.xpath(theSizeIs65)).isDisplayed();
    }
    public Boolean verifyTheBrand(){

        return driver.findElement(By.xpath(theBrandIsLG)).isDisplayed();
    }
}


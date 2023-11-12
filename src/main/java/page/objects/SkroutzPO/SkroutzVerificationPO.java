package page.objects.SkroutzPO;

import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkroutzVerificationPO {

    final String theProductTitleIs ="//*[@id=\"sku-details\"]/div[2]/div[2]/div[1]/h1";
    final String theConnectionIs = "//*[@id=\"skus_show\"]/div[5]/main/div[10]/div[1]/div[5]/dl[1]/dd";

    WebDriver driver = WebDriverFactory.getDriver();

    public Boolean verify5G(){

        return driver.findElement(By.xpath(theConnectionIs)).isDisplayed();
    }
    public Boolean verifyProductTitle(){

        return driver.findElement(By.xpath(theProductTitleIs)).isDisplayed();
    }
}

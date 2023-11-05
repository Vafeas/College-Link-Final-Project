package page.objects.AmazonPO;

import config.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonClickOnProductPO {
    final String chooseProduct = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait = WebDriverFactory.getWait();

    public void clickOnProduct (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chooseProduct)));
        driver.findElement(By.xpath(chooseProduct)).click();
    }
}
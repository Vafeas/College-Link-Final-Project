package page.objects.SkroutzPO;

import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzClickOnProductPO {

    final String chooseProduct2 = "//*[@id=\"sku-list\"]/li[5]/div/h2/a";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait = WebDriverFactory.getWait();


    public void clickOnProduct2 (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chooseProduct2)));
        driver.findElement(By.xpath(chooseProduct2)).click();
    }
}

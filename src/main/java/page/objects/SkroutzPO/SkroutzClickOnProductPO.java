package page.objects.SkroutzPO;

import common.BaseActions;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzClickOnProductPO extends BaseActions {
//    private By chooseProduct2 = By.xpath("//*[@id=\"sku-list\"]/li[5]/div/h2/a");
//    private By chooseProduct2 = By.xpath("//*[@id=\"sku-list\"]/li[5]/a");
private By chooseProduct2 = By.xpath("//ol[@id='sku-list']/li[@data-skuid='31006584']/a");
    public SkroutzClickOnProductPO clickOnProduct2(){
        waitForElement(chooseProduct2);
        click(chooseProduct2);
        return this;
    }
}






//public class SkroutzClickOnProductPO {
//
//    final String chooseProduct2 = "//*[@id=\"sku-list\"]/li[5]/div/h2/a";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//    WebDriverWait wait = WebDriverFactory.getWait();
//
//
//    public void clickOnProduct2 (){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chooseProduct2)));
//        driver.findElement(By.xpath(chooseProduct2)).click();
//    }
//}

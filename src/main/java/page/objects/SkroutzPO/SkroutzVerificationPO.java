package page.objects.SkroutzPO;

import common.BaseActions;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzVerificationPO extends BaseActions {
    private By theProductTitleIs = By.xpath("//*[@id=\"sku-details\"]/div[2]/div[2]/div[1]/h1");
    private By theConnectionIs = By.xpath("//*[@id=\"skus_show\"]/div[5]/main/div[10]/div[1]/div[5]/dl[1]/dd");

    public Boolean verify5G(){
        waitForElement(theProductTitleIs);
        verify(theProductTitleIs);
        return true;
    }
    public Boolean verifyProductTitle(){
        waitForElement(theConnectionIs);
        verify(theConnectionIs);
        return true;
    }
}







//public class SkroutzVerificationPO {
//
//    final String theProductTitleIs ="//*[@id=\"sku-details\"]/div[2]/div[2]/div[1]/h1";
//    final String theConnectionIs = "//*[@id=\"skus_show\"]/div[5]/main/div[10]/div[1]/div[5]/dl[1]/dd";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//
//    WebDriverWait wait = WebDriverFactory.getWait();
//
//    public Boolean verify5G(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(theConnectionIs)));
//        return driver.findElement(By.xpath(theConnectionIs)).isDisplayed();
//    }
//    public Boolean verifyProductTitle(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(theProductTitleIs)));
//        return driver.findElement(By.xpath(theProductTitleIs)).isDisplayed();
//    }
//}



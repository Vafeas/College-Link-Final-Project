package page.objects.AmazonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class AmazonVerificationPO extends BaseActions {
    private By theSizeIs65 = By.xpath("//span[normalize-space()='65 Inches']");
    private By theBrandIsLG = By.xpath("//span[@class='a-size-base po-break-word'][normalize-space()='LG']");

    public Boolean verifyTheSize(){
        waitForElement(theSizeIs65);
        verify(theSizeIs65);
        return true;
    }
    public Boolean verifyTheBrand(){
        waitForElement(theBrandIsLG);
        verify(theBrandIsLG);
        return true;
    }
}









//public class AmazonVerificationPO {
//
//    final String theSizeIs65 = "//span[normalize-space()='65 Inches']";
//    final String theBrandIsLG = "//span[@class='a-size-base po-break-word'][normalize-space()='LG']";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//
//    public Boolean verifyTheSize(){
//
//        return driver.findElement(By.xpath(theSizeIs65)).isDisplayed();
//    }
//    public Boolean verifyTheBrand(){
//
//        return driver.findElement(By.xpath(theBrandIsLG)).isDisplayed();
//    }
//}




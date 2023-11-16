package page.objects.SkroutzPO;

import common.BaseActions;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzClickTermsPO extends BaseActions {
    private By clickOnTerms = By.xpath("//button[@id='accept-all']");

    public SkroutzClickTermsPO clickTerms(){
        waitForElement(clickOnTerms);
        click(clickOnTerms);
        return this;
    }
}









//public class SkroutzClickTermsPO {
//
//    final String clickOnTerms = "//button[@id='accept-all']";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//    WebDriverWait wait = WebDriverFactory.getWait();
//
//        public void clickTerms (){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnTerms)));
//        driver.findElement(By.xpath(clickOnTerms)).click();
//    }
//}
package page.objects.SkroutzPO;

import config.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzClickTermsPO {

    final String clickOnTerms = "//button[@id='accept-all']";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait = WebDriverFactory.getWait();

        public void clickTerms (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnTerms)));
        driver.findElement(By.xpath(clickOnTerms)).click();
    }
}

package page.objects.SkroutzPO;

import config.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SkroutzSearchBarPO {

    final String ValueOnSearchBar2 = "//*[@id=\"search-bar-input\"]";
    final String SubmitButton2 = "//form/button[@type='submit']";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait = WebDriverFactory.getWait();

    public void typingValueOnSearchBar(String typeValueOnSearchBar){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ValueOnSearchBar2)));
        driver.findElement(By.xpath(ValueOnSearchBar2)).sendKeys(typeValueOnSearchBar);
    }
    public void clickTheSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SubmitButton2)));
        driver.findElement(By.xpath(SubmitButton2)).click();
    }
}

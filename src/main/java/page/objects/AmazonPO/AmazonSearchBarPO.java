package page.objects.AmazonPO;

import common.BaseActions;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonSearchBarPO {

    final String ValueOnSearchBar = "//*[@id=\"twotabsearchtextbox\"]";
    final String SubmitButton = "//*[@id=\"nav-search-submit-button\"]";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait = WebDriverFactory.getWait();

    public void typingValueOnSearchBar(String typeValueOnSearchBar){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ValueOnSearchBar)));
        driver.findElement(By.xpath(ValueOnSearchBar)).sendKeys(typeValueOnSearchBar);
    }
    public void clickTheSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SubmitButton)));
        driver.findElement(By.xpath(SubmitButton)).click();
    }
}



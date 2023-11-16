package page.objects.SkroutzPO;

import common.BaseActions;
import common.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzSearchBarPO extends BaseActions {
    private By ValueOnSearchBar2 = By.xpath("//*[@id=\"search-bar-input\"]");
    private By SubmitButton2 = By.xpath("//form/button[@type='submit']");

    public String typingValueOnSearchBar(String typeValueOnSearchBar){
        waitForElement(ValueOnSearchBar2);
        click(ValueOnSearchBar2);
        input(ValueOnSearchBar2, typeValueOnSearchBar);
        return this.toString();
    }
    public SkroutzSearchBarPO clickTheSubmitButton(){
        waitForElement(SubmitButton2);
        click(SubmitButton2);
        return this;
    }
}








//public class SkroutzSearchBarPO {
//
//    final String ValueOnSearchBar2 = "//*[@id=\"search-bar-input\"]";
//    final String SubmitButton2 = "//form/button[@type='submit']";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//    WebDriverWait wait = WebDriverFactory.getWait();
//
//    public void typingValueOnSearchBar(String typeValueOnSearchBar){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ValueOnSearchBar2)));
//        driver.findElement(By.xpath(ValueOnSearchBar2)).sendKeys(typeValueOnSearchBar);
//    }
//    public void clickTheSubmitButton(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SubmitButton2)));
//        driver.findElement(By.xpath(SubmitButton2)).click();
//    }
//}



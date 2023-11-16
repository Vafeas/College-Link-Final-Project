package page.objects.AmazonPO;

import common.BaseActions;
import org.openqa.selenium.By;

public class AmazonSearchBarPO extends BaseActions {
    private By ValueOnSearchBar = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
    private By SubmitButton = By.xpath("//*[@id=\"nav-search-submit-button\"]");

    public String typingValueOnSearchBar(String typeValueOnSearchBar){
        waitForElement(ValueOnSearchBar);
        click(ValueOnSearchBar);
        input(ValueOnSearchBar, typeValueOnSearchBar);
        return this.toString();
    }
    public AmazonSearchBarPO clickTheSubmitButton(){
        waitForElement(SubmitButton);
        click(SubmitButton);
        return this;
    }
}








//public class AmazonSearchBarPO {
//
//    final String ValueOnSearchBar = "//*[@id=\"twotabsearchtextbox\"]";
//    final String SubmitButton = "//*[@id=\"nav-search-submit-button\"]";
//
//    WebDriver driver = WebDriverFactory.getDriver();
//    WebDriverWait wait = WebDriverFactory.getWait();
//
//    public void typingValueOnSearchBar(String typeValueOnSearchBar){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ValueOnSearchBar)));
//        driver.findElement(By.xpath(ValueOnSearchBar)).sendKeys(typeValueOnSearchBar);
//    }
//    public void clickTheSubmitButton(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SubmitButton)));
//        driver.findElement(By.xpath(SubmitButton)).click();
//    }
//}





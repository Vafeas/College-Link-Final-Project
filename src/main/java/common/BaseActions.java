package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions{

    public WebDriver getDriver() {
        return WebDriverFactory.getDriver();
    }

    public WebDriverWait getWait() {
        return WebDriverFactory.getWait();
    }

    public void waitForElement(By locator) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        waitForElement(locator);
        getDriver().findElement(locator).click();
    }

    public void input(By locator, String typeValueOnSearchBar) {
        waitForElement(locator);
        getDriver().findElement(locator).sendKeys(typeValueOnSearchBar);
    }

    public void verify(By locator){
        waitForElement(locator);
        getDriver().findElement(locator).isDisplayed();
    }
}
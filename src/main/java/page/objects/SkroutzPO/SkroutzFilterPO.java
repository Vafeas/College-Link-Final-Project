package page.objects.SkroutzPO;

import config.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkroutzFilterPO {

        final String filterSelect = "//*[@id=\"categories_show\"]/div[6]/main/div/section/div[1]/div[12]/ul/li[3]/a";

        WebDriver driver = WebDriverFactory.getDriver();
        WebDriverWait wait = WebDriverFactory.getWait();

          public void clickFilter(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filterSelect)));
            driver.findElement(By.xpath(filterSelect)).click();
          }
        }


import business.objects.AmazonBO.AmazonUserActionBO;
import common.TestBase;
import common.WebDriverFactory;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Amazon Test Case

@Epic("Allure Epic")
@Feature("Feature 1")
@Story("Story 1 of Feature 1")
public class AmazonTestCase extends TestBase {

    WebDriver driver;
    WebDriverWait wait;
    AmazonUserActionBO userActionBO;

    @BeforeClass(alwaysRun = true)
    public void initEnv(){
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();
        userActionBO = new AmazonUserActionBO();
    }
    @Step
    @Link(url = "https://www.amazon.com/")
    @Test(alwaysRun = true , description = "(Amazon) Type on search bar, press submit, click on product & verify results.")
    public void test_step1(){
        userActionBO.chooseThe3rdProduct("LG TV 65");
        userActionBO.verifyBrandLG();
        userActionBO.verifySize65inches();
    }
}

















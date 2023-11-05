import business.objects.SkroutzBO.SkroutzUserActionBO;
import config.TestBase;
import config.WebDriverFactory;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import pojos.TypeValueOnSearchBar;

//Skroutz Test Case

@Epic("Allure Epic")
@Feature("Feature 2")
@Story("Story 2 of Feature 2")
public class SkroutzTestCase extends TestBase {

    WebDriver driver;
    WebDriverWait wait;

//    TypeValueOnSearchBar typeValueOnSearchBar;

    SkroutzUserActionBO userActionBO;

    @BeforeClass(alwaysRun = true)
    public void initEnv(){
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();
        userActionBO = new SkroutzUserActionBO();
    }

//    @BeforeClass(alwaysRun = true, description = "Load the value to be typed on the search bar")
//    public void init(){
//        DataLoader dataLoader = new DataLoader();
//        typeValueOnSearchBar = dataLoader.loadTypeValueOnSearchBar2();
//    }

    @Step
    @Link(url = "https://www.skroutz.gr/")
    @Test(alwaysRun = true , description = "(Skroutz) Type on search bar, press submit, choose filter, click on product & verify results.")
    public void test_step1(){
        userActionBO.chooseMidnight("iphone13");
        userActionBO.verifyTheProductTitle();
        userActionBO.verifyThe5G();
    }
}

package business.objects.AmazonBO;


import page.objects.AmazonPO.AmazonClickOnProductPO;
import page.objects.AmazonPO.AmazonSearchBarPO;
import org.testng.Assert;
import page.objects.AmazonPO.AmazonVerificationPO;

public class AmazonUserActionBO {
    AmazonSearchBarPO searchBarPO = new AmazonSearchBarPO();
    AmazonClickOnProductPO clickOnProductPO = new AmazonClickOnProductPO();
    AmazonVerificationPO verificationPO = new AmazonVerificationPO();

    public void chooseThe3rdProduct(String typeValueOnSearchBar){
       userAction(typeValueOnSearchBar);
    }
    public void userAction(String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.clickOnProductPO.clickOnProduct();
    }
    //  verification methods.
    public void verifyBrandLG(){
        Assert.assertTrue(verificationPO.verifyTheBrand());
    }
    public void verifySize65inches(){
        Assert.assertTrue(verificationPO.verifyTheSize());
    }
}

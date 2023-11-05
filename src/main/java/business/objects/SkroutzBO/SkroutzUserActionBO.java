package business.objects.SkroutzBO;

import org.testng.Assert;
import page.objects.SkroutzPO.*;



public class SkroutzUserActionBO {
    SkroutzSearchBarPO searchBarPO = new SkroutzSearchBarPO();
    SkroutzClickOnProductPO clickOnProductPO = new SkroutzClickOnProductPO();;
    SkroutzVerificationPO verificationPO = new SkroutzVerificationPO();
    SkroutzClickTermsPO clickTermsPO = new SkroutzClickTermsPO();
    SkroutzFilterPO filterPO = new SkroutzFilterPO();

    public void chooseMidnight(String typeValueOnSearchBar){

        userAction(typeValueOnSearchBar);
    }
    public void userAction (String typeValueOnSearchBar) {
        this.searchBarPO.typingValueOnSearchBar(typeValueOnSearchBar);
        this.searchBarPO.clickTheSubmitButton();
        this.clickTermsPO.clickTerms();
        this.filterPO.clickFilter();
        this.clickOnProductPO.clickOnProduct2();
    }
//  verification methods.
    public void verifyTheProductTitle(){

        Assert.assertTrue(verificationPO.verifyProductTitle());
    }
    public void verifyThe5G(){

        Assert.assertTrue(verificationPO.verify5G());
    }
}



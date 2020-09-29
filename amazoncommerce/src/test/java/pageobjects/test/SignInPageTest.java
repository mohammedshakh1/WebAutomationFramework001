package pageobjects.test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SignInPage;

public class SignInPageTest extends BrowserDriver {

    SignInPage objOfSignInPage = null;

    @BeforeMethod
    public void initializeElements(){
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void createNewAccountTest(){
        objOfSignInPage.createNewAccount();
        String actualErrorMessage = objOfSignInPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "");

    }

}

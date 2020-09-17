package pageobjects.test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import reporting.TestLogger;

public class HomePageTest extends BrowserDriver {

    HomePage objOfHomePage = null;

    @BeforeMethod
    public void initializeElements(){
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchBoxTest() {
        objOfHomePage.searchBox();

    }

    @Test
    public void logoDisplayTest(){
        boolean amazonlogo = objOfHomePage.amazonLogoDisplay();
        Assert.assertEquals(amazonlogo, true);
        TestLogger.log("Amazon Logo Displyed");
    }



}

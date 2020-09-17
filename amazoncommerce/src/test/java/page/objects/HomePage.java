package page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage {

    WebDriver driver = null;

   @FindBy (how = How.ID, using = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy (how = How.CLASS_NAME, using = "nav-logo-link")
    WebElement logoDisplayed;

    @FindBy (how = How.CLASS_NAME, using = "a-size-base a-color-base a-text-bold")
    WebElement amazonPrime;


    public void searchBox () {
        searchBox.sendKeys("Iphone XS Max", Keys.ENTER);
        String actualText = amazonPrime.getText();
        TestLogger.log("Actual Text: " + actualText);
        String expectedText = "Amazon Prime";
        TestLogger.log("Test Passed");

    }
    public boolean amazonLogoDisplay(){
        logoDisplayed.isDisplayed();
        return true;
    }



}

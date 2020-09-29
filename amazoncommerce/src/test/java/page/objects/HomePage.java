package page.objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver driver = null;

   @FindBy (how = How.ID, using = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy (how = How.CLASS_NAME, using = "nav-logo-link")
    WebElement logoDisplayed;

    @FindBy (how = How.ID, using = "nav-orders")
    WebElement orderAndReturn;

    //@FindBy (how = How.ID, using = "nav-link-accountList")
    //WebElement accountAndLists;



    public void searchBox () {
        searchBox.sendKeys("Iphone XS Max", Keys.ENTER);
        searchBox.click();
    }
    public boolean amazonLogoDisplay(){
        logoDisplayed.isDisplayed();
        return true;
    }




}

package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

    @FindBy (how = How.ID, using = "nav-link-accountList")
    WebElement accountAndLists;

    @FindBy (how = How.ID, using = "createAccountSubmit")
    WebElement createAccount;

    @FindBy (how = How.ID, using = "ap_customer_name")
    WebElement name;

    @FindBy (how = How.ID, using = "ap_email")
    WebElement email;

    @FindBy (how = How.ID, using = "ap_password")
    WebElement password;

    @FindBy (how = How.ID, using = "ap_password_check")
    WebElement reEnterPassword;

    @FindBy (how = How.ID, using = "continue")
    WebElement clickCreateAccountButton;

    @FindBy (how = How.CLASS_NAME, using = "a-alert-content")
    WebElement passwordErrorMessage;




    public void account(){
        accountAndLists.click();

    }

    public void createNewAccount(){
        account();
        createAccount.click();
        name.sendKeys("Asif");
        email.sendKeys("asif@gmail.com");
        password.sendKeys("asif1234");
        clickCreateAccountButton.click();


    }

    public String getErrorMessage(){

        String message =  passwordErrorMessage.getText();

        return message;

    }

}

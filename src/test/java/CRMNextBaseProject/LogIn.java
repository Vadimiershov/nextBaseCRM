package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends Driver{
    private static LogIn loginInstance;

    public LogIn() {
        PageFactory.initElements(getDriver(), this);
    }

    public static LogIn getInstance() {
        if (loginInstance == null) {
            loginInstance = new LogIn();
        }
       return loginInstance;
    }


    @FindBy(how = How.CSS, using = "input[type='text']")
    public WebElement loginBox;

    @FindBy(how = How.CSS, using = "input[type='password']")
    public WebElement passwordBox;

    @FindBy(how = How.CSS, using = "input[type='submit']")
    public WebElement loginBtn;





    public void loginHR51() {
        loginBox.clear();
        loginBox.sendKeys(Data.hr51);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }

    public void loginHR52(){
        loginBox.clear();
        loginBox.sendKeys(Data.hr52);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }

    public void loginMarketing51() {
        loginBox.clear();
        loginBox.sendKeys(Data.marketing51);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }

    public void loginMarketing52() {
        loginBox.clear();
        loginBox.sendKeys(Data.marketing52);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }

    public void loginHelpDeck51() {
        loginBox.clear();
        loginBox.sendKeys(Data.helpdesk51);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }

    public void loginHelpDeck52() {
        loginBox.clear();
        loginBox.sendKeys(Data.helpdesk52);
        passwordBox.sendKeys(Data.password);
        loginBtn.click();
    }


}

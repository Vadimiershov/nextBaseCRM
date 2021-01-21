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

    protected static LogIn getInstance() {
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

    Data login = new Data();



    public void loginHR51() {
        loginBox.clear();
        loginBox.sendKeys(login.hr51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHR52(){
        loginBox.clear();
        loginBox.sendKeys(login.hr52);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginMarketing51() {
        loginBox.clear();
        loginBox.sendKeys(login.marketing51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginMarketing52() {
        loginBox.clear();
        loginBox.sendKeys(login.marketing52);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHelpDeck51() {
        loginBox.clear();
        loginBox.sendKeys(login.helpdesk51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHelpDeck52() {
        loginBox.clear();
        loginBox.sendKeys(login.helpdesk51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }


}

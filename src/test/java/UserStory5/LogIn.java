package UserStory5;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class LogIn extends Driver{

    Data login = new Data();

    WebElement loginBox = getDriver().findElement(By.cssSelector("input[type='text']"));
    WebElement passwordBox = getDriver().findElement(By.cssSelector("input[type='password']"));
    WebElement loginBtn = getDriver().findElement(By.cssSelector("input[type='submit']"));

    public void loginHR51(){
        loginBox.clear();
        loginBox.sendKeys(login.hr51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHR52(){

        try {
            loginBox.clear();
        }catch (StaleElementReferenceException e){
            WebElement loginBox = getDriver().findElement(By.cssSelector("input[type='text']"));
            loginBox.clear();
        }
        loginBox.sendKeys(login.hr52);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginMarketing51(){
        loginBox.clear();
        loginBox.sendKeys(login.marketing51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginMarketing52(){
        loginBox.clear();
        loginBox.sendKeys(login.marketing52);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHelpDeck51(){
        loginBox.clear();
        loginBox.sendKeys(login.helpdesk51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }

    public void loginHelpDeck52(){
        loginBox.clear();
        loginBox.sendKeys(login.helpdesk51);
        passwordBox.sendKeys(login.password);
        loginBtn.click();
    }




}

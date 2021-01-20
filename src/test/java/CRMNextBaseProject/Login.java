package CRMNextBaseProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Driver {

    Users users = new Users();
//    @FindBy(how = How.CSS, using = "input[type='text']")
//    public WebElement loginBox;

    private final WebElement loginBox = getDriver().findElement(By.cssSelector("input[type='text']"));
    private final WebElement passwordBox = getDriver().findElement(By.cssSelector("input[type='password']"));
    private final WebElement loginBtn = getDriver().findElement(By.cssSelector("input[type='submit']"));

    public void login() {
        loginBox.sendKeys(users.user51);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }

    public void login52Help() {
        loginBox.sendKeys(users.user52);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }

    public void login51HR() {
        loginBox.sendKeys(users.userHR51);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }
    public void login52HR() {
        loginBox.sendKeys(users.userHR52);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }
    public void login51Marketing() {
        loginBox.sendKeys(users.userMarketing51);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }

    public void login52Marketing() {
        loginBox.sendKeys(users.userMarketing52);
        passwordBox.sendKeys(users.password);
        loginBtn.click();
    }

}
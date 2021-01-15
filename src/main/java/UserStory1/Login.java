package UserStory1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
// comments
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    // logInAsHR51(driver);
    // logInAsHR52(driver);
    // logInAsHelpDesk51(driver);
    // logInAsHelpDesk52(driver);
    // logInAsMarketing51(driver);
    // logInAsMarketing52(driver);
    // ForgotPasswordLink(driver);
    // hi


}


    // static method logInAsHR51 will accept a WebDriver parameter...
    // and after execution will login to "https://login2.nextbasecrm.com" as a "hr51" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsHR51(driver); **********
    public static void logInAsHR51(WebDriver driver){
    driver.get("https://login2.nextbasecrm.com");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hr51@cybertekschool.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
    WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
    checkboxRememberMe.click();
    driver.findElement(By.xpath("//input[@type='submit']")).click();

}

    // static method logInAsHR52 will accept a WebDriver parameter and after execution...
    // will login to "https://login2.nextbasecrm.com" as a "hr52" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsHR52(driver); **********
    public static void logInAsHR52(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hr52@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxRememberMe.click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    // static method logInAsHelpDesk51 will accept a WebDriver parameter and after...
    // execution will login to "https://login2.nextbasecrm.com" as a "helpdesk51" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsHelpDesk51(driver); **********
    public static void logInAsHelpDesk51(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk51@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxRememberMe.click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    // static method logInAsHelpDesk52 will accept a WebDriver parameter and after...
    // execution will login to "https://login2.nextbasecrm.com" as a "helpdesk52" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsHelpDesk52(driver); **********
    public static void logInAsHelpDesk52(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helpdesk52@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxRememberMe.click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    // static method logInAsMarketing51 will accept a WebDriver parameter and after...
    // execution will login to "https://login2.nextbasecrm.com" as a "marketing51" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsMarketing51(driver); **********
    public static void logInAsMarketing51(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("marketing51@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxRememberMe.click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    // static method logInAsMarketing52 will accept a WebDriver parameter and after...
    // execution will login to "https://login2.nextbasecrm.com" as a "marketing52" user
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.logInAsMarketing52(driver); **********
    public static void logInAsMarketing52(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("marketing52@cybertekschool.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        WebElement checkboxRememberMe= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxRememberMe.click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }

    // static method ForgotPasswordLink will accept a WebDriver parameter and after...
    // execution will go to "https://login2.nextbasecrm.com/?forgot_password=yes"
    // ****** IT HAS TO BE CALLED BY PACKAGE NAME AND CLASS NAME ******
    // ****** UserStory1.Login.ForgotPasswordLink(driver); **********
    public static void ForgotPasswordLink(WebDriver driver){
        driver.get("https://login2.nextbasecrm.com");
        driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']")).click();
        if(driver.getCurrentUrl().contains("forgot_password")){
            System.out.println("FORGOT YOUR PASSWORD? link is working properly. PASSED!");
        }else{
            throw new RuntimeException("\"FORGOT YOUR PASSWORD? link is NOT working properly. ERROR\"");
        }
    }






}

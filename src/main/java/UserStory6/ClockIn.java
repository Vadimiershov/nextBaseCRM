package UserStory6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClockIn {
    public static void main(String[] args) throws InterruptedException {
  //setup
  WebDriverManager.chromedriver().setup();
  //create instance of the browser
        WebDriver driver = new ChromeDriver();
        //go to this website "http://login2.nextbasecrm.com/"
        driver.get("http://login2.nextbasecrm.com/");
        Thread.sleep(2000);
        //enter userLogin
        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr51@cybertekschool.com");
        Thread.sleep(2000);
        // enter password
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);
        //click on login
        driver.findElement(By.className("login-btn")).click();

// Aidai, this is the fixed part !!!!
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement clock = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='timeman-background']")));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clock);



    }
}

package UserStory3;

import CRMNextBaseProject.ThreadSleep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularWay_SBox {

    public static void main(String[] args) throws InterruptedException {

        //setup
        WebDriverManager.chromedriver().setup();
        //create instance of the browser
        WebDriver driver = new ChromeDriver();
        //go to this website "http://login2.nextbasecrm.com/"
        driver.get("http://login2.nextbasecrm.com/");
        Thread.sleep(2000);
        //enter userLogin
        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing51@cybertekschool.com");
        Thread.sleep(2000);
        // enter password
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);
        //click on login
        driver.findElement(By.className("login-btn")).click();

        //Click in search button
        driver.findElement(By.className("login-btn")).click();

        //WebElement for searchBox
        WebElement searchBox = driver.findElement(By.id("search-textbox-input"));

        //search people
        searchBox.sendKeys("People");
        //searchBox.click();
       // driver.navigate().back();

        //searchBox.sendKeys(new CharSequence[]{"Documents\n"});

    }
}




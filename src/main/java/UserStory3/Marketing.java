package UserStory3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebdriverFactory;

public class Marketing {

    public static void main(String[] args) throws InterruptedException {

//1.Open Chrome Browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");

        //Go to: https://login.nextbasecrm.com/
        driver.get("https://login.nextbasecrm.com/");
        driver.manage().window().maximize();

        //Login user name: marketing51@cybertekschool.com"
        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing51@cybertekschool.com");

        //Login Password:UserUser
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");

        //Click in "login-btn"
        driver.findElement(By.className("login-btn")).click();

        //Found search box element using xpath and id attribute
        WebElement searchBox= driver.findElement(By.xpath("//input [@id=\'search-textbox-input\']"));

        //Write in the search box: "Activity Stream" and click search
        searchBox.sendKeys("Activity Steram"+"\n");




        Thread.sleep(2000);
        driver.quit();
    }
}
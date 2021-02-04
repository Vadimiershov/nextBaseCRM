package UserStory3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchBox {

    public static void main(String[] args) throws InterruptedException {

        //Setup
        WebDriverManager.chromedriver().setup();

        //Create instance of the browser
        WebDriver driver = new ChromeDriver();

        //Go to this website "http://login2.nextbasecrm.com/"
        driver.get("http://login2.nextbasecrm.com/");
        Thread.sleep(2000);

        //Enter userLogin marketing
        driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing51@cybertekschool.com");
        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);

        //click on login
        driver.findElement(By.className("login-btn")).click();

        //Found search box element using id
        WebElement searchBox= driver.findElement(By.id("search-textbox-input"));


        //Write in the search box: "Activity Stream"
       searchBox.sendKeys("Activity Stream"+"\n");


        //driver.back()
        driver.navigate().back();

        searchBox.sendKeys("Employees"+"\n");


        //Locate the searchBox

       // searchBox.sendKeys("Tasks"+"\n");
      //  driver.navigate().back();
        //searchBox.sendKeys("Tasks"+"\n");
       // driver.navigate().back();
       // searchBox.sendKeys("Chats and Calls");

       // driver.navigate().back();



        // Use try and catch for exception
            Thread.sleep(5000);
            driver.close();
        }
    }












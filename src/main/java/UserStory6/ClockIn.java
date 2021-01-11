package UserStory6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClockIn {
    public static void main(String[] args) {
  //setup
  WebDriverManager.chromedriver().setup();
  //create instance of the browser
        WebDriver driver = new ChromeDriver();
        //go to this website "http://login2.nextbasecrm.com/"
        driver.get("http://login2.nextbasecrm.com/");
        //enter userLogin
        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr51@cybertekschool.com");

    }
}

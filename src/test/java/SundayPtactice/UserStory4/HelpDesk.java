package SundayPtactice.UserStory4;
import SundayPtactice.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class HelpDesk {


  @BeforeClass (description = "Setting up Driver ")
    public void setUpClass(){           // make sure we create method and then call existing one
      Driver.setUpDriver();                 // taken from Driver class
  }






  @Test (description = "Verify users can write a poll message title with question & answer US4 TOD G26-46")
    public void TC1_G26_54(){
    WebDriver localChromeDriver = Driver.getDriver(); // return type was chromeDriver
    Urls newUrlsUS4 = new Urls(); //setting up url
    localChromeDriver.get(newUrlsUS4.nextbasecrm); // sending link

    Users userHelp51 = new Users(); // setting up a new User
    Login loginPage = new Login(); // setting up Login
    loginPage.login(); // login method for user HelpDesk51

    //===============================================================================
    // Created poll
    HomePage homePage = new HomePage();

    Driver.implicitWait(); // added 5 sec implicit wait

    homePage.poll.click();
    localChromeDriver.switchTo().frame(0);
    WebElement pollMessage = localChromeDriver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
    pollMessage.clear();
    pollMessage.sendKeys("Practice Automated Test Case");















  }



}














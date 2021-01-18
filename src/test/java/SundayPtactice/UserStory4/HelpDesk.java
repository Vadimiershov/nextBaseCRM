package SundayPtactice.UserStory4;
import SundayPtactice.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class HelpDesk {


  @BeforeClass (description = "Setting up Driver ")
   public void setUpClass(){           // make sure we create method and then call existing one
      Driver.setUpDriver();                 // taken from Driver class
  }




  @Test (description = "Verify users can write a poll message title with question & answer US4 TOD G26-46")
    public void TC1_G26_54() {
    WebDriver localChromeDriver1 = Driver.getDriver(); // return type was chromeDriver
//====================
    Urls newUrlsUS4 = new Urls(); //setting up url
    localChromeDriver1.get(newUrlsUS4.nextbasecrm); // sending link

    Login loginPage1 = new Login(); // setting up Login
    loginPage1.login51Marketing(); // login method for user HelpDesk51

    //===============================================================================
    // Created poll
    HomePage homePage = new HomePage();

    Driver.implicitWait(); // added 5 sec implicit wait

    homePage.poll.click();
  //  localChromeDriver.switchTo().frame(0);
  //  WebElement pollMessage = homePage.poll;
   // pollMessage.clear();
  //  pollMessage.sendKeys("Practice Automated Test Case");

  }


    @AfterMethod
    public static void logOut(){
      Driver.killDriver();


    }

   // String expectedPollMessage = "Practice Automated Test Case";
// String actualPollMessage = pollMessage.getText();

//Assert.assertEquals(expectedPollMessage,actualPollMessage, "Let's see if poll message is matching what we have entered ");



    //// Setting up expected and actual
    //        String expectedUsername = users.user51;
    //        HomePage homePage = new HomePage();
    //        String actualUsername = homePage.loggedInUsername.getText();
    //// Asserting values
    //        Assert.assertEquals(actualUsername, expectedUsername, "Your actual username was different than expected!!!!!");
    //
    //       Driver.killDriver();
    //    }





//  WebElement findPoll = crmUS4.driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
//            findPoll.click();
//            Thread.sleep(2000);
//
//            //WebElement pollTitle = crmUS4.driver.findElement(By.xpath("//input[@id='POST_TITLE']"));
//
//            //pollTitle.clear(); // to clear message that is being duplicated
//            //pollTitle.sendKeys("Automation Testing Practice User Story #4");
//
//            crmUS4.driver.switchTo().frame(0); // 0-parent frame
//            WebElement pollMessage = crmUS4.driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));
//
//            pollMessage.clear();
//            pollMessage.sendKeys("Selenium practice");
//
//            crmUS4.driver.switchTo().parentFrame(); // to return
//            WebElement pollQuestion = crmUS4.driver.findElement(By.xpath("//input[@id=\"question_0\"]"));
//            pollQuestion.clear();
//            pollQuestion.sendKeys("How long did it take me to automate user Story#4?");
//            Thread.sleep(2000);
//
//            WebElement answer1 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  1']"));
//            answer1.clear();
//            answer1.sendKeys("3 hours");
//            Thread.sleep(2000);
//
//            WebElement answer2 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  2']"));
//            answer2.clear();
//            answer2.sendKeys("6 hours");
//            Thread.sleep(2000);
//
//            WebElement answer3 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  3']"));
//             answer3.clear();
//            answer3.sendKeys("Longer than today's Java class ");
//            Thread.sleep(2000);
//
//            WebElement allowMultipleChoices = crmUS4.driver.findElement(By.xpath("//input[@id='multi_0']"));
//            allowMultipleChoices.click();
//            Thread.sleep(2000);
//
//                WebElement addRecipients = crmUS4.driver.findElement(By.xpath("//div[@id='feed-add-post-destination-container]"));
//                addRecipients.clear();
//
//                ////span/input[@id='feed-add-post-destination-input']
//
//            //    addRecipients.sendKeys("helpdesk52@cybertekschool.com");
//
//
//        }
//    }











  }

















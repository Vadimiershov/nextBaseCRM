package UserStory4;

import CRMNextBaseProject.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1_G26_54 {


    @BeforeMethod(description = "setting up driver")
    public void setUpDriver1(){
        CRMNextBaseProject.Driver.setUpDriver();
        CRMNextBaseProject.Driver.navigateToURL(Data.url);

    }

    @Test(description = "Verify HR51 and HR52 users can create a poll message with question & answer US4 TOD G26-46")
    public void pollHRs() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();
     // Poll creation for HR51

        HomePage homePage = new HomePage();
        homePage.pollButton.click();
        ThreadSleep.threadSleep(5);
        Driver.getDriver().switchTo().frame(0);

      //  homePage.messagePoll.clear();

        homePage.messagePoll.sendKeys("Test Case Automation");
        Driver.getDriver().switchTo().parentFrame();
        homePage.pollQuestion.sendKeys("Why is it taking soooo long to automate");

        homePage.answer1.clear();
        homePage.answer1.sendKeys("Study more");

        homePage.answer2.clear();
        homePage.answer2.sendKeys("Let it go");

        homePage.answer3.clear();
        homePage.answer3.sendKeys("Whatever");
        homePage.clearRecipientsPoll.click();
        homePage.removeAllEmployee.click();
        homePage.addRecipientHD51.click();





        // logout
        // login with HR52
        // repeat steps

    }

    /**
    @Test(description = "Verify Marketing 51 and 52 users can create a poll message with question & answer US4 TOD G26-46")
    private void pollCrationMarketing() {
        Runner runner = new Runner();
        runner.Login();
    }

    @Test(description = "Negative")
    private void negativeEmptyQuestions() {

    }

    @Test(description = "Negative")
    private void negativeEmptyAnswers() {

    }

   // @AfterMethod
   // public void tearDown(){
    //    Driver.killDriver();

 **/

    }







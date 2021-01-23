package UserStory5;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import CRMNextBaseProject.HomePage;
import CRMNextBaseProject.ThreadSleep;
import org.testng.Assert;


public class PollCreatingPrecondition extends Driver {
//!!! change questionInPoll in DATA class for success verification and creation poll


    public void Poll() {

        HomePage homePage = new HomePage();

        homePage.pollButton.click();
        ThreadSleep.threadSleep(5);
        Driver.getDriver().switchTo().frame(0);
        homePage.messagePoll.clear();

        homePage.messagePoll.sendKeys(Data.messageInPoll);
        Driver.getDriver().switchTo().parentFrame();
        homePage.pollQuestion.sendKeys(Data.questionInPoll);

        homePage.answer1.clear();
        homePage.answer1.sendKeys(Data.answer1);

        homePage.answer2.clear();
        homePage.answer2.sendKeys(Data.answer2);

        homePage.answer3.clear();
        homePage.answer3.sendKeys(Data.answer3);

        //hr52, marketing52, helpdesk52 will participate in poll
        homePage.allEmployeesCancel.click();
        homePage.addPersonLink.click();
        homePage.addPersonField.sendKeys(Data.hr52);
        homePage.peopleAdded.click();
        homePage.addPersonField.click();
        homePage.addPersonField.sendKeys(Data.marketing52);
        homePage.peopleAdded.click();
        homePage.addPersonField.click();
        homePage.addPersonField.sendKeys(Data.helpdesk52);
        homePage.peopleAdded.click();

        homePage.sendPoll.click();

        Assert.assertEquals(homePage.createdPollQuestion.getText(), Data.questionInPoll,"Poll successfully created");

    }
}

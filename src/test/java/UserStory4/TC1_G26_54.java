package UserStory4;

import CRMNextBaseProject.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static CRMNextBaseProject.Driver.getDriver;

public class TC1_G26_54 {


    @BeforeMethod(description = "setting up driver")
    public void setUpDriver1() {
        CRMNextBaseProject.Driver.setUpDriver();
        CRMNextBaseProject.Driver.navigateToURL(Data.url);

    }

    @Test(description = "Verify HR51, Marketing51,  users can create a poll message with question & answer US4 TOD G26-46")
    public void pollHRMarket51() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();
        // Poll creation for HR51

        HomePage homePage = new HomePage();
        homePage.pollButton.click();
        ThreadSleep.threadSleep(5);
        getDriver().switchTo().frame(0);

        homePage.messagePoll.clear();

        Faker fakerForPoll = new Faker();
        String fakerText = fakerForPoll.friends().quote();

        homePage.messagePoll.sendKeys(fakerText);
        getDriver().switchTo().parentFrame();
        ThreadSleep.threadSleep(2);
        homePage.pollQuestion.clear();
        ThreadSleep.threadSleep(2);
        homePage.pollQuestion.sendKeys(fakerForPoll.friends().quote());

        homePage.answer1.clear();
        homePage.answer1.sendKeys(fakerForPoll.friends().quote());

        homePage.answer2.clear();
        homePage.answer2.sendKeys(fakerForPoll.friends().quote());

        homePage.answer3.clear();
        homePage.answer3.sendKeys(fakerForPoll.friends().quote());

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
        ThreadSleep.threadSleep(3);

        WebElement createdPollOnFeed = getDriver().findElement(By.xpath("//div[contains(text(), '" + fakerText + "')]"));

        Assert.assertTrue(createdPollOnFeed.isDisplayed(), "Poll text was not found!!!!!!");

        ThreadSleep.threadSleep(3);
        LogOut logout = new LogOut();
        logout.setLogOut();
//=========================================================
        //Logging in under user Marketing51
        LogIn loginPageMR51 = LogIn.getInstance();
        loginPageMR51.loginMarketing51();
        // Poll creation for HR51

        HomePage homePageMR51 = new HomePage();
        homePageMR51.pollButton.click();
        ThreadSleep.threadSleep(5);
        getDriver().switchTo().frame(0);


        homePageMR51.messagePoll.clear();


        Faker fakerForPoll2 = new Faker();
        String fakerText2 = fakerForPoll2.chuckNorris().fact();

        homePageMR51.messagePoll.sendKeys(fakerText2);
        getDriver().switchTo().parentFrame();
        homePageMR51.pollQuestion.clear();
        homePageMR51.pollQuestion.sendKeys(fakerText2);

        homePageMR51.answer1.clear();
        homePageMR51.answer1.sendKeys(fakerText2);

        homePageMR51.answer2.clear();
        homePageMR51.answer2.sendKeys(fakerText2);

        homePageMR51.answer3.clear();
        homePageMR51.answer3.sendKeys(fakerText2);

        homePage.allEmployeesCancel.click();
        homePage.addPersonLink.click();
        homePage.addPersonField.sendKeys(Data.hr52);
        ThreadSleep.threadSleep(2);
        homePage.peopleAdded.click();
        homePage.addPersonField.click();
        homePage.addPersonField.sendKeys(Data.marketing52);
        ThreadSleep.threadSleep(2);
        homePage.peopleAdded.click();
        homePage.addPersonField.click();
        homePage.addPersonField.sendKeys(Data.helpdesk52);
        ThreadSleep.threadSleep(2);
        homePage.peopleAdded.click();
        ThreadSleep.threadSleep(2);
        homePage.sendPoll.click();
        ThreadSleep.threadSleep(2);
        WebElement createdPollOnFeed2 = getDriver().findElement(By.xpath("//div[contains(text(), '" + fakerText2 + "')]"));
        ThreadSleep.threadSleep(5);
        Assert.assertTrue(createdPollOnFeed2.isDisplayed(), "Poll text was not found!!!!!!");

    }

    @AfterMethod
    public void tearDownMethod() {
        Driver.killDriver();
    }









            }







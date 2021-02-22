package UserStory7;

import CRMNextBaseProject.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC2_G26_67 {
    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify users can see how many people viewed a post ")
    public void viewedUser() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginHR51();
        HomePage homePage = new HomePage();
        ThreadSleep.threadSleep(2);
        homePage.viewedPost.isDisplayed();
        if (homePage.viewedPost.isDisplayed()){
            System.out.println("users can see how many people viewed a post.Verification is pass");
        }else{
            System.out.println("Fail");
        }
        logout.setLogOut();


        loginPage1.loginMarketing51();

        ThreadSleep.threadSleep(2);
        homePage.viewedPost.isDisplayed();
        if (homePage.viewedPost.isDisplayed()){
            System.out.println("users can see how many people viewed a post.Verification is pass");
        }else{
            System.out.println("Fail");
        }
        logout.setLogOut();

        loginPage1.loginHelpDeck52();

        ThreadSleep.threadSleep(2);
        homePage.viewedPost.isDisplayed();
        if (homePage.viewedPost.isDisplayed()){
            System.out.println("users can see how many people viewed a post.Verification is pass");
        }else{
            System.out.println("Fail");
        }
        logout.setLogOut();


    }}

package UserStory14;

import CRMNextBaseProject.*;
import org.testng.annotations.*;

public class TC1_G26_47 {


    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHR1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage1 = LogIn.getInstance();
        loginPage1.loginHR51();
        LogOut logout = new LogOut();
        logout.setLogOut();
        Driver.killDriver();

    }

    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHR2() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage2 = LogIn.getInstance();
        loginPage2.loginHR52();
        LogOut logout = new LogOut();
        logout.setLogOut();
        Driver.killDriver();

    }


/*

    @Test(description = "Verify Marketing Team can logout and back to login page")
    public void logOutMarketingTeam() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage2 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage2.loginMarketing51();
        logout.setLogOut();;
        Driver.killDriver();
        ThreadSleep.threadSleep(3);

        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        loginPage2.loginMarketing52();
        logout.setLogOut();
        Driver.killDriver();
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Help Deck Team can logout and back to login page")
    public void logOutHelpDeckTeam() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage3 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage3.loginHelpDeck51();
        logout.setLogOut();
        Driver.killDriver();
        ThreadSleep.threadSleep(3);

        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        loginPage3.loginHelpDeck52();
        logout.setLogOut();
        Driver.killDriver();
        ThreadSleep.threadSleep(3);
    }

*/




}
/*
    @BeforeMethod
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHRTeam() {

        LogIn loginPage1 = LogIn.getInstance();
        loginPage1.loginHR51();


        LogOutPage.logOut(loginPage1);
        loginPage1.loginBox.clear();
        ThreadSleep.threadSleep(3);

        loginPage1.loginHR52();
        LogOutPage.logOut(loginPage1);
        loginPage1.loginBox.clear();
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Marketing Team can logout and back to login page")
    public void logOutMarketingTeam() {
        LogIn loginPage2 = LogIn.getInstance();
        loginPage2.loginMarketing51();
        LogOutPage.logOut(loginPage2);
        loginPage2.loginBox.clear();
        ThreadSleep.threadSleep(3);

        loginPage2.loginMarketing52();
        LogOutPage.logOut(loginPage2);
        loginPage2.loginBox.clear();
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Help Deck Team can logout and back to login page")
    public void logOutHelpDeckTeam() {
        LogIn loginPage3 = LogIn.getInstance();
        loginPage3.loginHelpDeck51();
        LogOutPage.logOut(loginPage3);
        loginPage3.loginBox.clear();
        ThreadSleep.threadSleep(3);

        loginPage3.loginHelpDeck52();
        LogOutPage.logOut(loginPage3);
        loginPage3.loginBox.clear();
        ThreadSleep.threadSleep(3);
    }

    @AfterClass
    public void closeWebPage() {
        Driver.killDriver();
        ThreadSleep.threadSleep(3);
    }

*/


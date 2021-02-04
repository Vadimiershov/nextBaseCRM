package UserStory14;

import CRMNextBaseProject.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*public class TC1_G26_47 {

    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHRTeam(){
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
    public void logOutMarketingTeam(){
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
    public void logOutHelpDeckTeam(){
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
    public void closeWebPage(){
        Driver.killDriver();
        ThreadSleep.threadSleep(3);
    }




}
*/
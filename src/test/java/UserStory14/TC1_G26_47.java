package UserStory14;

import CRMNextBaseProject.*;
import org.testng.annotations.*;

public class TC1_G26_47 {

    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHRTeam() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginHR51();
        logout.setLogOut();
        loginPage1.loginBox.clear();
        ThreadSleep.threadSleep(3);

        LogIn loginPage2 = LogIn.getInstance();

        loginPage2.loginHR52();
        logout.setLogOut();
        loginPage2.loginBox.clear();
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Marketing Team can logout and back to login page")
    public void logOutMarketingTeam() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginMarketing51();
        logout.setLogOut();
        loginPage1.loginBox.clear();
        ThreadSleep.threadSleep(3);

        LogIn loginPage2 = LogIn.getInstance();

        loginPage2.loginMarketing52();
        logout.setLogOut();
        loginPage2.loginBox.clear();
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Help Deck Team can logout and back to login page")
    public void logOutHelpDeckTeam() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginHelpDeck51();
        logout.setLogOut();
        loginPage1.loginBox.clear();
        ThreadSleep.threadSleep(3);

        LogIn loginPage2 = LogIn.getInstance();

        loginPage2.loginHelpDeck52();
        logout.setLogOut();
        loginPage2.loginBox.clear();
    }

    @AfterClass
    public void closeWebPage() {
        Driver.killDriver();
        ThreadSleep.threadSleep(3);
    }

}
/*
    @Test(description = "Verify HR Team can logout and back to login page")
    public void logOutHR1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage1 = LogIn.getInstance();

        LogOut logout = new LogOut();

        loginPage1.loginHR51();
        logout.setLogOut();

        Driver.killDriver();
        ThreadSleep.threadSleep(3);

       // Driver.setUpDriver();
       // Driver.navigateToURL(Data.url);

       // LogIn loginPage2 = LogIn.getInstance();

       // loginPage2.loginHR52();
       // logout.setLogOut();
       // Driver.killDriver();
      //  ThreadSleep.threadSleep(3);


}

    @Test(description = "Verify Marketing Team can logout and back to login page")
    public void logOutMarketingTeam() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage3 = LogIn.getInstance();

        LogOut logout = new LogOut();

        loginPage3.loginMarketing51();
        logout.setLogOut();

        Driver.killDriver();
        ThreadSleep.threadSleep(3);

     //   Driver.setUpDriver();
       // Driver.navigateToURL(Data.url);

      //  LogIn loginPage4 = LogIn.getInstance();

      //  loginPage4.loginMarketing52();
      //  logout.setLogOut();

      //  Driver.killDriver();
      //  ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify Help Deck Team can logout and back to login page")
    public void logOutHelpDeckTeam() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

        LogIn loginPage5 = LogIn.getInstance();

        LogOut logout = new LogOut();

        loginPage5.loginHelpDeck51();
        logout.setLogOut();

        Driver.killDriver();
        ThreadSleep.threadSleep(3);

       // Driver.setUpDriver();
       // Driver.navigateToURL(Data.url);

     //   LogIn loginPage6 = new LogIn();

      //  loginPage6.loginHelpDeck52();
     //   logout.setLogOut();

       // Driver.killDriver();
       // ThreadSleep.threadSleep(3);
    }
*/
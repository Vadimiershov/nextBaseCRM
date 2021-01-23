package UserStory5;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import CRMNextBaseProject.LogIn;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {


    //WebDriver localDriver;
    @BeforeMethod(description = "Setting up driver")

    private void setupMethod() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
    }

    @Test
    public void loginTest() {

        LogIn login = new LogIn();
        login.loginHR51();
        PollCreatingPrecondition pollCreatingPrecondition = new PollCreatingPrecondition();
        pollCreatingPrecondition.Poll();

    }

    //@AfterMethod(description = "Killing Driver")
    //private void killingDriver() {
     //   Driver.killDriver();
   // }


   /* @Test(description = "Login-LogOut scenario")
    public void loginLogOutTest() throws InterruptedException {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();    //login as hr51
        Thread.sleep(2000);
        LogOut logout = new LogOut();
        logout.setLogOut();
        Thread.sleep(2000);
        loginPage.loginHR52();
    }

    /*@Test(description = "Test poll creation scenario")
    public void T1PollCreation() throws InterruptedException {
        LogIn loginPage = new LogIn();
        loginPage.loginHR51();    //login as hr51
        Thread.sleep(2000);
        PollCreating poll = new PollCreating();
        poll.Poll();
        LogOut logout = new LogOut();
        logout.setLogOut();
        Thread.sleep(2000);
        loginPage.loginHR52();

    }

    @Test
    public void T2PollVerifying() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR52();
    }
*/
}






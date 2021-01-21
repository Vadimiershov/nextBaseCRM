package UserStory5;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.LogIn;
import CRMNextBaseProject.LogOut;
import CRMNextBaseProject.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {


    /*@BeforeMethod
    public void setUpMethod() throws InterruptedException {


        Driver.setChromedriver(); //setting up Chrome driver
        WebDriver localDriver = Driver.getDriver();  // creating new local driver
        Data urlMain = new Data(); //url object created
        localDriver.get(urlMain.url); //navigate to Login Page
        Thread.sleep(2000);

    }
    */
    WebDriver localDriver;
    @BeforeMethod(description = "Setting up driver")

    private void setupMethod() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        //WebDriver chromedriver = Driver.getDriver();

    }

    @AfterMethod(description = "Killing Driver")
    private void killingDriver() {
        Driver.killDriver();
    }

    @Test
    public void loginTest() throws InterruptedException {

        PollCreating pollCreating = new PollCreating();
        pollCreating.Poll();


    }

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






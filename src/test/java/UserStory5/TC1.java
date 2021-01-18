package UserStory5;

import SundayPtactice.Urls;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
@Test


    public void T1PollCreation() throws InterruptedException {
    Driver.setChromedriver();
    WebDriver localDriver = Driver.getDriver();  // creating new local driver
    Data urlMain = new Data(); //url object created
    localDriver.get(urlMain.url); //navigate to Login Page
    Thread.sleep(2000);
    LogIn loginPage = new LogIn();
    loginPage.loginHR51();    //login as hr51
    Thread.sleep(2000);
    //PollCreating poll = new PollCreating();
    //poll.Poll();
    LogOut logout = new LogOut();
    logout.setLogOut();
   // localDriver.navigate().refresh();
    Thread.sleep(2000);
    loginPage.loginHR52();

    //Driver.killDriver();


}

@Test
        public void T2PollVerifying() {


    Driver.setChromedriver();
    WebDriver localDriver = Driver.getDriver();
    Data urlMain = new Data();
    localDriver.get(urlMain.url); //navigate to Login Page
    LogIn loginPage = new LogIn();
    loginPage.loginHR52();
    //PollVeryfying pollVer = new PollVeryfying();
    //pollVer.pollVerification();

    //LogOut logout = new LogOut();
    //logout.setLogOut();
    //Driver.killDriver();

}


    }






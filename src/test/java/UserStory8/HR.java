package UserStory8;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import CRMNextBaseProject.HomePage;
import CRMNextBaseProject.LogIn;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HR {
    WebDriver chromeDriver;
    @BeforeMethod(description = "setting up driver")
    public void setUpDriver1(){
        CRMNextBaseProject.Driver.setUpDriver();
        CRMNextBaseProject.Driver.navigateToURL(Data.url);

    }




    @Test(description = "Verify users can write a poll message title with question & answer US4 TOD G26-46")
    public void Login() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();
        HomePage homePage = new HomePage();
       homePage.pollButton.click();



    }





        @AfterMethod
        public void tearDown () {
            Driver.killDriver();
        }
    }


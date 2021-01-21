package CRMNextBaseProject;

import UserStory1.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    @BeforeMethod(description = "setting up some veriables")
    public void setUpDriver(){
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);

    }

    @Test(description = "One single scenario dedicated to Login only, happy path")
    public void Login() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();


    }

    @AfterMethod
    public void tearDown(){
        Driver.killDriver();
    }




    }



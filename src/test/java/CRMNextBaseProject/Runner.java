package CRMNextBaseProject;

import UserStory1.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    @BeforeMethod(description = "setting up some veriables")

    @Test(description = "One single scenario dedicated to Login only, happy path")
    public void Login() {
        Driver.setUpDriver();
        WebDriver localChromeDriver = Driver.getDriver();
        Data url = new Data();
        localChromeDriver.get(url.url);
        Data users = new Data();
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();



       Driver.killDriver();
    }




    }



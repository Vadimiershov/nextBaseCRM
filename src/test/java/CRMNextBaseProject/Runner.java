package CRMNextBaseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    @BeforeMethod(description = "setting up some veriables")

    @Test(description = "One single scenario dedicated to Login only, happy path")
    public void Login() {
        Driver.setUpDriver();
        WebDriver localChromeDriver = Driver.getDriver();
        Urls url = new Urls();
        localChromeDriver.get(url.nextbasecrm);
        Users users = new Users();
        Login loginPage = new Login();
        loginPage.login();
// Setting up expected and actual
        String expectedUsername = users.user51;
        HomePage homePage = new HomePage();
        String actualUsername = homePage.loggedInUsername.getText();
// Asserting values
        Assert.assertEquals(actualUsername, expectedUsername, "Your actual username was different than expected!!!!!");

       Driver.killDriver();
    }

    @Test(description = "One single scenario to create poll")
    public void Poll() {
        Driver.setUpDriver();
        WebDriver localChromeDriver = Driver.getDriver();
        Urls url = new Urls();
        localChromeDriver.get(url.nextbasecrm);
        Login loginPage = new Login();
        loginPage.login();
// Created poll
        HomePage homePage = new HomePage();
        homePage.poll.click();
        ThreadSleep.threadSleep(2);

        localChromeDriver.switchTo().frame(0);
        WebElement pollMessage = localChromeDriver.findElement(By.xpath("//body[@contenteditable='true']"));
        pollMessage.clear();
        pollMessage.sendKeys("Some message");


    }

}

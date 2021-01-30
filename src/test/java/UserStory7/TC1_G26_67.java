package UserStory7;

import CRMNextBaseProject.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC1_G26_67 {

    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(5);
    }

    @Test(description = "Verify users can like a post (message, task, poll, event, etc)")
    public void Like() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();
        HomePage homePage = new HomePage();
        homePage.likeButton.click();
        ThreadSleep.threadSleep(5);

        homePage.userBlock.click();
        homePage.logOutLink.click();
    }
    @Test
    public void like() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR52();
        HomePage homePage = new HomePage();
        homePage.likeButton.click();
        ThreadSleep.threadSleep(5);

        homePage.userBlock.click();
        homePage.logOutLink.click();
    }

}

package UserStory7;

import CRMNextBaseProject.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC1_G26_67 {

    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify users can like and follow a post ")
    public void likeFollow() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginHR51();
        HomePage homePage = new HomePage();
        ThreadSleep.threadSleep(2);


        homePage.likeButton.click();
      //  homePage.followButton.click();
        Assert.assertTrue(homePage.likeButtonIsDisplayed.isDisplayed());
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        //wait.until(ExpectedConditions.invisibilityOf(homePage.likeButtonIsDisplayed));
        homePage.likeButton.click();


        logout.setLogOut();


   /* loginPage1.loginMarketing51();
          homePage.likeButton.click();
          homePage.followButton.click();
       //  Assert.assertTrue(homePage.likeButton.isDisplayed());
       logout.setLogOut();



       loginPage1.loginHelpDeck52();
       homePage.likeButton.click();
       homePage.followButton.click();
       ThreadSleep.threadSleep(1);
       //  Assert.assertTrue(homePage.likeButton.isDisplayed());
       logout.setLogOut();*/


    }
}

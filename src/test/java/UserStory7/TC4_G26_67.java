package UserStory7;

import CRMNextBaseProject.*;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC4_G26_67 {

    @BeforeClass
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }

    @Test(description = "Verify users can save a post as a favorite.")
    public void saveFavorite() {

        LogIn loginPage1 = LogIn.getInstance();
        LogOut logout = new LogOut();

        loginPage1.loginHR52();
        HomePage homePage = new HomePage();
        ThreadSleep.threadSleep(2);


        homePage.commentBody.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
        homePage.typeComment.sendKeys("test");
        Driver.getDriver().switchTo().defaultContent();
        homePage.sendButton.click();






}}

package UserStory7;

import CRMNextBaseProject.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC3_G26_67 {

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
       //homePage.favoriteStar.clear();
        homePage.favoriteStar.click();



    }}

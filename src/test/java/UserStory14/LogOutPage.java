package UserStory14;

import CRMNextBaseProject.*;
import org.testng.annotations.Test;

public class LogOutPage {

    public static void logOut(LogIn logInPage){
        HomePage homePage1 = new HomePage();
        homePage1.userBlock.click();
        homePage1.logOutLink.click();
    }
/*
    public void setUpDriver1() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        ThreadSleep.threadSleep(3);
    }
    
 */

}

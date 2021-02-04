package UserStory14;

import CRMNextBaseProject.HomePage;
import CRMNextBaseProject.LogIn;
import org.testng.annotations.Test;

public class LogOutPage {
    @Test
    public static void logOut(LogIn logInPage){
        HomePage homePage1 = new HomePage();
        homePage1.userBlock.click();
        homePage1.logOutLink.click();
    }

}

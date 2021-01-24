package CRMNextBaseProject;

import UserStory5.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogOut extends Driver {

    public void setLogOut()  {
        HomePage homePage = new HomePage();
        homePage.userBlock.click();
        homePage.logOutLink.click();

    }



}

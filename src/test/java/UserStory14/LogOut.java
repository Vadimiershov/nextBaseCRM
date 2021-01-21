package UserStory14;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOut {


    @BeforeMethod
    public void setUpDriver1() throws InterruptedException {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
        Thread.sleep(2000);
    }
    @Test
    public void logOut(){



    }





}

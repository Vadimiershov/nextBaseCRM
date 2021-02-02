package UserStory8;

import CRMNextBaseProject.*;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HR {
    WebDriver chromeDriver;

    @BeforeSuite(description = "setting up driver")
    public void setUpDriver1() {
        CRMNextBaseProject.Driver.setUpDriver();
        CRMNextBaseProject.Driver.navigateToURL(Data.url);

    }

    @Test(description = "US8 TC#1 Verify only hr and marketing team members can access to Task module.")
    //HR
    public void Login() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginHR51();
        HomePage homePage = new HomePage();
        homePage.taskModule.click();
        String expectedTitle = "My tasks";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        ThreadSleep.threadSleep(5);
    }

    @Test(description = "US8 TC#3 Verify users can see all the task on task page. ")
    //HR
    public void checkAllTasks() {
        HomePage homePage = new HomePage();
        homePage.allCheckbox.click();
        Assert.assertTrue(homePage.allCheckbox.isSelected(), "All checkbox is not selected");
        Assert.assertEquals(homePage.totalTaskNumberChecked.getText(), homePage.totalTaskNumberActual.getText(),
                "Total task number differ");
    }

    @Test(description = "US8 TC#4 Verify users can access to any module by one click. ")
    public void verifyModuleAccess() {
        HomePage homePage = new HomePage();
        for (WebElement each : homePage.listOfModules) {
            try {
                each.click();
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            ThreadSleep.threadSleep(3);
        }


    }


    @AfterSuite
    public void tearDown() {
        Driver.killDriver();
    }
}


package UserStory12;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import CRMNextBaseProject.FilterSearchPage;
import CRMNextBaseProject.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Filter_Search {

    @BeforeMethod
    private void setUpDriver(){
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
    }

    @Test
    public void Filter() throws InterruptedException {
        LogIn logIn = new LogIn();
        FilterSearchPage filterSearchPage = new FilterSearchPage();

        logIn.loginHR52();
        filterSearchPage.FilterAndSearchBox.click();
        Thread.sleep(2000);
        filterSearchPage.DateDropBox.click();
        filterSearchPage.Date_CurrentDay.click();
        filterSearchPage.TypeDropBox.click();
        filterSearchPage.Type_Polls.click();
        filterSearchPage.EmptyField.click();
        Thread.sleep(2);
        filterSearchPage.Author.click();



    }


}

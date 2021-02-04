package UserStory3;

import CRMNextBaseProject.Data;
import CRMNextBaseProject.Driver;
import CRMNextBaseProject.HomePage;
import CRMNextBaseProject.LogIn;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBox {

    @BeforeMethod(description = "setUp Method")
    public void setUpDriver1() {

        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
    }

    @Test(description = "Search box")
    public void searchBoxMarketing51() {
        LogIn loginPage = LogIn.getInstance();
        loginPage.loginMarketing51();

        HomePage homePage = new HomePage();
        homePage.searchBox2.sendKeys("people");
        homePage.searchBox2.click();
        homePage.searchBox2.clear();

        homePage.searchBox2.sendKeys("Documents");
        homePage.searchBox2.click();
        homePage.searchBox2.clear();

        homePage.searchBox2.sendKeys("More");
        homePage.searchBox2.click();
        homePage.searchBox2.clear();


    }

    // @AfterMethod
    //  public void quit() {
    //     Driver.getDriver().close();




}

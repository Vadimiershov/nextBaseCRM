package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterSearchPage {

    public FilterSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(how = How.CSS, using = "#LIVEFEED_search")
    public WebElement FilterAndSearchBox; //Field for access the table for search and filter

    @FindBy(how = How.XPATH, using = "//div[@class='main-ui-control-field']")
    public WebElement DateDropBox; //Any date drop box

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Current day')]")
    public WebElement Date_CurrentDay; //

    @FindBy(how = How.CSS,using = "div[class='main-ui-control main-ui-multi-select']")
    public WebElement TypeDropBox; //Any type for search in dropBox

    @FindBy(how = How.XPATH,using = "//div[text()='Polls']")
    public WebElement Type_Polls; //

    @FindBy(how = How.XPATH,using = "//input[@name='CREATED_BY_ID_label']")
    public WebElement Author;

    @FindBy(how = How.CSS,using = ".main-ui-control-field-label")
    public WebElement EmptyField;



}

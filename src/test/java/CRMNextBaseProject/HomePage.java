package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(how = How.XPATH, using = "(//span[@class='feed-add-post-form-link'])[3]//span")
    public WebElement pollButton;

    @FindBy(how = How.XPATH, using = "//body[@contenteditable='true']")
    public WebElement messagePoll;

    @FindBy(how = How.XPATH, using = "//input[@id='question_0']")
    public WebElement pollQuestion;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Answer  1']")
    public WebElement answer1;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Answer  2']")
    public WebElement answer2;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Answer  3']")
    public WebElement answer3;

    @FindBy(how = How.XPATH, using = "//a[@title='Tasks']")
    public WebElement taskModule;

    @FindBy(how = How.XPATH,using = "//input[@title='Check All / Uncheck All'][1]")
    public WebElement allCheckbox;

    @FindBy(how = How.XPATH,using = "//span[@class='main-grid-counter-selected'][1]")
    public WebElement totalTaskNumberChecked;

    @FindBy(how = How.XPATH,using = "//span[@class='main-grid-counter-displayed'][1]")
    public WebElement totalTaskNumberActual;

    @FindBy(how = How.XPATH,using = "//div[@class='main-buttons']//div")
    public List<WebElement>listOfModules;

}
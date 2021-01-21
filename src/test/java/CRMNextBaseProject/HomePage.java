package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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



}
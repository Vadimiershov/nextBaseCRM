package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(how = How.XPATH, using = "//div[@id='user-block']")
    public WebElement userBlock; // Personal Block with dropdown menu

    @FindBy(how = How.XPATH, using = "//a[@class='menu-popup-item menu-popup-no-icon '][3]")
    public WebElement logOutLink; //link to log out

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
    //WebElements to invite person to participate in poll by email
    @FindBy(how = How.XPATH, using = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesCancel; //using to cancel to send poll for all employees;

    @FindBy(how = How.XPATH, using = "//a[@id='bx-destination-tag']")
    public WebElement addPersonLink;  //link to click to enter poll recepients;

    @FindBy(how = How.XPATH, using = "//input[@id='feed-add-post-destination-input']")
    public WebElement addPersonField;  //field to enter poll recepients;

    @FindBy(how = How.XPATH, using = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement peopleAdded; //to add person in PersonField;

    @FindBy(how = How.XPATH, using = "//button[@id='blog-submit-button-save']")
    public WebElement sendPoll; //button to send a poll;

    @FindBy(how = How.XPATH, using = "//div[@class='bx-vote-question-title'][1]")
    public WebElement createdPollQuestion; // to verify question text, and poll creating

    @FindBy(how = How.XPATH, using = "//a[@title='Tasks']")
    public WebElement taskModule;//changes



    // Galyna added for poll creation to be moved to PollCreation class when Vadym does merge request // 01/23/21

    @FindBy(how = How.XPATH, using = "//div[@id='feed-add-post-destination-container']")
    public WebElement clearRecipientsPoll;

    @FindBy(how = How.XPATH, using = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployee;



    @FindBy(how = How.XPATH, using = "//input[@id='feed-add-post-destination-input']")
    public WebElement addRecipientss ;








}
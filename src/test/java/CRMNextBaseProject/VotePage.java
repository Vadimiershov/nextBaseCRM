package CRMNextBaseProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VotePage {

    public VotePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[.='Study more']//label")
    public WebElement answerRadio1; // radio button to select answer "Study more"

    @FindBy(how = How.XPATH, using = "//span[.='Let it go']//label[1]")
    public WebElement answerRadio2; // radio button to select answer "Let it go"

    @FindBy(how = How.XPATH, using = "//button[.='Stop']")
    public WebElement stopVote;

    @FindBy(how = How.XPATH, using = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement voteButton; // button to click to vote

    @FindBy(how = How.XPATH, using = "//button[.='Results']")
    public WebElement pollResultButton; // button to see poll result

    @FindBy(how = How.XPATH, using = "//a[@class='bx-vote-voted-users'][1]")
    public WebElement votedPeopleNumber; //first web element with first answer to verify poll result

    @FindBy(how = How.XPATH, using = "//button[@class='ui-btn ui-btn-lg ui-btn-link'][1]")
    public WebElement voteAgain;








}

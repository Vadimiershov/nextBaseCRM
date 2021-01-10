package UserStory5;

import UserStory1.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PollCreatingPrecondition {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        Login.logInAsHR51(driver);
        pollCreate(driver);


    }



    public static void pollCreate(WebDriver driver) throws InterruptedException {
        //function which creating a poll without multiple choices for users:
        //hr52@cybertekschool.com, marketing52@cybertekschool.com, helpdesk52@cybertekschool.com

        WebElement findPoll = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
        findPoll.click();
        Thread.sleep(2000);

        driver.switchTo().frame(0); // 0-parent frame
        WebElement pollMessage = driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));
        pollMessage.clear();
        pollMessage.sendKeys("Selenium practice!");

        driver.switchTo().parentFrame(); // to return
        WebElement pollQuestion = driver.findElement(By.xpath("//input[@id=\"question_0\"]"));
        pollQuestion.clear();
        String pollExpectedQuestion = "Question 1?";
        pollQuestion.sendKeys(pollExpectedQuestion);
        Thread.sleep(2000);

        WebElement answer1 = driver.findElement(By.xpath("//input[@placeholder='Answer  1']"));
        answer1.clear();
        answer1.sendKeys("3 hours");
        Thread.sleep(2000);

        WebElement answer2 = driver.findElement(By.xpath("//input[@placeholder='Answer  2']"));
        answer2.clear();
        answer2.sendKeys("6 hours");
        Thread.sleep(2000);

        WebElement answer3 = driver.findElement(By.xpath("//input[@placeholder='Answer  3']"));
        answer3.clear();
        answer3.sendKeys("Longer than today's Java class ");
        Thread.sleep(2000);

        WebElement toallEmloyeesCancel = driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        toallEmloyeesCancel.click();

        WebElement addPersons = driver.findElement(By.xpath("//a[@id='bx-destination-tag']"));
        addPersons.click();

        WebElement inputRecepientsField = driver.findElement(By.xpath("//input[@id='feed-add-post-destination-input']"));
        inputRecepientsField.sendKeys("hr52@cybertekschool.com");


        WebElement peopleAdded = driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        inputRecepientsField.sendKeys("helpdesk52@cybertekschool.com");
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        inputRecepientsField.click();
        inputRecepientsField.sendKeys("marketing52@cybertekschool.com");
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        WebElement sentPollButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sentPollButton.click(); // Poll submitted

        WebElement questionPollTitleVerification = driver.findElement(By.xpath("//div[@class='bx-vote-question-title']"));
        String pollCreatedActualQuestion = questionPollTitleVerification.getText();

        if(pollCreatedActualQuestion.equals(pollExpectedQuestion)){
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Poll successfully created");
        }else{
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Something went wrong!!!");
        }

        WebElement myProfileAvatarButton = driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']"));
        myProfileAvatarButton.click();

        WebElement logOutButton  = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOutButton.click();
        Thread.sleep(2000);


    }



}

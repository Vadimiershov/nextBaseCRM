package UserStory5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.GetDriverMethod;
import utilities.LoginHelpDesk51;
import utilities.LoginHr51;
import utilities.LoginMarketing51;

import java.util.concurrent.TimeUnit;

public class Hr extends LoginHr51{



    public static void main(String[] args) throws InterruptedException {



        GetDriverMethod chromeDriver = new GetDriverMethod();

        chromeDriver.driver.get("https://login2.nextbasecrm.com/stream/");
        WebElement findLogin = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        findLogin.sendKeys("helpdesk51@cybertekschool.com");
        Thread.sleep(2000);
        WebElement findPassword = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        findPassword.sendKeys("UserUser");
        Thread.sleep(2000);
        //WebElement rememberMeOnThisComputer = crmUS4.driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));

        //rememberMeOnThisComputer.click();
        //Thread.sleep(2000);
        WebElement login = chromeDriver.driver.findElement(By.xpath("//input[@type='submit']"));

        Thread.sleep(2000);
        login.click();

        WebElement findPoll = chromeDriver.driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
        findPoll.click();
        Thread.sleep(2000);

        chromeDriver.driver.switchTo().frame(0); // 0-parent frame
        WebElement pollMessage = chromeDriver.driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));

        pollMessage.clear();
        pollMessage.sendKeys("Selenium practice!");

        chromeDriver.driver.switchTo().parentFrame(); // to return
        WebElement pollQuestion = chromeDriver.driver.findElement(By.xpath("//input[@id=\"question_0\"]"));
        pollQuestion.clear();
        String pollExpectedQuestion = "Question 1?";
        pollQuestion.sendKeys(pollExpectedQuestion);
        Thread.sleep(2000);

        WebElement answer1 = chromeDriver.driver.findElement(By.xpath("//input[@placeholder='Answer  1']"));
        answer1.clear();
        answer1.sendKeys("3 hours");
        Thread.sleep(2000);

        WebElement answer2 = chromeDriver.driver.findElement(By.xpath("//input[@placeholder='Answer  2']"));
        answer2.clear();
        answer2.sendKeys("6 hours");
        Thread.sleep(2000);

        WebElement answer3 = chromeDriver.driver.findElement(By.xpath("//input[@placeholder='Answer  3']"));
        answer3.clear();
        answer3.sendKeys("Longer than today's Java class ");
        Thread.sleep(2000);

        WebElement allowMultipleChoices = chromeDriver.driver.findElement(By.xpath("//input[@id='multi_0']"));

        allowMultipleChoices.click();
        Thread.sleep(2000);

        WebElement totallEmloyeesCancel = chromeDriver.driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        totallEmloyeesCancel.click();


        WebElement addPersons = chromeDriver.driver.findElement(By.xpath("//a[@id='bx-destination-tag']"));
        addPersons.click();

        WebElement inputRecepientsField = chromeDriver.driver.findElement(By.xpath("//input[@id='feed-add-post-destination-input']"));


        inputRecepientsField.sendKeys("hr51@cybertekschool.com");


        WebElement peopleAdded = chromeDriver.driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
        chromeDriver.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        peopleAdded.click();

        WebElement sentPollButton = chromeDriver.driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sentPollButton.click(); // Poll submitted

        WebElement questionPollTitleVerification = chromeDriver.driver.findElement(By.xpath("//div[@class='bx-vote-question-title']"));
        String pollCreatedActualQuestion = questionPollTitleVerification.getText();

        if(pollCreatedActualQuestion.equals(pollExpectedQuestion)){
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Poll successfully created");
        }else{
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Something went wrong!!!");
        }

        WebElement myProfileAvatarButton = chromeDriver.driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']"));
        myProfileAvatarButton.click();

        WebElement logOutButton  = chromeDriver.driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOutButton.click();
        Thread.sleep(2000);


        //Hr51 start to login

        try {
            findLogin.sendKeys("hr51@cybertekschool.com");
        }catch (StaleElementReferenceException e){
            findLogin = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            findLogin.clear();
            findLogin.sendKeys("hr51@cybertekschool.com");
        }

        try {
            findPassword.sendKeys("UserUser");
        }catch (StaleElementReferenceException e){
            findPassword = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            findPassword.sendKeys("UserUser");
        }

        try {
            login.click();
        }catch (StaleElementReferenceException e) {
            login = chromeDriver.driver.findElement(By.xpath("//input[@type='submit']"));
            login.click();
        }
        WebElement pollPostTitle = chromeDriver.driver.findElement(By.cssSelector("div#blog_post_body_2885"));
        if(pollPostTitle.getText().equals(pollExpectedQuestion)) {
            System.out.println("Hr successfully see the poll");
        }else{
            System.out.println("Hr can't see the poll");
        }

        WebElement answerCheckbox = chromeDriver.driver.findElement(By.xpath("//label[@for='vote_checkbox_218_570'][1]"));
        answerCheckbox.click();

        WebElement voteButton = chromeDriver.driver.findElement(By.xpath("//button[@data-bx-vote-button='actVoting'][1]"));
        voteButton.click();

        WebElement percentValue = chromeDriver.driver.findElement(By.xpath("//span[@data-bx-vote-result='percent']"));
        System.out.println(percentValue.getText());




    }










    }


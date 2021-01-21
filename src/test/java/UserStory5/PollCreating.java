package UserStory5;

import CRMNextBaseProject.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollCreating extends Driver {

    //

    public void Poll() throws InterruptedException {

        /*

        WebElement userBox = getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userBox.sendKeys("hr51@cybertekschool.com");
        WebElement findPassword = chromedriver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        findPassword.sendKeys("UserUser");
        WebElement login = chromedriver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement findPoll = chromedriver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
        findPoll.click();
        Thread.sleep(2000);

        chromedriver.switchTo().frame(0); // 0-parent frame
        WebElement pollMessage = chromedriver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));
        pollMessage.clear();
        pollMessage.sendKeys("Selenium practice!");

        chromedriver.switchTo().parentFrame(); // to return
        WebElement pollQuestion = chromedriver.findElement(By.xpath("//input[@id=\"question_0\"]"));
        pollQuestion.clear();
        String pollExpectedQuestion = "Question?";
        pollQuestion.sendKeys(pollExpectedQuestion);
        Thread.sleep(2000);

        WebElement answer1 = chromedriver.findElement(By.xpath("//input[@placeholder='Answer  1']"));
        answer1.clear();
        answer1.sendKeys("3 hours");
        Thread.sleep(2000);

        WebElement answer2 = chromedriver.findElement(By.xpath("//input[@placeholder='Answer  2']"));
        answer2.clear();
        answer2.sendKeys("6 hours");
        Thread.sleep(2000);

        WebElement answer3 = chromedriver.findElement(By.xpath("//input[@placeholder='Answer  3']"));
        answer3.clear();
        answer3.sendKeys("Longer than today's Java class ");
        Thread.sleep(2000);

        WebElement toallEmloyeesCancel = chromedriver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
        toallEmloyeesCancel.click();

        WebElement addPersons = chromedriver.findElement(By.xpath("//a[@id='bx-destination-tag']"));
        addPersons.click();

        WebElement inputRecepientsField = chromedriver.findElement(By.xpath("//input[@id='feed-add-post-destination-input']"));
        inputRecepientsField.sendKeys("hr52@cybertekschool.com");


        WebElement peopleAdded = chromedriver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = chromedriver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        inputRecepientsField.sendKeys("helpdesk52@cybertekschool.com");
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = chromedriver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        inputRecepientsField.click();
        inputRecepientsField.sendKeys("marketing52@cybertekschool.com");
        Thread.sleep(2000);
        try {
            peopleAdded.click();
        }catch (StaleElementReferenceException e){
            peopleAdded = chromedriver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            peopleAdded.click();
        }

        WebElement sentPollButton = chromedriver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sentPollButton.click(); // Poll submitted

        WebElement questionPollTitleVerification = chromedriver.findElement(By.xpath("//div[@class='bx-vote-question-title']"));
        String pollCreatedActualQuestion = questionPollTitleVerification.getText();

        if(pollCreatedActualQuestion.equals(pollExpectedQuestion)){
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Poll successfully created");
        }else{
            System.out.println(pollCreatedActualQuestion);
            System.out.println("Something went wrong!!!");
        }









         */
    }
}

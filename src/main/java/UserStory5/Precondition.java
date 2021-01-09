package UserStory5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.GetDriverMethod;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Precondition {

    public static void main(String[] args) throws InterruptedException {


        GetDriverMethod crmUS4 = new GetDriverMethod();

        crmUS4.driver.get("https://login2.nextbasecrm.com/stream/");
        WebElement findLogin = crmUS4.driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        findLogin.sendKeys("helpdesk51@cybertekschool.com");
        //Thread.sleep(2000);
        WebElement findPassword = crmUS4.driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        findPassword.sendKeys("UserUser");
        //Thread.sleep(2000);

        WebElement login = crmUS4.driver.findElement(By.xpath("//input[@type='submit']"));

        //Thread.sleep(2000);
        login.click();

        WebElement findPoll = crmUS4.driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
        findPoll.click();
        Thread.sleep(2000);

        crmUS4.driver.switchTo().frame(0); // 0-parent frame
        WebElement pollMessage = crmUS4.driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));

        pollMessage.clear();
        pollMessage.sendKeys("Selenium practice");

        crmUS4.driver.switchTo().parentFrame(); // to return
        WebElement pollQuestion = crmUS4.driver.findElement(By.xpath("//input[@id=\"question_0\"]"));
        pollQuestion.clear();
        pollQuestion.sendKeys("How long did it take me to automate user Story#4?");
        Thread.sleep(2000);

        WebElement answer1 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  1']"));
        answer1.clear();
        answer1.sendKeys("3 hours");
        Thread.sleep(2000);

        WebElement answer2 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  2']"));
        answer2.clear();
        answer2.sendKeys("6 hours");
        Thread.sleep(2000);

        WebElement answer3 = crmUS4.driver.findElement(By.xpath("//input[@placeholder='Answer  3']"));
        answer3.clear();
        answer3.sendKeys("Longer than today's Java class ");
        Thread.sleep(2000);

        WebElement allowMultipleChoices = crmUS4.driver.findElement(By.xpath("//input[@id='multi_0']"));
        allowMultipleChoices.click();
        Thread.sleep(2000);



            WebElement toallEmloyeesCancel = crmUS4.driver.findElement(By.xpath("//span[@class='feed-add-post-del-but']"));
            toallEmloyeesCancel.click();


            WebElement addPersons = crmUS4.driver.findElement(By.xpath("//a[@id='bx-destination-tag']"));
            addPersons.click();

            WebElement inputRecepientsField = crmUS4.driver.findElement(By.xpath("//input[@id='feed-add-post-destination-input']"));


            inputRecepientsField.sendKeys("hr52@cybertekschool.com");


            WebElement peopleAdded = crmUS4.driver.findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']"));
            crmUS4.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            peopleAdded.click();




        inputRecepientsField.sendKeys("helpdesk52@cybertekschool.com");
        crmUS4.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        peopleAdded.click();



        inputRecepientsField.click();
            inputRecepientsField.sendKeys("marketing52@cybertekschool.com");
        crmUS4.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        peopleAdded.click();




    }
    }





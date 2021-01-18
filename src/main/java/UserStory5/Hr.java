package UserStory5;

import UserStory1.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.GetDriverMethod;

import java.util.concurrent.TimeUnit;

public class Hr{



    public static void main(String[] args) throws InterruptedException {

        Driver.setChromedriver();
        WebDriver driver = Driver.getDriver();

        Login.logInAsHR51(driver);
        //PollCreatingPrecondition.pollCreate(driver);
        LogOutFunction.logOut(driver);
        Login.logInAsHR52(driver);


      /* WebElement findLogin = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        findLogin.clear();
        WebElement findPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        try {
            findLogin.sendKeys("hr52@cybertekschool.com");
        }catch (StaleElementReferenceException e){
            findLogin = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            findLogin.clear();
            findLogin.sendKeys("hr52@cybertekschool.com");
        }

        try {
            findPassword.sendKeys("UserUser");
        }catch (StaleElementReferenceException e){
            findPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            findPassword.sendKeys("UserUser");
        }

        try {
            login.click();
        }catch (StaleElementReferenceException e) {
            login = driver.findElement(By.xpath("//input[@type='submit']"));
            login.click();
        }

       */







        //Hr5 start to login
     /*   try {
            findLogin.sendKeys("hr52@cybertekschool.com");
        }catch (StaleElementReferenceException e){
            findLogin = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            findLogin.clear();
            findLogin.sendKeys("hr52@cybertekschool.com");
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

      */




        /*String pollExpectedQuestion = "Question 1?";
        WebElement pollPostTitle = driver.findElement(By.cssSelector("div#blog_post_body_2885"));
        if(pollPostTitle.getText().equals(pollExpectedQuestion)) {
            System.out.println("Hr successfully see the poll");
        }else{
            System.out.println("Hr can't see the poll");
        }

        WebElement answerCheckbox = driver.findElement(By.xpath("//label[@for='vote_checkbox_218_570'][1]"));
        answerCheckbox.click();

        WebElement voteButton = driver.findElement(By.xpath("//button[@data-bx-vote-button='actVoting'][1]"));
        voteButton.click();

        WebElement percentValue = driver.findElement(By.xpath("//span[@data-bx-vote-result='percent']"));
        System.out.println(percentValue.getText());

         */




    }










    }


package UserStory5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PollVeryfying extends Driver{

    public void pollVerification(){

        String pollExpectedQuestion = "Question 1?";
        WebElement pollPostTitle = chromedriver.findElement(By.cssSelector("div#blog_post_body_2885"));
        if(pollPostTitle.getText().equals(pollExpectedQuestion)) {
            System.out.println("Hr successfully see the poll");
        }else{
            System.out.println("Hr can't see the poll");
        }
//check by method if radio button is enabled
        System.out.println(chromedriver.findElement(By.xpath("//label[text()='3 hours']/..")).isEnabled());
        WebElement answerCheckbox = chromedriver.findElement(By.xpath("//label[@for='vote_checkbox_218_570'][1]"));
        answerCheckbox.click();

        WebElement voteButton = chromedriver.findElement(By.xpath("//button[@data-bx-vote-button='actVoting'][1]"));
        voteButton.click();

        WebElement percentValue = chromedriver.findElement(By.xpath("//span[@data-bx-vote-result='percent']"));
        System.out.println(percentValue.getText());




    }



}

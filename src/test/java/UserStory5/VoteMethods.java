package UserStory5;

import CRMNextBaseProject.*;
import CRMNextBaseProject.Driver;
import java.util.concurrent.TimeUnit;

public class VoteMethods {

    LogIn login = LogIn.getInstance();
    VotePage votePage = new VotePage();
    LogOut logOut = new LogOut();



    public void voteUserHr52(){
        login.loginHR52();

        votePage.answerRadio1.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        votePage.voteButton.click();
        logOut.setLogOut();
    }

    public void voteMarketing52() {

        login.loginMarketing52();
        votePage.answerRadio1.click();
        votePage.voteButton.click();
        logOut.setLogOut();
    }

    public void voteHelpdesk52() {

        login.loginHelpDeck52();
        votePage.answerRadio1.click();
        votePage.voteButton.click();
        logOut.setLogOut();
    }
    //method to verify that assigned persons successfully voted(login person who created poll)
    public void verifyVote(){
        login.loginHR51();
        votePage.pollResultButton.click();
        String numOfPeopleVoted = votePage.votedPeopleNumber.getText();
        if(!numOfPeopleVoted.equals("0")){
            System.out.println("Voting verified"+'\n'+numOfPeopleVoted+" answers is showing");
        }else {
            System.out.println("0 people picked first answer");
        }
        logOut.setLogOut();
    }

    //method to verify that user can vote again
    public void voteAgain(){
        login.loginHR52();
        votePage.voteAgain.click();
        ThreadSleep.threadSleep(2);
        votePage.answerRadio2.click();
        votePage.voteButton.click();
        ThreadSleep.threadSleep(2);
        boolean ableVoteAgain = votePage.voteAgain.isDisplayed();
        if (ableVoteAgain)
            System.out.println("User able to vote again");
        else
            System.out.println("User wasn't able to vote");
        logOut.setLogOut();
    }

    //method to verify that User who create a poll able to stop it
    public void stopPoll(){
        login.loginHR51(); //sign in with account who created the poll
        votePage.stopVote.click();
        ThreadSleep.threadSleep(1);
        boolean notAbleVote = (votePage.answerRadio1.isDisplayed());
        if(!notAbleVote)
            System.out.println("Poll successfully stopped");
        else
            System.out.println("Poll still active");
        logOut.setLogOut();
    }




}

package UserStory5;

import CRMNextBaseProject.*;
import CRMNextBaseProject.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VoteMethodsVerification {

    @BeforeMethod(description = "Setting up driver")

    private void setupMethod() {
        Driver.setUpDriver();
        Driver.navigateToURL(Data.url);
    }

    @Test(description = "To check that different users are able to vote, they can vote again, and poll " +
            "creator able to stop the poll. " +
            " Precondition: change question for the poll(duplicates not allowed)before running test in Data" +
            "by default users voting for first answer in the poll.")
    public void poleVote() {

        LogIn login = new LogIn();
        LogOut logout = new LogOut();
        login.loginHR51();
        PollCreatingPrecondition pollCreatingPrecondition = new PollCreatingPrecondition();
        pollCreatingPrecondition.Poll();
        logout.setLogOut();
        VoteMethods voteMethods = new VoteMethods();
        voteMethods.voteUserHr52();
        voteMethods.voteHelpdesk52();
        voteMethods.voteMarketing52();
        voteMethods.verifyVote();
        voteMethods.voteAgain();
        voteMethods.stopPoll();

    }

   @AfterMethod(description = "Killing Driver")
   private void killingDriver() {
        Driver.killDriver();
   }

}






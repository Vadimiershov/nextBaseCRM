package CRMNextBaseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Data extends Driver {
    //URL
    public static final String url = "https://login2.nextbasecrm.com/";

    //WebElements
    String loginBoxCSS = "input[type='text']";
    String passwordBoxCSS = "input[type='password']";
    String loginBtnCSS = "input[type='submit']";
    String myProfileAvatarBtnXpath = "//span[@class='user-img user-default-avatar']";
    String logOutBtnXpath = "//span[contains(text(),'Log out')]";



    //Login Data
    public static final String hr51 = "hr51@cybertekschool.com";
    public static final String hr52 = "hr52@cybertekschool.com";
    public static final String helpdesk51 = "helpdesk51@cybertekschool.com";
    public static final String helpdesk52 = "helpdesk52@cybertekschool.com";
    public static final String marketing51 = "marketing51@cybertekschool.com";
    public static final String marketing52 = "marketing52@cybertekschool.com";
    public static final String password = "UserUser";

    //Data for Poll
    public static final String messageInPoll = "Test Case Automation6";
    public static final String questionInPoll = "Why is it taking soo long to automate6?";
    public static final String answer1 = "Study more";
    public static final String answer2 = "Let it go";
    public static final String answer3 = "Whatever";



}

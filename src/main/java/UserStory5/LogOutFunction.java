package UserStory5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LogOutFunction {

    public static void logOut(WebDriver driver) throws InterruptedException {

            WebElement myProfileAvatarButton = driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']"));
            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            myProfileAvatarButton.click();

            WebElement logOutButton  = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOutButton.click();
        Thread.sleep(2000);

    }



}

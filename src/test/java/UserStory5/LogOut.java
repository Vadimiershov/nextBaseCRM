package UserStory5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogOut extends Driver{

    public void setLogOut() throws InterruptedException {
        WebElement myProfileAvatarBtn = getDriver().findElement(By.xpath("//span[@class='user-img user-default-avatar']"));
        myProfileAvatarBtn.click();
        WebElement logOutBtn = getDriver().findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOutBtn.click();
    }



}

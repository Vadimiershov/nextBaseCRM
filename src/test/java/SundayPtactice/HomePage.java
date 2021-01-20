package SundayPtactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Driver {
    public WebElement loggedInUsername = getDriver().findElement(By.cssSelector("span[id=user-name]"));
    public WebElement poll = getDriver().findElement(By.xpath("(//span[contains(text(), 'Poll')])[2]"));


  public WebElement pollMessage = getDriver().findElement(By.xpath("//body[@contenteditable=\"true\"]"));


}

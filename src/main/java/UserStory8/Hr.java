package UserStory8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Hr {
    WebDriver driver;

    @Test
    public void accessVerificationHR() throws InterruptedException {
//Login as HR
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("\n" +
                "hr51@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//AC#1

        driver.findElement(By.xpath("//a[@title='Tasks']")).click();
        String expectedTitle = "My tasks";
        String actualTitle = driver.getTitle();
        /*
    if (actualTitle.contains(expectedTitle)){
    System.out.println("Hr verification access passed");
    }else{
    System.out.println("Hr verification access Failed!");
}
*/
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Thread.sleep(5000);

        //AC#3

        driver.findElement(By.xpath("//a[@title='Tasks']")).click();
        WebElement allCheckbox = driver.findElement(By.xpath("//input[@title='Check All / Uncheck All'][1]"));
        allCheckbox.click();
        Assert.assertTrue(allCheckbox.isSelected(), "All checkbox is not selected");
        Thread.sleep(5000);

        String howManySelected = driver.findElement(By.xpath("//span[@class='main-grid-counter-selected'][1]")).getText();
        String totalTaskNumber = driver.findElement(By.xpath("//span[@class='main-grid-counter-displayed'][1]")).getText();

        Assert.assertEquals(howManySelected, totalTaskNumber, "Total task number differ");
Thread.sleep(5000);

        //AC#4
        driver.findElement(By.xpath("//span[.='All']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Ongoing']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Assisting']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Set by me']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Following']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Projects']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Kanban']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Efficiency']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Recycle Bin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='More']")).click();
        Thread.sleep(2000);






    }

}
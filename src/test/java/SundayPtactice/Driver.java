package SundayPtactice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver chromeDriver;

   public static void setUpDriver() {
       WebDriverManager.chromedriver().setup();
       chromeDriver = new ChromeDriver();
       chromeDriver.manage().window().maximize();
   }

   public static WebDriver getDriver() {
       return chromeDriver;
   }

   public static void killDriver() {
       chromeDriver.quit();
   }
}

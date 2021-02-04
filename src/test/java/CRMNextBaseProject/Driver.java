package CRMNextBaseProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver chromeDriver;

   public static void setUpDriver() {
       WebDriverManager.chromedriver().setup();
       chromeDriver = new ChromeDriver();
       chromeDriver.manage().window().maximize();
   }

   public static WebDriver getDriver() {
       return chromeDriver;
   }

   public static void navigateToURL(String url) {
       getDriver().get(url);
   }

   public static void killDriver() {
       chromeDriver.quit();
   }
    public static void implicitWait (){
       chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       }

   }


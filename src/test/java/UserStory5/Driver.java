package UserStory5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver chromedriver;

    public static void setChromedriver(){
        WebDriverManager.chromedriver().setup();
        chromedriver = new ChromeDriver();
        chromedriver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return chromedriver;
    }

    public static void navigateToURL(String url) {
        getDriver().get(url);
    }

    public static void killDriver() {
        chromedriver.quit();
    }


}
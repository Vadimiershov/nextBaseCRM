package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginMarketing51 {

    public void LoginMarketing51method() {

        GetDriverMethod chromeDriver = new GetDriverMethod();

        chromeDriver.driver.get("https://login2.nextbasecrm.com/stream/");

        WebElement findLogin = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        findLogin.sendKeys("marketing51@cybertekschool.com");

        WebElement findPassword = chromeDriver.driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        findPassword.sendKeys("UserUser");

        WebElement rememberMeOnThisComputer = chromeDriver.driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));

        rememberMeOnThisComputer.click();

        WebElement login = chromeDriver.driver.findElement(By.xpath("//input[@type='submit']"));

        login.click();

    }



}

package com.syntax.class4HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {       // Using  Advance XPATH
    /*
task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.
 */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
         //Enter valid Username
        WebElement username=driver.findElement(By.xpath("//span class='form-hint']/preceding-sibling::input"));
        username.sendKeys("Jessica");
        //enter wrong password
        WebElement password=driver.findElement(By.xpath("//div[@id='divPassword']/input]"));
        password.sendKeys("sun123");

        //Click on login button
        WebElement login=driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
        login.click();

        WebElement invalid=driver.findElement(By.xpath("//input[@type='submit']/following-sibling::span"));
        System.out.println(invalid.getText());
        driver.quit();
    }
}
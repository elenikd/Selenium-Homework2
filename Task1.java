package com.syntax.class4HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {    //  Using XPATH
     /*
   task1:(use xpath)
RMS Application Negative Login:
Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
    */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Enter valid username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("elephant123");

        Thread.sleep(2000);
        // click on login button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // leave the password empty
        WebElement error=driver.findElement(By.xpath("//span[@class='Password cannot be empty']"));

        System.out.println(error.getText());
        driver.quit();

    }
}

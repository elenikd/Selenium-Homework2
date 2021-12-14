package com.syntax.class4HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {  //cssSelector

    /*
    task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)

*/
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://syntaxprojects.com/input-form-demo.php");
            driver.manage().window().maximize();

             //First Name
            driver.findElement(By.cssSelector("input.form-control")).sendKeys("Eleni");
            //Last Name
            driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Kandi");
            //E-Mail Address
            driver.findElement(By.cssSelector("input[name='email'")).sendKeys("joy@gmail.com");
            //phone Number
            driver.findElement(By.cssSelector("input[name='phone'")).sendKeys("718-546-6567");
            //Address
            driver.findElement(By.cssSelector("input[name='address'")).sendKeys("64-35 Forest Hills");
            //city
            driver.findElement(By.cssSelector("input[ name='city']")).sendKeys("Queens");
            //State
            driver.findElement(By.cssSelector("select[class='form-control selectpicker']")).sendKeys("New York City");
            //Zip
            driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("11575");
            //Website or domain name
            driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.syntax.com");
            //Do you have hosting? yes or no
            driver.findElement(By.cssSelector("input[value='no']")).click();
            //Project Description
            driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("I am learning a lots of new things at Syntax School");



        }
}

package com.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.Struct;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FirstTest {
    //hello

    WebDriver driver = new ChromeDriver();


    WebDriverWait wait = new WebDriverWait(driver, 20);

    @Test
    public void firstTestMethod(){

        driver.manage().window().maximize();

        driver.get("https://www.dice.com/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Login_1\"]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Email_1\"]"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Email_1\"]"))).sendKeys("jobqaandrei@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Password_1\"]"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Password_1\"]"))).sendKeys("Kostuchenko0");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LoginBtn_1\"]"))).click();
      /*  wait.until(ExpectedConditions.elementToBeClickable(By.id("editProfile"))).click();*/

        /*wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"newPreferredLocation\"]"))).clear();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"newPreferredLocation\"]"))).sendKeys("New York");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[8]/div/div[2]/div[2]/div[3]/div[1]/div/div/div[4]/div/div/div/div[1]/div[4]/div/button"))).click();

*/
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"smart-toggle-link\"]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/div[2]/ul[2]/li[3]/ul/li[5]/form"))).click();


    }

   /* @Test
    public void secondTestTitle(){
        String title = driver.getTitle();
       assertEquals(title, "Seeker Dashboard - Profile");
    }*/
    @Test
    public void thirdTestSignOut(){


    }

    @AfterTest
    public void tearDown(){

        driver.quit();

    }


}

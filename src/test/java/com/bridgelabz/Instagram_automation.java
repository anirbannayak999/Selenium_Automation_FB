package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Instagram_automation {
    WebDriver driver;

    @BeforeTest
    public void search() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote---allow---origin");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void login_insta() throws InterruptedException, AWTException {
//         ChromeOptions options= new ChromeOptions();
//         options.addArguments("remote---allow---origin");
//         WebDriverManager.chromedriver().setup();
//         chrome=new ChromeDriver(options);
//         chrome.get("https://www.instagram.com/");
//         chrome.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        WebElement instalogin = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
        instalogin.sendKeys("aryannayak@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("657256428854");
        WebElement click = driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
        click.click();
    }

    @Test
    public void instagram_signupusingLocator() throws InterruptedException {
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        WebElement webElement= driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']"));
        webElement.click();
        Thread.sleep(3000);
        WebElement webelment3= driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
        webelment3.sendKeys("9668519553");
        Thread.sleep(3000);
        WebElement webElement4= driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
        webElement4.sendKeys("Anirban nayak");
        Thread.sleep(3000);
        WebElement webElement5= driver.findElement(By.xpath("//input[@aria-label='Username']"));
        webElement5.sendKeys("anirbannayak425");
        Thread.sleep(3000);
        //contain fuction
        WebElement webElement6= driver.findElement(By.xpath("//input[contains(@autocomplete,'new')]"));
        webElement6.sendKeys("7606083133");
        //text fuction
        WebElement webElement7= driver.findElement(By.xpath("//button[text()='Sign up']"));
        webElement7.click();
        Thread.sleep(5000);
        WebElement webElement8= driver.findElement(By.cssSelector("select[title='Month:']"));
        webElement8.sendKeys("February");
        Thread.sleep(3000);
        WebElement webElement9= driver.findElement(By.xpath("//select[@title='Day:']"));
        webElement9.sendKeys("02");
        WebElement webElement10= driver.findElement(By.xpath("//select[@title='Year:']"));
        webElement10.sendKeys("1998");
        WebElement webElement11= driver.findElement(By.xpath("(//div[@style='width: 100%;'])[2]"));
        webElement11.click();
    }
}
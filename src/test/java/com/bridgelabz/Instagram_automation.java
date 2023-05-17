package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Instagram_automation {
    WebDriver driver;

    @BeforeTest
    public void search(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("remote---allow---origin");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

    }    @Test
    public void login_insta() throws InterruptedException {
//         ChromeOptions options= new ChromeOptions();
//         options.addArguments("remote---allow---origin");
//         WebDriverManager.chromedriver().setup();
//         chrome=new ChromeDriver(options);
//         chrome.get("https://www.instagram.com/");
//         chrome.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        WebElement instalogin=driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
        instalogin.sendKeys("aryannayak@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("657256428854");
        WebElement click= driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
        click.click();
    }


}

package com.bridgelabz;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Webdriver_interface_Method {

        public WebDriver webDriver;

        @Test
        public void driverLaunch() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("https://www.facebook.com/");
            String title = webDriver.getTitle();
            System.out.println("Title : " +title);
            Thread.sleep(4000);
            String sourceCode = webDriver.getPageSource();
            System.out.println("source code : " +sourceCode);
            Thread.sleep(4000);
            String currentUrl = webDriver.getCurrentUrl();
            System.out.println("current url : "+currentUrl);
            String windowHandle = webDriver.getWindowHandle();
            System.out.println("current url : "+windowHandle);
            webDriver.manage().window().maximize();
            webDriver.navigate().to("https://www.flipkart.com/");
            webDriver.navigate().forward();
            webDriver.navigate().back();
            webDriver.navigate().refresh();
            webDriver.quit();
        }
    }


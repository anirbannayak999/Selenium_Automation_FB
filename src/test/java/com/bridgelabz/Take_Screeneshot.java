package com.bridgelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Take_Screeneshot {
    WebDriver webDriver;
    @Test
    public void takeScreenShotMethod() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File sourceFile =  takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\Anirban\\IdeaProjects\\Selenium_fbAutomation\\Facebook_Screenshot\\" + "fb.png");
        FileHandler.copy(sourceFile,destinationFile);
        Thread.sleep(3000);
        webDriver.close();
    }
}

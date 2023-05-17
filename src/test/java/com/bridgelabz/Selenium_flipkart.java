package com.bridgelabz;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

public class Selenium_flipkart {
    public WebDriver driver;
    @Test
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String title= driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String sourcecode=driver.getPageSource();
        System.out.println(sourcecode);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/login/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver. navigate().forward();
        String handle1=driver.getWindowHandle();
        System.out.println("the windows handel"+ handle1);
        driver.close();
        driver.quit();
    }
    @BeforeClass
    public Credentials getCredential (){
        Credentials credentials=new Credentials();
        return credentials;
    }

    @Test
    public void Facebook_login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        String handel = driver.getWindowHandle();
        System.out.println("the windows handel is " + handel );
        WebElement emailbox= driver.findElement(By.id("email"));
        emailbox.sendKeys(getCredential().getEmail());
        //emailbox.sendKeys(System.getenv("email"));
        WebElement pass= driver.findElement(By.id("pass"));
        pass.sendKeys(getCredential().getPassword());
        // pass.sendKeys(System.getenv("password"));
        WebElement submit= driver.findElement(By.id("loginbutton"));
        submit.click();
        Thread.sleep(5000);

    }
    @Test
    public void facebook_signup() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        WebElement create= driver.findElement(By.linkText("Sign up for Facebook"));
        create.click();
        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Anirbanpupul");
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Nayaks");
        WebElement email_address= driver.findElement(By.name("reg_email__"));
        email_address.sendKeys("anirbannayak@gmail.com");
        Thread.sleep(5000);
        email_address.clear();
        email_address.sendKeys("anirbannayak@gmail.com");
        String attribute= email_address.getAttribute("name");
        System.out.println(attribute);
        WebElement reenter_email= driver.findElement(By.name("reg_email_confirmation__"));
        reenter_email.sendKeys("anirbannayak@gmail.com");
        WebElement newpassword= driver.findElement(By.name("reg_passwd__"));
        int passwordx=newpassword.getLocation().x;
        int passwordy=newpassword.getLocation().y;
        System.out.println(passwordx);
        System.out.println(passwordy);
        newpassword.sendKeys("9861139591rolex");
        WebElement dateday=driver.findElement(By.id("day"));
        dateday.sendKeys("20");
        WebElement months=driver.findElement(By.id("month"));
        months.sendKeys("Feb");
        WebElement year= driver.findElement(By.id("year"));
        year.sendKeys("1998");
        WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();
        WebElement signup= driver.findElement(By.name("websubmit"));
        signup.click();
        TakesScreenshot ts= (TakesScreenshot) driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        File savefile=new File("C:\\Users\\Anirban\\OneDrive\\Documents\\"+"FB.png");
        FileHandler.copy(file,savefile);
        WebElement gettext1= driver.findElement(By.name("firstname"));
        String text=gettext1.getText();
        System.out.println(text);
        boolean display=gettext1.isDisplayed();
        System.out.println(display+"displaying the value");
        boolean enabled=gettext1.isEnabled();
        System.out.println(enabled+"is enabled ");
        boolean selected=gettext1.isSelected();
        System.out.println("is selected method"+selected);
        int size_height=gettext1.getSize().getHeight();
        System.out.println("the height of sign up button:"+size_height);
        int size_width=gettext1.getSize().getWidth();
        System.out.println("the width of the sign up button "+size_width);
        driver.findElements(By.cssSelector("button[value='1']"));
        WebElement emailbox= driver.findElement(By.name("lastname"));
        String fontsize=emailbox.getCssValue("font-size");
        System.out.println("the cssvalue fontsize is" + fontsize );
        //start-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address')]")).sendKeys("9668519553");
        //cssSelector  -
        driver.findElement(By.cssSelector("input#email")).sendKeys("anirban");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("anirban");
        Thread.sleep(5000);
    }
}


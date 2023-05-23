package com.bridgelabz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webelementinterface_method {

        public WebDriver webDriver;

        @Test
        public void driverLaunch() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("https://www.facebook.com/");
            webDriver.manage().window().maximize();

            WebElement findEle = webDriver.findElement(By.id("email"));
            findEle.sendKeys("anirbannayak999@gmail");
            Thread.sleep(4000);
            findEle.clear();
            Thread.sleep(4000);
            findEle.sendKeys("anirbannayak999@gmail");

            //getAttribute
            String attributeField = findEle.getAttribute("placeholder");
            System.out.println(attributeField);

            //getCssValue
            String cssValue = findEle.getCssValue("font-size");
            System.out.println(cssValue);

            //getLocation
            int xCoOrdinate = findEle.getLocation().x;
            System.out.println(xCoOrdinate);
            int yCoOrdinate = findEle.getLocation().y;
            System.out.println(yCoOrdinate);

            //getSize
            int size = findEle.getSize().getWidth();
            System.out.println(size);
            int width = findEle.getSize().getHeight();
            System.out.println(width);

            //getText
            String text = findEle.getText();
            System.out.println(" text is : " + text);

            //isDisplayed
            boolean displayed = findEle.isDisplayed();
            System.out.println(displayed);

            //isSelected
            boolean selected = findEle.isSelected();
            System.out.println(selected);

            //isEnabled
            boolean enabled = findEle.isEnabled();
            System.out.println(enabled);

            Thread.sleep(4000);
            findEle.clear();

            //sendKeys
            WebElement elementUN = webDriver.findElement(By.id("email"));
            elementUN.sendKeys("anirbannayak999@gmail");

            WebElement elementPass = webDriver.findElement(By.name("pass"));
            elementPass.sendKeys("anirbannayak999454343#$");

            WebElement elementLogin = webDriver.findElement(By.name("login"));
            elementLogin.click();
            Thread.sleep(6000);
        }
        @Test
        public  void webelment_method() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anirban\\Downloads\\chromedriver_win32\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("https://www.facebook.com/");
            Thread.sleep(3000);
            //linkText
            WebElement linkText1 = webDriver.findElement(By.xpath("//a[text()='Create new account']"));
            linkText1.click();

           // partialLinkText
            WebElement partialLinkText1 = webDriver.findElement(By.partialLinkText("Create new"));
            partialLinkText1.click();

            //cssSelector - 4 attributes
//            WebElement cssSelector1 = webDriver.findElement(By.cssSelector("input[id='u_3_b_f6']"));
//            cssSelector1.sendKeys("Anirban");
            Thread.sleep(5000);

            //xPath
            WebElement xPath1 = webDriver.findElement(By.xpath("//input[@name='lastname']"));
            xPath1.sendKeys("Nayak");

            Thread.sleep(5000);
            //text()
            WebElement textXPath = webDriver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
            textXPath.click();

        }
        @Test
        public void webelement() throws InterruptedException {
            webDriver=new ChromeDriver();
            webDriver.get("https://www.facebook.com/");
            Thread.sleep(5000);
            //contain()
            WebElement containXPath = webDriver.findElement(By.xpath("//button[contains(text(),'Log')]"));
            containXPath.click();
        }
        @Test
        public void webelement89() throws InterruptedException {
            webDriver=new ChromeDriver();
            webDriver.get("https://www.facebook.com/");
            WebElement webElement23=webDriver.findElement(By.linkText("Create new account"));
            webElement23.click();
            webDriver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address')]")).sendKeys("9668519553");
            //cssSelector  -
//         webDriver.findElement(By.cssSelector("input#email")).sendKeys("anirban");
//         Thread.sleep(5000);
            webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys("anirban");
            Thread.sleep(5000);
            //contain()
            WebElement containXPath1 = webDriver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
            containXPath1.click();
            Thread.sleep(6000);
            webDriver.close();
        }
    }



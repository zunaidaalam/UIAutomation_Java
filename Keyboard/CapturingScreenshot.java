package org.UIAutomation.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CapturingScreenshot {
    public static void main(String[] args) throws InterruptedException, TimeoutException, IOException {

        System.out.println("Capture the Screenshot Started !!");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();

        Date currentDate = new Date();
        System.out.println("The Current Date is: "+currentDate);
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "/");
        System.out.println("Updated date is: "+screenshotFileName);

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//Screenshot//"+screenshotFileName +".png"));



        driver.quit();
        //driver.close();
    }
}
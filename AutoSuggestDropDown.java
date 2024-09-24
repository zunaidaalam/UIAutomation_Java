package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoSuggestDropDown {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Print all the Links from the Page !!");

        //Make My Trip Code
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        //Enter the Text in the From
        driver.findElement(By.xpath("//span[text()='From']")).click();
        WebElement from =  driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
        Thread.sleep(1000);
        from.sendKeys("Sydney");
        Thread.sleep(1000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //Enter the Text in the To
        driver.findElement(By.xpath("//span[text()='To']")).click();
        WebElement To = driver.findElement(By.xpath("//input[@placeholder='To']"));
        Thread.sleep(1000);
        To.sendKeys("New Delhi");
        Thread.sleep(1000);
        To.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        To.sendKeys(Keys.ENTER);

        //Perform the Search Operation
        driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();


    }
}
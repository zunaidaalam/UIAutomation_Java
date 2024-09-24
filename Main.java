package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Basic UI Automation Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
        driver.findElement(By.id("gh-btn")).click();
        driver.getTitle();
    }
}
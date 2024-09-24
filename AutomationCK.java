package org.UIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationCK {
    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver", "E:\\Software\\Browser Driver\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
        driver.findElement(By.name("btnK")).click();
        String Title = driver.getTitle();
        System.out.println(Title);
        String PageSource =  driver.getPageSource();
        System.out.println(PageSource);

    }
}

package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Check Box Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        driver.findElement(By.id("doi0")).click();
        driver.findElement(By.id("doi0")).isSelected();
        Thread.sleep(1000);
        driver.findElement(By.id("doi0")).click();

        driver.quit();
        //driver.close();
    }
}
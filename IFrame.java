package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("I Frame Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("frame1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/button")).click();
        Thread.sleep(2000);
        String alerttext = driver.switchTo().alert().getText();
        System.out.println("String of the Alert Text: "+alerttext);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());


        driver.quit();
        //driver.close();
    }
}
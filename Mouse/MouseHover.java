package org.UIAutomation.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Mouse Hover Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));

        Actions mousehover = new Actions(driver);
        Thread.sleep(2000);
        mousehover.moveToElement(element).perform();
        Thread.sleep(2000);
        mousehover.click(element).perform();



        //driver.quit();
        //driver.close();
    }
}
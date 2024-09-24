package org.UIAutomation.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class KeyboardEvent {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("KeyBoard Event Started !!");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://extendsclass.com/text-compare");
            driver.manage().window().maximize();
            WebElement sourcearea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[7]/pre/span"));
            Thread.sleep(2000);
            Actions keyboardevent = new Actions(driver);
            Thread.sleep(2000);
            keyboardevent.keyDown(sourcearea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
            Thread.sleep(2000);

            WebElement destinationarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/pre/span"));
            Thread.sleep(2000);
            keyboardevent.keyDown(destinationarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

        } catch (Exception e) {
            System.out.println("Exceptions are: "+e);
        }
        finally {
            System.out.println("Browser will be closed successfully!!");
            driver.quit();
        }

        //driver.quit();
        //driver.close();
    }
}
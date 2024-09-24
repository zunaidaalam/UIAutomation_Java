package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.GetLocalStorageItem;

import java.util.List;
import java.util.Set;

public class WebElementMethods {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Web Element Methods Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Enter the Name Mobile in the Search Box
        driver.findElement(By.name("_nkw")).sendKeys("Mobile");
        Thread.sleep(1000);
        //Clear the Mobile name from the Search Box
        driver.findElement(By.name("_nkw")).clear();
        //Find the Name of the Attribute
        String GetAttribute =  driver.findElement(By.name("_nkw")).getAttribute("class");
        System.out.println("Get Attribute: " +GetAttribute);
        //Check the CSS Value
        String GetCSSValue = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).getCssValue("inline-block");
        System.out.println("Find the CSS Value" +GetCSSValue);

        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).getSize());
        //System.out.println(GetSize);

        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).getLocation());
        //System.out.println(GetLocation);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).getTagName());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[5]/div/div/div/div/div[2]/a/div[2]")).isSelected());


        driver.quit();
        //driver.close();
    }
}
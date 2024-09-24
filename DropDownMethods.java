package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Drop Down Methods Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //Choose the values from dropdown in single form
        WebElement dropdown = driver.findElement(By.name("_sacat"));
        Select select = new Select(dropdown);
        WebElement firstoption = select.getFirstSelectedOption();
        System.out.println("Find First Option "+firstoption.getText());
        Thread.sleep(5000);
        select.selectByIndex(3);
        Thread.sleep(5000);
        select.selectByValue("550");
        Thread.sleep(5000);
        select.selectByVisibleText("Cameras & Photo");


        driver.quit();
        //driver.close();
    }
}
package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Radio Button Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
        driver.manage().window().maximize();

        WebElement radio = driver.findElement(By.name("book-flight-radio"));
        Thread.sleep(5000);
        radio.click();
        System.out.println("The Value of Radio: "+radio.isSelected());

        driver.quit();
        //driver.close();
    }
}
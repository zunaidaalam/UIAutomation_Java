package org.UIAutomation.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Slider Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement sliderElement = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Actions slider = new Actions(driver);
        // Move this Slider to the Forward
        slider.dragAndDropBy(sliderElement, 400, 150).perform();
        Thread.sleep(2000);
        //Move this slider to the backword
        slider.dragAndDropBy(sliderElement, -300, 100).perform();



        //driver.quit();
        //driver.close();
    }
}
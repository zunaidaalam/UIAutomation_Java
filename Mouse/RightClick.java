package org.UIAutomation.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Slider Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement RighClickElement = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
        Actions colorpicker = new Actions(driver);
        // Move this Slider to the Forward
        colorpicker.contextClick(RighClickElement).perform();



        //driver.quit();
        //driver.close();
    }
}
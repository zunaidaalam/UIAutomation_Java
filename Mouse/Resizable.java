package org.UIAutomation.Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Resizable Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement resizableElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Actions resizable = new Actions(driver);
        resizable.dragAndDropBy(resizableElement, 100, 80).perform();



        //driver.quit();
        //driver.close();
    }
}
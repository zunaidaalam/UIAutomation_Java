package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.effect.SepiaTone;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Window Handle Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.salesforce.com/au/");
            driver.manage().window().maximize();
            //driver.findElement(By.xpath("/html/body/div[1]/hgf-c360nav//header/div[1]/div[1]/nav[2]/div/hgf-button")).click();

            driver.findElement(By.xpath("/html/body/div[1]/hgf-c360nav//header/div[1]/div[1]/nav[2]/div/hgf-button")).click();
            Set<String> WindowHandles = driver.getWindowHandles();
            System.out.println("Window has been handle: " + WindowHandles);

            Iterator<String> iterator = WindowHandles.iterator();
            String parentwindow = iterator.next();
            System.out.println("Parent Window: " + parentwindow);
            String childwindow = iterator.next();
            System.out.println("Child Window: " + childwindow);
            driver.switchTo().window(childwindow);


            driver.findElement(By.name("UserFirstName")).sendKeys("Zunaid");
            driver.findElement(By.name("UserLastName")).sendKeys("Aalam");
            driver.findElement(By.name("UserEmail")).sendKeys("zunaid248@gmail.com");
            driver.findElement(By.name("CompanyName")).sendKeys("HCL Tech");
            driver.findElement(By.name("UserPhone")).sendKeys("9958658418");


            WebElement ddown = driver.findElement(By.cssSelector("#UserTitle-W7DB"));
            ddown.click();
            Select select = new Select(ddown);
            select.selectByValue("Sales_Manager_ANZ");
            select.selectByVisibleText("Marketing / PR Manager");


            WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\"CompanyCountry-MmMn\"]"));
            Select select1 = new Select(ddown1);
            select1.selectByValue("US");

            WebElement ddown2 = driver.findElement(By.xpath("//*[@id=\"formName-TM3N\"]"));
            Select select2 = new Select(ddown2);
            select2.selectByVisibleText("Choose your trial.");

            driver.findElement(By.id("SubscriptionAgreement")).click();
            driver.findElement(By.id("SubscriptionAgreement")).isSelected();

            driver.findElement(By.xpath("//*[@id=\"signup_form_MHAX\"]/div[13]/button")).click();
        } catch (Exception e) {
            System.out.println("Exceptions are: "+e);
        }
        finally {
            System.out.println("Browser will be closed successfully!!");
            //driver.quit();
        }

        //driver.quit();
        //driver.close();
    }
}
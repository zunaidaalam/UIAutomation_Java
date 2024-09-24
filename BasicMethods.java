package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class BasicMethods {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Basic Methods Started !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Fetch the Current URL
        String CurrentURL = driver.getCurrentUrl();
        System.out.println(CurrentURL);

        //Fetch the Title of the Web Page
        String Title = driver.getTitle();
        System.out.println(Title);

        //Fetch the Page Source
        String PageSource = driver.getPageSource();
        System.out.println(PageSource);

        //Navigate from one window to another Window
        //driver.navigate().to("https://www.google.com/");

        //Login in the Sauce Demo App
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(1000);

        //After Login Find the inventory List
        List <WebElement> InventoryList = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println(InventoryList);
        Thread.sleep(1000);

        //Use the Window Handle and Store it in the String
        driver.navigate().to("https://www.sugarcrm.com/");
        String WindowHandle = driver.getWindowHandle();
        System.out.println("Window Handle: " + WindowHandle);
        Thread.sleep(1000);

    /*    WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cookiePopup = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-popup-id")));

        //WebElement acceptButton = cookiePopup.findElement(By.cssSelector("button.accept-button-class"));
        WebElement acceptButton = cookiePopup.findElement(By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        //#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll, #CybotCookiebotDialog
        //class = "CybotCookiebotDialogBodyButton"
        acceptButton.click();
        System.out.println("Accept Button: "+ acceptButton);*/

        //Use the Window Handles and store it in a Set and import the Set class
        driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]"));
        Set<String> WindowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + WindowHandles);
        Thread.sleep(1000);

        driver.quit();


        //driver.close();
    }
}
package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingaporeAir {
    public static void main (String [] args) throws InterruptedException {
        //Singapore Airline code

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
        driver.manage().window().maximize();


        //Choose the Radio Button
        WebElement radio = driver.findElement(By.id("redeemFlights"));
        radio.click();
        Thread.sleep(5000);
        WebElement radio1 = driver.findElement(By.id("bookFlights"));
        radio1.click();
        System.out.println("Radio Selected: "+radio.isSelected());
        System.out.println("Radio1 Selected: "+radio1.isSelected());

        //Enter the Text in the From City
        WebElement from =  driver.findElement(By.xpath("//*[@id=\"flightOrigin1\"]"));
        Thread.sleep(1000);
        from.clear();
        from.sendKeys("Sydney");
        Thread.sleep(1000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //Enter the Text in the To City
        WebElement To = driver.findElement(By.xpath("//*[@id=\"bookFlightDestination\"]"));
        Thread.sleep(1000);
        To.sendKeys("Calgary");
        Thread.sleep(1000);
        To.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        To.sendKeys(Keys.ENTER);

        //From Date
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement fromdatePicker = wait.until(ExpectedConditions.elementToBeClickable(By.id("departDate1"))); // Use the correct selector
        fromdatePicker.click();

        // Select a specific date
        // For example, selecting a date from the current month
        WebElement dateToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/ul[4]/li[4]"))); // Adjust XPath as needed
        dateToSelect.click();

        //To Date Picker
        WebElement todatePicker = wait.until(ExpectedConditions.elementToBeClickable(By.id("returnDate1"))); // Use the correct selector
        todatePicker.click();

        // Select a specific date
        // For example, selecting a date from the current month
        WebElement dateToSelect1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/ul[4]/li[6]"))); // Adjust XPath as needed
        dateToSelect1.click();

        //DropDown List
        /*WebElement ddownClass = driver.findElement(By.id("flightClass1"));
        ddownClass.click();
        Select select = new Select(ddownClass);
        select.selectByVisibleText("Premium Economy");*/
        /*Thread.sleep(1000);
        ddownClass.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        ddownClass.sendKeys(Keys.ENTER);*/

        //WebDriverWait wait1 = new WebDriverWait(driver, 10);

        WebElement classDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("flightClass1")));
        classDropdown.click();
        // Choose a specific class (adjust XPath as necessary)
        WebElement classOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Premium Economy']")));
        classOption.click();

        WebElement passengerDropdown = driver.findElement(By.id("flightPassengers1"));
        passengerDropdown.click();
        WebElement addAdult = driver.findElement(By.xpath("//*[@id=\"flightPassengers1\"]")); // Adjust XPath as needed
        addAdult.click();


        //Perform the Search Operation
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary js-open-loading\"]")).click();

        driver.quit();


        //driver.close();
    }
}

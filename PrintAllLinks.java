package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class PrintAllLinks {
    public static void main(String[] args) throws InterruptedException, TimeoutException {

        System.out.println("Print all the Links from the Page !!");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        List <WebElement> alltags =  driver.findElementsByTagName("a");
        System.out.println("Total Tags are: "+alltags.size());

        for(int i=0;i<alltags.size();i++)
        {
            System.out.println("Links are in the Page : "+alltags.get(i).getAttribute("href"));
            System.out.println("Print visible tags on the page are: "+alltags.get(i).getText());
        }

        driver.quit();


        //driver.close();
    }
}
package org.UIAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HandlingSSLErrors {
    public static void main(String[] args) throws InterruptedException, TimeoutException, IOException {

        System.out.println("Handle the SSL Error Started !!");

        WebDriverManager.chromedriver().setup();

        //Global Profile
        DesiredCapabilities dc = new DesiredCapabilities();
        //dc.setAcceptInsecureCerts(true);

        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(dc);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();




        //driver.quit();
        //driver.close();
    }
}
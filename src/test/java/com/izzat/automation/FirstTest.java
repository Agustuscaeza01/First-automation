package com.izzat.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTest {

    @Test
    public void openSauceDemo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        System.out.println("Title is: " + driver.getTitle());
        driver.quit();
        System.out.println("TEST FINISHED");
    }
}

package com.day.six;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "D:\\personal\\my-projects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        driver.close();

    }
}
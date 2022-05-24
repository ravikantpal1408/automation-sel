package com.day.six;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainApp {

    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "//Users//ravikantpal//my-projects//automation-sel//drivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        var adminOption = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
        var menuAdminOption = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
        var userOption = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));

        var actions = new Actions(driver);

        actions.moveToElement(adminOption).moveToElement(menuAdminOption).moveToElement(userOption).click().build()
                .perform();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        var button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        actions.contextClick(button).build().perform();
        driver.close();
    }
}

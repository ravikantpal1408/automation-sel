package com.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "//Users//ravikantpal//my-projects//automation-sel//drivers//msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        // driver.switchTo().alert().dismiss();

        driver.close();
        driver.quit();

    }
}

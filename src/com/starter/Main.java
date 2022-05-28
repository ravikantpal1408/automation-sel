package com.starter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver",
                "//Users//ravikantpal//my-projects//automation-sel//drivers//msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.w3.org/TR/webdriver1/");

        Thread.sleep(3000);

        driver.close();

        driver.quit();
    }
}

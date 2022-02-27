package com.starter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\\\personal\\\\my-projects\\\\chromedriver_win32\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3.org/TR/webdriver1/");

        Thread.sleep(3000);

        driver.close();

        driver.quit();
    }
}

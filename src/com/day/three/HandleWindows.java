package com.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class HandleWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver",
                "//Users//ravikantpal//my-projects//automation-sel//drivers//msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        // String handleVal = driver.getWindowHandle();
        // System.out.println(handleVal);

        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
        Set<String> handleValues = driver.getWindowHandles();

        for (var items : handleValues) {
            // System.out.println(items);
            String title = driver.switchTo().window(items).getTitle();
            System.out.println(title);
            if (title.equals("Selenium")) {
                driver.close();
            }
        }

    }
}

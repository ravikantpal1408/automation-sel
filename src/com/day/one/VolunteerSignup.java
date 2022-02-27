package com.day.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VolunteerSignup {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\\\personal\\\\my-projects\\\\chromedriver_win32\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // explicit wait
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // implicit wait
        /* if the element is present it wont wait , but if not - then maximum wait time will be 5 seconds */

        driver.get("https://goo.gl/RVdKM9");

        WebElement ele = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"RESULT_TextField-1\"]")));
        ele.click();

        driver.manage().window().maximize();

        String title = driver.getTitle(); // return the page title

        System.out.println("Title of the page is :"+ title);

        String url = driver.getCurrentUrl(); // return the current URL of the web page

        System.out.println("URL of the page is :" + url);

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Ravi");

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Pal");

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("7839129138");

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("Lucknow");

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("ravikantpal123@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("Lucknow");

        // Handling Dropdown values
        Select dropDownList = new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));

        // Find how many options are present in the dropdown
        System.out.println("No of options present in the list are : " + dropDownList.getOptions().size());

        // Extract all the options and print them
        List<WebElement> opts = dropDownList.getOptions();

        for(var items : opts) {
            System.out.println(items.getText());
        }

        // Select options from the dropdown
        // dropDownList.selectByIndex(1);
        // dropDownList.selectByValue("Radio-1");
        // dropDownList.deselectByVisibleText("Evening");

        // Handling Radio button
        /*-----------------------------------------------------*/
        // Conditional method
        WebElement radioMale = driver.findElement(By.id("RESULT_RadioButton-7_0"));
        System.out.println(radioMale.isDisplayed()); // check displayed or not -> return true/false
        System.out.println(radioMale.isEnabled()); // checks if enable or not
        System.out.println(radioMale.isSelected()); // should return false as initially it is not selected
        driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label")).click();
        System.out.println(radioMale.isSelected());

        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
        driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();

        // Text Area ->


        // Handle links
        driver.findElement(By.linkText("Software Testing Tutorials")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Tools Training")).click();
        driver.navigate().back();

        driver.close();
        driver.quit();
    }
}

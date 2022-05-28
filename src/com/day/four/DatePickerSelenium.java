package com.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Calendar;

public class DatePickerSelenium {
    public static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver",
                "//Users//ravikantpal//my-projects//automation-sel//drivers//msedgedriver");
        driver = new EdgeDriver(); // chrome driver
        driver.get("https://goo.gl/RVdKM9"); // get url
        driver.manage().window().maximize(); // maximise window

        String year = "2019";
        String month = "August";
        String date = "14";

        driver.findElement(By.xpath("this some ex-path to datepicker")).click(); // this will open and focus on the
                                                                                 // datepicker

        selectCurrentDate();
        selectPastDate(date, month);
        selectFutureDate(date, month);
    }

    static void selectCurrentDate() {
        Calendar calendar = Calendar.getInstance(); // default JAVA calendar instance
        int integerDate = calendar.get(Calendar.DATE); // return current date in integer format
        String date = String.valueOf(integerDate); // get date in string format using integer value
        driver.findElement(By.linkText(date)); // now select the date in datepicker

    }

    static void selectPastDate(String d, String m) {

    }

    static void selectFutureDate(String d, String m) {
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH); // return current date in integer format

        for (int i = currentMonth; i >= 1; i++) {
            driver.findElement(By.xpath("date picker carrot icon")).click(); // next arrow
            String month = driver.findElement(By.xpath("this is text")).getText(); //
            if (month.equals(m)) {
                driver.findElement(By.linkText(d)).click();
                break;
            }

        }
    }
}

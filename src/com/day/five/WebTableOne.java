package com.day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableOne {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\my-projects\\chromedriver_win32\\chromedriver.exe");
        var driver = new ChromeDriver();  
        
        driver.get("file:///D:/personal/my-projects/SeleniumFiles/WebTable.html");
        
        //int rows = driver.findElements(By.tagName("tr")).size();
        
        int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
        
        System.out.println("No of rows in table are ---> " + rows);
        
        for(int r = 2; r < rows; r++) {
        	for(int c = 1; c < cols; c++ ) {
        		String value = driver.findElement(By.xpath("/html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText();
        		System.out.println(value);
        	}
        }
	}

}

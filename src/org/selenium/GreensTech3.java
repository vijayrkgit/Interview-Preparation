package org.selenium;            // not ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech3 {
	public static void main(String[] args)   {
		// set propertity
		System.setProperty("webdriver.chrome.driver","E:\\program\\Avenger\\driver\\chromedriver.exe");
		// browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		// get title-----> for show tab
		String title = driver.getTitle();
		System.out.println(title);
		// get url-------> for show tab
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// creat object
		WebElement search = driver.findElement(By.id("input"));
		// insert
		search.sendKeys("GreensTechnology"); 
		// close
		driver.close();
		   
	}

}

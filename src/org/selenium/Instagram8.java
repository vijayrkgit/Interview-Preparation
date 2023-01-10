package org.selenium;                          // testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_\\Avenger\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		WebElement search = driver.findElement(By.name("username"));                
		search.sendKeys("vijay@123");
		Thread.sleep(2000);
		WebElement searchpass = driver.findElement(By.name("password"));                    
		searchpass.sendKeys("01234567893210");
		Thread.sleep(1000);
		driver.close();
		 

}

}
 
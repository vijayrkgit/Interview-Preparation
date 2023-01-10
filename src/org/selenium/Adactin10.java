package org.selenium;          // testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_\\Avenger\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys("vijay@123");
		Thread.sleep(2000);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement txtlog = driver.findElement(By.id("login"));
		txtlog.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}

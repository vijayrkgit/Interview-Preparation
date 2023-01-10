package org.selenium;          // testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\program\\Avenger\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement search = driver.findElement(By.id("userName"));
		search.sendKeys("vijay@123");
		Thread.sleep(1000);
		WebElement searchent = driver.findElement(By.id("checkUser"));
		searchent.click();
		Thread.sleep(1000);
		driver.close();
		 
}
}

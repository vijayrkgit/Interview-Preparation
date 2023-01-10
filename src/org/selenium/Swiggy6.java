package org.selenium;                 //testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy6 {
	public static void main(String[] args) throws InterruptedException {
		// set propertity
		System.setProperty("webdriver.chrome.driver","E:\\program\\Avenger\\driver\\chromedriver.exe");
		// Browser launch 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		// get title-----> for show tab
		String title = driver.getTitle();
		System.out.println(title);
		// get url-------> for show tab
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// create object
		WebElement search = driver.findElement(By.id("location"));
		// insert
		search.sendKeys("thuraipakam");
		// time
		Thread.sleep(1000);
		// close
		driver.close();
								
	}

}

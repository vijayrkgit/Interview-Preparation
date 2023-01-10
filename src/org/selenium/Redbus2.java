package org.selenium;             // testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus2 {
	public static void main(String[] args) throws InterruptedException {
		// set propertity
		System.setProperty("webdriver.chrome.driver","E:\\program\\Avenger\\driver\\chromedriver.exe");
		// browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		// get title-----> for show tab
		String title = driver.getTitle();
		System.out.println("title");
		// get url-------> for show tab
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl");
		// creat object
		WebElement txtuser = driver.findElement(By.id("src"));
		// insert
		txtuser.sendKeys("sethiyathope");
		// creat object
		WebElement txtuser1 = driver.findElement(By.id("dest"));
		// insert
		txtuser1.sendKeys("chennai");
		//time
		Thread.sleep(2000);
		// close
		driver.close();
	}

}

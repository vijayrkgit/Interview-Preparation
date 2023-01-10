package org.selenium;                // testing ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		//set the property
		System.setProperty("webdriver.chrome.driver", "E:\\program\\SeleniumProject\\Driver\\chromedriver.exe" );
		// Browser launch 
		// Instalazition browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	 	String title = driver.getTitle();
	 	System.out.println("title");
	 	String currentUrl = driver.getCurrentUrl();
	 	System.out.println("currentUrl");
		// creat object
	 	WebElement userName=driver.findElement(By.id("email"));
		// insert
	 	userName.sendKeys("vijay2354178");
	 	Thread.sleep(1000);
		// creat object 
	 	WebElement userName1= driver.findElement(By.id("pass"));
		// insert 
	 	userName1.sendKeys("vj@1123.com");
	 	// time
	 	Thread.sleep(2000);
		// close
	 	driver.quit();
	}

}
//String title = driver.getTitle();
//	System.out.println("title");
//	String currentUrl = driver.getCurrentUrl();
//	System.out.println("currentUrl");
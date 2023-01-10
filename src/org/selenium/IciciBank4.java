package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank4 {
	public static void main(String[] args)   {
		// set propertity
		System.setProperty("webdriver.chrome.driver","E:\\program\\Avenger\\driver\\chromedriver.exe");
		// browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		// get title-----> for show tab
		String title = driver.getTitle();
		System.out.println(title);
		// get url-------> for show tab
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// creat object
		WebElement search = driver.findElement(By.id(""));
		// insert
		search.sendKeys(""); 
		// close
		driver.close();	 
		   
	}

}

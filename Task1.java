package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		//get - getting the ip adress from the chrome
		
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.youtube.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().back();
		driver.navigate().to("https://twitter.com/?lang=en");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		driver.quit();

			
		
	}



}

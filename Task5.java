package com.seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		List<WebElement> s = driver.findElements(By.tagName("iframe"));
		int size = s.size();
		System.out.println(size);
		driver.switchTo().frame("frame1");
		WebElement f = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
		System.out.println(f.getText());
		
		
		
		
	}

}

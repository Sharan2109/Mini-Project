package com.seleniumtask;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task9 {
	//amazon
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		//right click using actions
		Actions a = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		a.moveToElement(rc).perform();
		a.contextClick(rc).perform();
		
		Thread.sleep(2000);
		//performing down and enter using robot 
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		//performing down and enter using robot 
		WebElement rc1 = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		a.contextClick(rc1).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		//performing down and enter using robot 
		
		
		WebElement rc2 = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		a.contextClick(rc2).perform();
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		
	}

}

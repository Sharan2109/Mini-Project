package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project2 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='View Basket']")).click();
		//cant click increament button
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//input[@type='number']"));
		f.clear();
		f.sendKeys("5");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		//to be cotinue
	}

}

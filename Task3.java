package com.seleniumtask;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
	public static void main(String[] args) throws Throwable {
		
		//creting fb login page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//button[@name='login']")).click();
		

		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(4000);
		 
//		 entering name,password,gmail
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sharan");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("charliee");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sharanmurthy99@gmail.com");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345asdfg");
		 driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		 driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("sharanmurthy99@gmail.com");
		 
		 //dropdown
		 
		 WebElement date = driver.findElement(By.id("day"));
		 Select s = new Select(date);
		 s.selectByValue("21");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select s1 = new Select(month);
		 s1.selectByIndex(3);
		 
		 WebElement year = driver.findElement(By.id("year"));
		 Select s2 = new Select(year);
		 s2.selectByVisibleText("1999");
		 
		 //click login page
		 
		 driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		 
		 Thread.sleep(4000);
		 
			TakesScreenshot n = (TakesScreenshot)driver;
			File f = n.getScreenshotAs(OutputType.FILE);
			File m = new File("C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\screenshots\\fblogin.png");
			FileHandler.copy(f, m);
			
	}

}

package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.cowin.gov.in/");
				driver.manage().window().maximize();
				WebElement state = driver.findElement(By.xpath("//span[text()='Select Your State']"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();",state);
				 js.executeScript("arguments[0].click();", state);
				 
				 Thread.sleep(2000);
				
				WebElement state2 = driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']"));
				state2.click();
//				System.out.println(state2.getText());
				 Thread.sleep(2000);
				
//				driver.findElement(By.xpath("//span[text()='Select District']")).click();
//				driver.findElement(By.xpath("//span[text()=' Chennai ']")).click();
				 
				 WebElement city = driver.findElement(By.xpath("//span[text()='Select District']"));
				 
				 js.executeScript("arguments[0].scrollIntoView();",city);
				 js.executeScript("arguments[0].click();", city);
				 
				 driver.findElement(By.xpath("//span[text()=' Chennai ']")).click();
				 
				WebElement btn = driver.findElement(By.xpath("//button[text()='Search']"));
				 
//				btn.click();
				
				 js.executeScript("arguments[0].scrollIntoView();",btn);
				 js.executeScript("arguments[0].click();", btn);
				
				
				 Thread.sleep(2000);
//				
//				 WebElement hospital = driver.findElement(By.xpath("(//div[@class='center-name-box'])[1]"));
//				 
//				System.out.println(hospital.getText());
				
				WebElement addrs = driver.findElement(By.xpath("(//p[@class='center-name-text'])[1]"));
				String txt = addrs.getText();
				System.out.println();
				 

}
}
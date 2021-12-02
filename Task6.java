package com.seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) throws Throwable {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://demoqa.com/nestedframes");
			Thread.sleep(3000);
			List<WebElement> f = driver.findElements(By.tagName("iframe"));
			System.out.println(f.size());
			WebElement outer = driver.findElement(By.id("frame1"));
			driver.switchTo().frame(outer);
			WebElement inner = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
			driver.switchTo().frame(inner);
			WebElement inner1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
			System.out.println(inner1.getText());
			driver.switchTo().parentFrame();
			Thread.sleep(3000);
			WebElement outer1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
			System.out.println(outer1.getText());
			
	}

}

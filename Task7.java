package com.seleniumtask;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(3000);
		List<WebElement> f = driver.findElements(By.tagName("frameset"));
		System.out.println(f.size());
		driver.switchTo().frame("frame-top");
		WebElement left = driver.findElement(By.name("frame-left"));
		driver.switchTo().frame(left);
		WebElement left1 = driver.findElement(By.tagName("body"));
		System.out.println(left1.getText());
		driver.switchTo().parentFrame();
     	WebElement middle = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middle);
		WebElement middle1 = driver.findElement(By.tagName("body"));
		System.out.println(middle1.getText());
		driver.switchTo().parentFrame();
		WebElement right = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(right);
		WebElement right1 = driver.findElement(By.tagName("body"));
		System.out.println(right1.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement bottom = driver.findElement(By.tagName("body"));
		System.out.println(bottom.getText());
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\screenshots.png");
		FileUtils.copyFile(screenshotAs, dest);
		
		
		
		
		
		
	}

}

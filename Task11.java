package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	
	//youutube video check
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("selenium");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		
//		WebElement video = driver.findElement(By.xpath("//html/body/ytd-app/div/ytd-page-manager/ytd-search/div/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-video-renderer[1]/div[1]"));
//video.click();
		//selecting video nd getting title name
		
		WebElement video = driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Selenium Full Course - Lea')]"));
		video.click();
		String videoo = video.getText();
		System.out.println(videoo);
		//using action moving the cursor to the video and click to pause the video
		
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement vdo = driver.findElement(By.xpath("//video[@controlslist='nodownload']"));
		a.moveToElement(vdo);
		vdo.click();
		System.out.println("video paused");
		
		Thread.sleep(2000);
		
		//getting the tittle from the paused video
		
		WebElement title = driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Selenium Full Course - Learn')])[1]"));
		String titlee = title.getText();
		System.out.println(titlee);
		
		
		WebElement btn = driver.findElement(By.xpath("//button[@aria-label='Play (k)']"));
		btn.click();
		 // checking equals or not
		
		if (videoo.equals(titlee)) {
			System.out.println("video title is matched");
		}
		
		
		
	}

}

package com.seleniumtask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		//to get only single row
		
		List<WebElement> rw = driver.findElements(By.tagName("tr"));
		int s = rw.size();
		System.out.println(s);
		for (int i = 0; i <s; i++) {
			if (i==5) {
				System.out.println(rw.get(i).getText());
				System.out.println("**************************");
			}
			
		}
      	
	//to get only single data
		List<WebElement> rw2 = driver.findElements(By.tagName("tr"));
		int s1 = rw2.size();
		//System.out.println(s1);
		for (int i = 0; i < s1; i++) {
			if (i==6) {
				List<WebElement> dataa = driver.findElements(By.tagName("td"));
				int s2 = dataa.size();
				//System.out.println(s2);
				for (int j = 0; j < s2; j++) {
					if (j==18) {
						    System.out.println(dataa.get(j).getText());
					}
					
				}


				
				
					
				}
			}
			
		}
	
			
		
		
	}	
		
	


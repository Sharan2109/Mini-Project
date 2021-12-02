package com.seleniumtask;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email_create")).sendKeys("sharan1234@ail.com");
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		String t = driver.getTitle();
		System.out.println("The title of login page :"+t);
		Thread.sleep(8000);
		driver.findElement(By.id("id_gender1")).click();
		String url = driver.getCurrentUrl();
		System.out.println("the url of this page is : "+url);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")).sendKeys("sharan");
		driver.findElement(By.id("customer_lastname")).sendKeys("murthy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		WebElement date = driver.findElement(By.id("days"));
		Select s = new Select(date);
		s.selectByIndex(21);
		WebElement month = driver.findElement(By.id("months"));
		Select s2 = new Select(month);
		s2.selectByIndex(4);
		WebElement year = driver.findElement(By.id("years"));
		Select s3 = new Select(year);
		s3.selectByValue("1999");
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("company")).sendKeys("greens");
		driver.findElement(By.id("address1")).sendKeys("no 25 , ags street");
		driver.findElement(By.id("address2")).sendKeys("valsaravakkam");
		WebElement cty = driver.findElement(By.id("city"));
		cty.sendKeys("chennai");
		System.out.println(cty.getAttribute("value"));
//		System.out.println("the city is :"+cty.getText());
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4 = new Select(state);
		s4.selectByValue("43");
		
		List<WebElement> ss = s4.getOptions();
		int s5 = ss.size();
		for (int i = 0; i < s5; i++) {
			if (ss.get(i).getText().equalsIgnoreCase("Texas")) {
				System.out.println(ss.get(i).getText());
			}
			System.out.println(s5);
			
		}
		
		
		
		driver.findElement(By.id("postcode")).sendKeys("30034");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("99949994773");
		
		driver.findElement(By.id("alias")).sendKeys("xxx , yyyyy , zzzzz");
		
		//driver.findElement(By.xpath("//span[text()='Register']")).click();

//	   TakesScreenshot n = (TakesScreenshot)driver;
//	   File f1 = n.getScreenshotAs(OutputType.FILE);
//	   file f2 = new File("C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\screenshots\\mini_project.png");
//	  
	}

}

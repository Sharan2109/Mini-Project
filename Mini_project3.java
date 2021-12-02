package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_project3 {
	
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(3000);
		//selecting the one way
		driver.findElement(By.id("One Way")).click();
		Thread.sleep(2000);
		//selecting the country
		driver.findElement(By.xpath("//div[@data-testid='source-field']")).click();
		Thread.sleep(2000);
		
		//selecting the state 
		 driver.findElement(By.xpath("(//button[contains(@class,'arrival-dropdown-list-grou')])[2]")).click();
		 Thread.sleep(2000);
		//selecting the box the getting the text in the box
		WebElement up = driver.findElement(By.xpath("//div[@data-testid='source-field']"));
		System.out.println(up.getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(@class,'arrival-dropdown-list-grou')])[3]")).click();
		Thread.sleep(2000);
		
		WebElement down = driver.findElement(By.xpath("//div[@data-testid='destination-field']"));
		System.out.println(down.getText());
		System.out.println("*************************");
		
		driver.findElement(By.xpath("(//div[@class='react-google-flight-datepicker'])[1]")).click();
		
		WebElement dec = driver.findElement(By.xpath("//div[text()='Dec 2021']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",dec);
		
		Thread.sleep(2000);
		
// tried to select 31 using actions ,it is working but selecting wrong date
		
//		WebElement dec31 = driver.findElement(By.xpath("(//div[@data-day-index='31'])[1]"));
//		js.executeScript("arguments[0].scrollIntoView();",dec31);
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click();",dec31 );
//
//		Actions a = new Actions(driver);
//		a.moveToElement(dec31).perform();
//	    a.click().perform();
		
		
//		selected dec31 using js , not using actions and clcik method
		WebElement dec31 = driver.findElement(By.xpath("(//div[text()='31'])[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",dec31);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",dec31 );
		
		//selecting the date and getting back nd printing the date 
		
		driver.findElement(By.xpath("//button[text()='Back']")).click();
		
		WebElement date = driver.findElement(By.xpath("(//div[contains(@class,'react-google-')])[1]"));
		String dt = date.getText();
		System.out.println("the selected date is :"+dt);
		System.out.println("*************************");
		
		Thread.sleep(2000);
		//finding the special fairs button
		driver.findElement(By.xpath("//div[text()='Special Fares']")).click();
		//increasing the adult count 
		WebElement btn = driver.findElement(By.xpath("(//img[@alt='plus'])[1]"));
		btn.click();
		btn.click();
		//increasing the seniour citizenship count
		WebElement btn2 = driver.findElement(By.xpath("(//img[@alt='plus'])[4]"));
		btn2.click();
		//clciking the done button
		WebElement dn = driver.findElement(By.xpath("//button[text()='Done']"));
		js.executeScript("arguments[0].scrollIntoView();",dn);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",dn );
		//printing the no of passengers
		WebElement passengers = driver.findElement(By.id("flight-search-passenger-count"));
		String psngr = passengers.getText();
 		System.out.println("no of total passengers : "+psngr);
 		System.out.println("*************************");
 		
 		//clicking the search button
 		WebElement enter = driver.findElement(By.xpath("//img[@alt='select']"));
 		enter.click();
 		Thread.sleep(4000);
		//selecting stop 1
 		
 		driver.findElement(By.xpath("//input[@name='onestop']")).click();
 		
 		//selecting arrival after 6
 		WebElement arrival = driver.findElement(By.xpath("(//label[text()='After 6 PM'])[2]"));
 		js.executeScript("arguments[0].scrollIntoView();",arrival);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",arrival );
		System.out.println(arrival.getText());
		System.out.println("*************************");
		
		//finding the economy by clicking it
		Thread.sleep(2000);
		WebElement eco = driver.findElement(By.xpath("//span[text()='Economy']"));
		js.executeScript("arguments[0].scrollIntoView();",eco);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",eco );
		System.out.println(eco.getText());
		System.out.println("*************************");
		Thread.sleep(2000);
		//selecting the price nd printing it
		WebElement prc = driver.findElement(By.xpath("//html/body/div/div/div[144]/div/div/div/div[2]/div/div[2]/div/div/div/div[4]/main/div/label/div/span/input"));
		js.executeScript("arguments[0].click();",prc );
		Thread.sleep(2000);
		String p = prc.getText();
		System.out.println("the lowest price is :"+p);
		
		//clicking the continue button
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	}

}

package com.seleniumtask;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Mini_Project_Secondhalf {
	
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(2000);
		
		//login by entering id and password
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("sharan1234@mail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(2000);

		
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).perform();
		
		driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[1]")).click();
		
		WebElement quickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		a.moveToElement(quickview).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='quick-view-mobile']")).click();
		Thread.sleep(4000);
		
		WebElement frameee = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		
		//switching from normal to frame
		driver.switchTo().frame(frameee);
		
			
		for (int i = 0; i <4 ; i++) {
				driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]")).click();
		}
		
		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add_to_cart")).click();
		
		Thread.sleep(2000);
		
		//switching from frame to normal
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='cgv']")).click();
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		
		
//		TakesScreenshot n = (TakesScreenshot)driver;
//		File f = n.getScreenshotAs(OutputType.FILE);
//		File m = new File("C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\screenshots//minipro.png");
//		FileHandler.copy(f, m);
//		
//		

		
	}

}

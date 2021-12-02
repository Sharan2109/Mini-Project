package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task8 {
	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sharan");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("murthy");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("no 25 , asd street ,valasarvakkam");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sharan123@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9911223346");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement i = driver.findElement(By.id("msdd"));
		i.click();
		WebElement j = driver.findElement(By.xpath("//a[text()='English']"));
		j.click();
		WebElement k = driver.findElement(By.xpath("//a[text()='Japanese']"));
		k.click();
		WebElement l = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		
		Select s = new Select(l);
		s.selectByValue("Engineering");
		
		WebElement m = driver.findElement(By.xpath("//span[@role='combobox']"));
		m.click();
		
		WebElement n = driver.findElement(By.xpath("(//li[@role='treeitem'])[6]"));
		n.click();
		
		WebElement o = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		
		Select s1 = new Select(o);
		s1.selectByValue("1999");
		
		WebElement x = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s2 = new Select(x);
		s2.selectByValue("April");
		
		WebElement y = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s3 = new Select(y);
		s3.selectByValue("21");
		
		WebElement z = driver.findElement(By.id("firstpassword"));
		z.sendKeys("123456");
		
		WebElement z1 = driver.findElement(By.id("secondpassword"));
		z1.sendKeys("123456");
		
		
		
		
		
		

		



		
		
	}

}

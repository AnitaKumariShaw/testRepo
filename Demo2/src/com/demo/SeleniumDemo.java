package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anita.kumari.shaw\\eclipse-workspace\\Demo2\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		
		//driver.close();
		


	}

}

package com.gwcc.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadInSeelenium {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITA\\git\\testRepo\\Test\\Executables\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://xndev.com/display-image/");
		//driver.get(https://www.google.com/);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void uploadFeature() throws IOException {
		//using sendkeys which directly take the path and upload it from backened
		//driver.get("https://xndev.com/display-image/");
//		WebElement uploadElement =driver.findElement(By.xpath("//img[@id='blah']/parent::div/input"));
//		uploadElement.sendKeys("E:\\2019_Documents\\JavascriptInSelenium.docx");
		
		//filrbin.net 's upload practice
		/*WebElement uploadElement =driver.findElement(By.xpath("//input[@id='fileField']"));
		uploadElement.sendKeys("E:\\2019_Documents\\JavascriptInSelenium.docx");
		System.out.println("Dpcument Uploaded successfully");*/
		
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='imagesrc']"));
//		uploadElement.sendKeys("E:\\2019_Documents\\JavascriptInSelenium.docx");
		//uploadElement.click();
//		JavascriptExecutor exec =  (JavascriptExecutor) driver;
//		exec.executeScript("arguments[0].click();", uploadElement);
		
		//Using Actions, it is working 
		Actions action = new Actions(driver);
		action.moveToElement(uploadElement).click().build().perform();
		Runtime.getRuntime().exec("E:\\E drive\\AutoIT_Selenium\\FileUpoad.exe");
		System.out.println("Document Uploaded successfully");
		
		/*ControlFocus("Open","","Edit1")
		ControlSetText("Open","","Edit1","E:\2019_Documents\JavascriptInSelenium.docx")
		ControlClick("Open","","Button1")
*/
		
	//	https://gopekannan.wordpress.com/2017/11/14/how-to-execute-autoit-script-using-jenkins/
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
	}

}

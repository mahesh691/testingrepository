package com.Listener_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.Listener_Demo.ListenerTest.class)
public class Testcase {
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		 driver= new FirefoxDriver();		
	}
	
	@Test(priority = 1)	
	public void Login()				
	{		
					

	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();
	    
	    driver.switchTo().alert().accept();
	}		

	// Forcefully failed this test as to verify listener.		
	@Test(priority = 2)		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}
	
	@AfterTest
	public void teardown() {
		driver.close();	
	}
	
}

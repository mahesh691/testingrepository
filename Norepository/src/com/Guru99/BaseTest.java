package com.Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver=null;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\Norepository\\DriverFiles\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
	
	
	
}

package com.Basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
	public String url="http://newtours.demoaut.com/";
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\newto\\DriverFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}

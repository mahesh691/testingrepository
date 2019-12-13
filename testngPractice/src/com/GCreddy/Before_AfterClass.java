package com.GCreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_AfterClass {
	WebDriver driver = null;


	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	@Test(priority = 1)
	public void verifyTitle() {
		driver.get("http://www.google.com");
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, "Google");
	}	
	@Test(priority = 2)
	public void verifygcrshop() {
	driver.get("http://www.gcrit.com/build3/");	
	String pagetitle1=driver.getTitle();
	Assert.assertEquals(pagetitle1, "GCR Shop");
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
}
	}

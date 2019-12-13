package com.GCreddy;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest extends newTestp {
 
  
		
	
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
	
	}


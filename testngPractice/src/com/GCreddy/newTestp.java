package com.GCreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class newTestp {
	static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@AfterTest
	public void closeBrowser() {
	driver.close();
	}
	
}

package com.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	
		public  ExtentReports report;
		WebDriver driver=null;
		public  ExtentTest test;

		ExtentHtmlReporter extent = new ExtentHtmlReporter("E:\\JavaProgrammes\\JAVAProgrammes\\Reports\\Reports.html");
		
		@BeforeTest
		public  void startTest()
		{
			report = new ExtentReports();
			report.attachReporter(extent);
//		    test=report.createTest("startTest");
		    test=report.createTest("guest");

		 System.setProperty("webdriver.geckodriver.driver", "E:\\JavaProgrammes\\JAVAProgrammes\\DriverFiles\\geckodriver.exe");
			
		 driver = new FirefoxDriver();
	
		 driver.get("https://www.google.co.in");
		}
	
		@Test
	
		public void extentReportsDemo()
	
		{
		 if(driver.getTitle().equals("Google"))
		 {
			 
		test.pass("Navigated to the specified URL");
		test.log(Status.PASS, "Navigated to the specified URL");
	
		}
	
		else
	
		{
//		test.fail("Test Failed");
		test.log(Status.FAIL, "Test Failed");
	
		}
	
		}
	
		@AfterTest
	
		public void endTest()
		{
		driver.quit();	
		report.flush();
	
		}
	
		}
	

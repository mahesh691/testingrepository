package com.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Pages.Dresses;
import com.Pages.Tshirts;
import com.Utilty.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class DressesTest extends BaseTest {

	 public DressesTest() {
		 
		 super();
		 
	}
	 Dresses dr;
	 public ExtentTest Test1;
	 @BeforeTest
		public void setUp() {
			initialization();
			dr=new Dresses();
			Log.info("Dresses classs started");
			Test1=reports.createTest("Dresses Test");	
		}
		
		@Test(priority = 1, groups = {"retesting"})
		public void logotestvalidation() {
			dr.logoTest(); 
			Assert.assertTrue(true);
		}
		
		@Test(priority = 2, groups = {"regression"})
		public void numbertestvalidation() {
			String phno=dr.numberTest();
			String exp="0123-456-789";
			Assert.assertEquals(exp, phno);

		}
		
		@Test(priority = 3, groups = "retesting")
		public void womentestvalidation() throws InterruptedException, IOException {
			dr.womenpage();
			Assert.assertEquals(driver.getTitle(), "Women - My Store");

		}
		@Test(priority = 4,groups = "regression")
		public void dresstestvalidation() throws InterruptedException {
			 
			try{
				dr.dressespage();
				 Thread.sleep(3000);
				Assert.assertEquals(driver.getTitle(), "Dresses - My Store");

				
				 TakesScreenshot ts=(TakesScreenshot)driver;
				 File fis=ts.getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(fis, new File("./screenshots/Dresses.png")); 				 
				 
				Thread.sleep(2000);
				driver.navigate().back();
					Thread.sleep(2000);
			}catch (Exception e) {


			}
			
		}
		
		@Test(priority = 5, groups = "retesting")
		public void tshirttestvalidation() throws InterruptedException {
				dr.tshirtpage(); 
				Thread.sleep(3000);
				Assert.assertEquals(driver.getTitle(), "T-shirts - My Store");
				Thread.sleep(3000);

				driver.navigate().back();

			
		}
		
		@AfterMethod
		public void getresult(ITestResult result) {
			
			if(result.getStatus() == ITestResult.FAILURE) {
				Test1.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
				Test1.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	        	Test1.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	        	Test1.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        	Test1.skip(result.getThrowable());
	        }
		}
		@AfterTest 
		public void tearDown(){
			reports.flush();
			driver.quit();
		}
	
}

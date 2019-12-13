package com.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Base.BaseTest;
import com.Pages.Tshirts;
import com.Utilty.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TshirtsPageTest extends BaseTest {

 public TshirtsPageTest() {
		 
		 super();
		 
	}
 Tshirts Ts;
	 public ExtentTest Test3;
	
	@BeforeTest
		public void setUp() {
			initialization();
			Ts=new Tshirts();
			Log.info("Tshirts classs started");
			Test3=reports.createTest("Tshirts");
			
		}
		
		@Test(priority = 1, groups = {"retesting"})
		public void logotestvalidation() {
			Ts.logoTest(); 
			Assert.assertTrue(true);
		}
		
		@Test(priority = 2, groups = { "regression"})
		public void numbertestvalidation() {
			String phno=Ts.numberTest();
			String exp="0123-456-789";
			Assert.assertEquals(exp, phno);

		}
		
		@Test(priority = 3, groups = {"retesting"})
		public void womentestvalidation() throws InterruptedException, IOException {
			try{
				Ts.womenpage();
				 Thread.sleep(3000);
				 if(driver.getTitle().equals("Women - My Store")) {
					 Assert.assertEquals(driver.getTitle(), "Women - My Store");
					 Thread.sleep(3000);
				
					 	TakesScreenshot ts=(TakesScreenshot)driver;
					 	File fis=ts.getScreenshotAs(OutputType.FILE);
					 	FileUtils.copyFile(fis, new File("./screenshots/Womenlink12.png")); 				 
				 
					 	Thread.sleep(2000);
					 	driver.navigate().back();
					 	Thread.sleep(2000);
					 	}
				 else 
				 {
						Assert.assertTrue(false);
					}
				 
			}catch (Exception e) {	
			e.printStackTrace();
			}
		}
		@Test(priority = 4,groups = "regression")
		public void dresstestvalidation() throws InterruptedException {
			Ts.dressespage(); 
			 Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Dresses - My Store");
			Thread.sleep(3000);

			driver.navigate().back();
			
		}
		
		@Test(priority = 5, groups = {"retesting"})
		public void tshirttestvalidation() throws InterruptedException {
				Ts.tshirtpage(); 
				Thread.sleep(3000);
				Assert.assertEquals(driver.getTitle(), "T-shirts - My Store");
				Thread.sleep(3000);

				driver.navigate().back();

			
		}
		
		@AfterMethod
		public void getresult(ITestResult result) {
			
			if(result.getStatus() == ITestResult.FAILURE) {
				Test3.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
				Test3.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	        	Test3.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	        	Test3.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        	Test3.skip(result.getThrowable());
	        }
		}
		@AfterTest 
		public void tearDown(){
			reports.flush();
			driver.quit();		}
}

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
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.Pages.HomePage;
import com.Pages.Tshirts;
import com.Utilty.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class HomepageTest extends BaseTest {

	HomePage hp;
	public ExtentTest Test2;
	public  HomepageTest() {
		super();
	}
	
	
	
	@BeforeTest
	public void setUp() {
		initialization();
		hp=new HomePage();
		Log.info("homepage classs started");
		Test2=reports.createTest("HomePage test");
		
	}
	
	@Test(priority = 1, groups = "retesting")
	public void logotestvalidation() {
		hp.logoTest(); 
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, groups = "regression")
	public void numbertestvalidation() {
		String phno=hp.numberTest();
		String exp="0123-456-789";
		Assert.assertEquals(exp, phno);

	}
	
	@Test(priority = 3, groups = "retesting")
	public void womentestvalidation() throws InterruptedException, IOException {
		try{
			hp.womenpage();
			 Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle(), "Women - My Store");

			
			 TakesScreenshot ts=(TakesScreenshot)driver;
			 File fis=ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(fis, new File("./screenshots/Womenlink12.png")); 				 
			 
			 Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
		}catch (Exception e) {

			Assert.assertEquals(driver.getTitle(), "Women - My Store");
			 Thread.sleep(2000);
				 TakesScreenshot ts=(TakesScreenshot)driver;
				 File fis=ts.getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(fis, new File("./screenshots/Womenlink12.png"));

		}
		
		
		
	
	}
	@Test(priority = 4,groups = "regression")
	public void dresstestvalidation() throws InterruptedException {
		hp.dressespage(); 
		 Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Dresses - My Store");
		Thread.sleep(3000);

		driver.navigate().back();
		
	}
	
	@Test(priority = 5, groups = "retesting")
	public void tshirttestvalidation() throws InterruptedException {
			hp.tshirtpage(); 
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle(), "T-shirts - My Store");
			Thread.sleep(3000);

			driver.navigate().back();

		
	}
	
	@AfterMethod
	public void getresult(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			Test2.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
			Test2.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
        	Test2.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
        	Test2.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
        	Test2.skip(result.getThrowable());
        }
	}
	@AfterTest 
	public void tearDown(){
		reports.flush();
		driver.quit();
	}

}

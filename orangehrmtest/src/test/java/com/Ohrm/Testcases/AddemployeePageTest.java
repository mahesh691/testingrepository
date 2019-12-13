package com.Ohrm.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ohrm.Basetest.TestBase;
import com.Ohrm.Page.HomePage;
import com.Ohrm.Page.LoginPage;
import com.Ohrm.Page.addemployeepage;
import com.Ohrm.Utility.Log;
import com.Ohrm.Utility.TestUtil;
import com.aventstack.extentreports.Status;

public class AddemployeePageTest extends TestBase {
	HomePage HomePage;
	LoginPage LoginPage;
	addemployeepage addemployeepage;
	
	public AddemployeePageTest() {
		super(); 
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		HomePage=new HomePage();
		LoginPage= new LoginPage();
		Log.info("orange hrm launched successfully");
		Test=reports.createTest("addemployee page  test");	
		LoginPage.loginPagevalid(prop.getProperty("username"), prop.getProperty("password"));
		Test.pass("successfully login page ");
		
	}
	@Test(priority = 1)
	public void verifyemployeepagelbeltest() throws InterruptedException   {
		addemployeepage=HomePage.clickonaddemployee();
		Thread.sleep(5000);
		String adelabel=addemployeepage.verifyaddemployeelabel();
		if(adelabel.equals("Add Employee")){
			Test.pass("successfully addemplyeepage opened:");
			Log.info("successfully  addemplyeepage opened:");
		}else {
			Test.fail("failed to addemplyeepage opened:");
			Log.info("failed to addemplyeepage opened:");
		}
		
	}
	
	@DataProvider
	public Object[][] getaddempdata() throws IOException{
		
		Object[][] data=TestUtil.getTestData("OHRMaddE");
		return data;
		
	}
	@Test(priority = 2, dataProvider  = "getaddempdata")
	public void addemployeepagetest(String fn1,String ln1) throws InterruptedException  {
		HomePage.clickonaddemployee();
		addemployeepage.createNewEmployee(fn1, ln1);
	}
	
	
	@AfterMethod
	public void tearDown() {
		reports.flush();
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

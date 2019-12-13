package com.Ohrm.Testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Ohrm.Basetest.TestBase;
import com.Ohrm.Page.LoginPage;
import com.Ohrm.Utility.Log;
import com.Ohrm.Utility.TestUtil;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
LoginPage LoginPage;

public LoginPageTest() {
	super();
}
	@BeforeTest
	public void setup() {
		initialization();
		
		LoginPage= new LoginPage();
		Log.info("orange hrm launched successfully");
		Test=reports.createTest("login test");
}
	
	@Test(priority = 1)
	public void loginPagevalid() {
		boolean flag=LoginPage.logoValid();
		Log.info("logo image display status :"+flag);
		Test.pass("logo image display status :"+flag);
		
	}
	
	@Test(priority = 2)
	public void loginPagevalidtest() {
		String title=LoginPage.loginPagevalid();
		Assert.assertEquals("OrangeHRM", title);
		Log.info("loginpage successfully validate of page title");
		Test.pass("loginpage successfully validate of page title");
		
	}
	
	@DataProvider
	public Object[][] gettestdata() throws IOException {
		Object data[][]=TestUtil.getTestData("OrangeHRM");
		return data;
	}
	
	@Test(priority = 3, dataProvider = "gettestdata")
	public void logintest(String un,String pw) throws InterruptedException, IOException {
		
//		LoginPage.loginPagevalid(prop.getProperty("username"), prop.getProperty("password"));

		LoginPage.loginPagevalid(un, pw);
		Log.info("entered username and password");
		Thread.sleep(10000);
		String currenturl=driver.getCurrentUrl();
if(currenturl.contains("dashboard")) {
	Log.info("successfully login in to homepage");
	Test.pass("successfully login in to homepage");
	
	driver.navigate().back();
	
}else {
	Log.info("failed to login to homepage");
	Test.fail("failed to login to homepage");
	
	TakesScreenshot	ts=(TakesScreenshot)driver;
	File bing_ScreenShot=ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(bing_ScreenShot,new File("E:\\JavaProgrammes\\orangehrmtest\\ss\\"+un+".png"));
		
		
	}
	}
	
	
	
	@AfterTest
	public void tearDown() {
		reports.flush();
		driver.quit();
	}
	
	
	
}

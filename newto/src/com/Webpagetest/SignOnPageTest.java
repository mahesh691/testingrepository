package com.Webpagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Basetest.BaseTest;
import com.Utilities.TestDataProvider;
import com.Webpages.SignOnPage;



public class SignOnPageTest extends BaseTest
{
	SignOnPage signOn;
	
	@Test(priority=1)
	public void verifyTitleTest()
	{
		signOn=PageFactory.initElements(driver, SignOnPage.class);
		signOn.clickOnsignOnLink( );
		if(signOn.getPageTitle().equals("Sign-on: Mercury Tours"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	
	@Test(priority=2, dataProvider = "gatdata")
	public void signOnTest(String userName, String password) throws InterruptedException
	{
		signOn=PageFactory.initElements(driver, SignOnPage.class);
		signOn.setUserName(userName);
		signOn.setPassword(password);
		Thread.sleep(10000);
		signOn.clickOnLogin();
		Thread.sleep(10000);

		signOn.validateSignOn("Find a Flight: Mercury Tours:");
		signOn.getPageTitle();
		
		
		
	}
	@DataProvider(name = "gatdata")
	public Object[][] getTestData()
	{
		return TestDataProvider.getTestdatasheet("NewtourRegister");
	}
	
}

package com.Webpagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Basetest.BaseTest;
import com.Utilities.TestDataProvider;
import com.Webpages.AccountSuccessPage;
import com.Webpages.HomePage;
import com.Webpages.RegisterPage;



public class RegisterPageTest extends BaseTest
{
	public RegisterPage register;
	public HomePage homePage;
	public AccountSuccessPage accountSuccessPage;
	
	@Test(priority=1)
	public void verifyRegisterPageTitleTest()
	{
		register=PageFactory.initElements(driver, RegisterPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		homePage.clickOnRegisterLink();
		if(register.getPageTitle().equals("Register: Mercury Tours"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	
	@Test(priority=2, dataProvider="registerTestData")
	public void newRegisterTest(String firstName,String lastName, String phone, String userName, String address1, 
			String address2, String city, String state, String postalCode, String country, 
			String email, String password, String cofirmPassword ) throws InterruptedException
	{
		register=PageFactory.initElements(driver, RegisterPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		System.out.println("above click on registerpage");
		homePage.clickOnRegisterLink();
		System.out.println("click on registerlink");
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setPhone(phone);
		register.setUserName(userName);
		register.setAddress1(address1);
		register.setAddress2(address2);
		register.setCity(city);
		register.setState(state);
		register.setPostalCode(postalCode);
		register.setCountry(country);
		register.setEmail(email);
		register.setPassword(password);
		register.setConfirmPassword(cofirmPassword);
		System.out.println("above click on");
		register.clickOnRegister();
		System.out.println("click on register");
System.out.println(register.successpagetitle().contains(email));
		
	}
	@DataProvider
	public Object[][] registerTestData()
	{
		return TestDataProvider.getTestdatasheet("Sheet3");
	}
}

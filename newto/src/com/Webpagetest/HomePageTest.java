package com.Webpagetest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Basetest.BaseTest;
import com.Utilities.TestDataProvider;
import com.Webpages.HomePage;



public class HomePageTest extends BaseTest
{
	HomePage homePage;

//	@Test(priority=1)
//	public void verifyTitleTest()
//		{
//		homePage=PageFactory.initElements(driver, HomePage.class);
//		if(homePage.validateLogin("Welcome: Mercury Tours")==true){
//			System.out.println("successfully opened homepage");
//		}else {
//			System.out.println("failed to opened homepage");
//		}
//	}
//	
//	
//		@Test(priority=2)
//		public void verifyTitlecarrentalTest()
//			{
//			homePage=PageFactory.initElements(driver, HomePage.class);
//
//			homePage.clickOnCarRentalsLink();
//			
//			if(homePage.validateLogin("Under Construction: Mercury Tours")==true)
//			{
//				System.out.println("successfully opened carentalpage");
//			}else {
//				System.out.println("failed to opened carentalpage");
//			}
//		}
//	
//		@Test(priority=2)
//		public void verifycontacttest()
//			{
//			homePage=PageFactory.initElements(driver, HomePage.class);
//
//			homePage.clickOnContactLink();
//			
//			if(homePage.validateLogin("Under Construction: Mercury Tours")==true)
//			{
//				System.out.println("successfully opened contactpage");
//			}else {
//				System.out.println("failed to opened contactpage");
//			}
//		}	
//		
//		@Test(priority=3)
//		public void verifycrusestest()
//			{
//			homePage=PageFactory.initElements(driver, HomePage.class);
//
//			homePage.clickOnCruisesLink();
//			
//			if(homePage.validateLogin("Cruises: Mercury Tours")==true)
//			{
//				System.out.println("successfully opened Cruisespage");
//			}else {
//				System.out.println("failed to opened  Cruisespage");
//			}
//		}	
//		
//		@Test(priority=4)
//		public void verifycdestinationtest()
//			{
//			homePage=PageFactory.initElements(driver, HomePage.class);
//
//			homePage.clickOnDestinationsLink();
//			
//			if(homePage.validateLogin("Under Construction: Mercury Tours")==true)
//			{
//				System.out.println("successfully opened destinationpage");
//			}else {
//				System.out.println("failed to opened  destinationpage");
//			}
//		}	
		
		@Test(priority=5, dataProvider = "get")
		public void signin(String username,String password)
			{
			homePage=PageFactory.initElements(driver, HomePage.class);

			homePage.clicksignon(username, password);
			
			if(homePage.validateLogin("Find a Flight: Mercury Tours:")==true)
			{
				System.out.println("successfully login");
			}else {
				System.out.println("failed login");
			}
		}
		@DataProvider
		public Object[][] get()
		{
			return TestDataProvider.getTestdatasheet("NewtourRegister");
		}
		
		
}

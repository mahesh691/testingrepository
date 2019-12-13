package com.NewTourPageTest;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseTest.TestBase;
import com.NewTourPage.LoginPage;
import com.NewTourPage.RegistrationPage;

import data.XlsReader;


public class LoginPageTest extends TestBase {

	LoginPage LoginPage;
	RegistrationPage regester;
	XlsReader XlsReader;
	
	public long y;
	
	
@DataProvider
public Object[][] getdata() {
	Object[][] data = XlsReader.getTestData("NewtourRegister");
	return data;
}
	@Test(priority=1,dataProvider = "getdata")
	public void loginvalidationtest(String fn,String pwd) throws IOException, InterruptedException
	{
		
		LoginPage=PageFactory.initElements(driver, LoginPage.class);
		LoginPage.LoginValidation(fn, pwd);
		
		String expected_currentTitle="Find a Flight";
		System.out.println("expected current title of the login page :"+expected_currentTitle);
		
		String actual_currentTitle=driver.getTitle();
		System.out.println("actual current title of the login page :"+actual_currentTitle);
		
		if(actual_currentTitle.contains(expected_currentTitle)) {
			
			System.out.println("successfull login");
			driver.findElement(By.linkText("SIGN-OFF")).click();
			driver.navigate().back();
		}else {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("E:\\JavaProgrammes\\POM\\Screenshot\\"+"loginfailed"+fn+".png"));
			System.out.println("login failed");
			
		}

		}
	}
	
//	@Test(priority=2)
//	public void registrationTest() throws IOException {
//		regester=PageFactory.initElements(driver,RegistrationPage.class);
//
//		FileInputStream fis2=new FileInputStream("E:\\JavaProgrammes\\POM\\src\\com\\ExcellDataText\\Data_asign.xlsx");
//		wb = new XSSFWorkbook(fis2);
//		XSSFSheet sheet=wb.getSheet("Sheet3");
//		String UserName=sheet.getRow(0).getCell(1).getStringCellValue();
//		String lastName=sheet.getRow(1).getCell(1).getStringCellValue();
//		double phone1=sheet.getRow(2).getCell(1).getNumericCellValue();
//		long x=(long)phone1;
//		String phone=Long.toString(x);
//		String userName=sheet.getRow(3).getCell(1).getStringCellValue();
//		String address1=sheet.getRow(4).getCell(1).getStringCellValue();
//		String city=sheet.getRow(6).getCell(1).getStringCellValue();
//		String state=sheet.getRow(7).getCell(1).getStringCellValue();
//		double postalCode1=sheet.getRow(8).getCell(1).getNumericCellValue();
//		y = (long)postalCode1;
//		String postalCode=Long.toString(x);
//		String country=sheet.getRow(9).getCell(1).getStringCellValue();
//		String email=sheet.getRow(10).getCell(1).getStringCellValue();
//		String password=sheet.getRow(11).getCell(1).getStringCellValue();
//		String confirmPassword=sheet.getRow(12).getCell(1).getStringCellValue();
//		
//		regester.register(UserName, lastName, phone, userName, address1, city, state, postalCode, country, email, 
//				password, confirmPassword);
//	
//		String expected_successPage_userName=UserName+" "+lastName;
//		System.out.println("exepected registration name :"+expected_successPage_userName);
//		WebElement text =driver.findElement(By.tagName("b"));
//		String actual_successPage_userName=text.getText();
//		System.out.println("actual registration name :"+actual_successPage_userName);
//		if(actual_successPage_userName.contains(expected_successPage_userName)) {
//			System.out.println("successful registration of "+UserName+" "+lastName);
//		}else {
//			System.out.println("failed registration of "+UserName+" "+lastName);
//		}
//		
////		driver.findElement(By.linkText("SIGN-OFF")).click();
//			
//	}
////	
////	
////	
////	@Test(priority=3)
////	public void carrentalspage()  {
////		carrentals=PageFactory.initElements(driver, CarRentalPage.class);
////		carrentals.car_rentals();
////			
////	}


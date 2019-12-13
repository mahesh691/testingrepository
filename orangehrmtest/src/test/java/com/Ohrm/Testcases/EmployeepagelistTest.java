package com.Ohrm.Testcases;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Ohrm.Basetest.TestBase;
import com.Ohrm.Page.HomePage;
import com.Ohrm.Page.LoginPage;
import com.Ohrm.Page.addemployeepage;
import com.Ohrm.Page.Employeelistpage;
import com.Ohrm.Utility.Log;
public class EmployeepagelistTest extends TestBase {

	HomePage HomePage;
	LoginPage LoginPage;
	addemployeepage addemployeepage;
	Employeelistpage Employeelistpage;
	public EmployeepagelistTest() {
		super(); 
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		HomePage=new HomePage();
		LoginPage= new LoginPage();
		Employeelistpage=new Employeelistpage();
		Log.info("orange hrm launched successfully");
		Test=reports.createTest("addemployee page  test");	
		LoginPage.loginPagevalid(prop.getProperty("username"), prop.getProperty("password"));
		Test.pass("successfully login page ");
		
	}
	
	@Test(priority = 1)
	public void addempleelistlabletest() throws InterruptedException {
		HomePage.clickonaddemployeelist();

		System.out.println(Employeelistpage.addemplistlabel());
	}


	@Test(priority = 2)
	public void empleelistTest() throws InterruptedException, IOException {
		HomePage.clickonaddemployeelist();
		Thread.sleep(10000);
		Employeelistpage.getelistOfEmployees();
		
	
	}
	
	@AfterMethod
	public void teardown() {
		reports.flush();
		driver.close();
	}
	
	
	
	
	
	
}

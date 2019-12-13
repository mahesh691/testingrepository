package com.YahooMAil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataYAhoo {
public WebDriver driver=null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	@DataProvider
	public Object[][] data() {
		Object[][] Data=new Object[4][2];
		Data[0][0]="manish";
		Data[0][1]="123";
		Data[1][0]="mahesh";
		Data[1][1]="231";;
		Data[2][0]="vamshi";
		Data[2][1]="342";
		Data[3][0]="abhi";
		Data[3][1]="34241";
		return Data;
		
	}
	
	@Test(dataProvider = "data")
	public void loginValidation(String un1, String pwd2) throws IOException {
		
				driver.findElement(By.id("txtUsername")).sendKeys(un1);
				driver.findElement(By.id("txtPassword")).sendKeys(pwd2);
			
				driver.findElement(By.id("btnLogin")).click();
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File fis=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(fis,new File("C:\\Users\\user\\git\\repository\\myrepository\\WebApplication\\screenShots\\"+un1+".png"));
	
	}
	
}

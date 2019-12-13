package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports reports;
	public BaseTest() 
	{
		try 
		{
			FileInputStream fi= new FileInputStream("E:\\JavaProgrammes\\DemoProject\\src\\main\\java\\com\\Config\\confiuration.properties");
			prop=new Properties();
			prop.load(fi);
			
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization() 
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver", "./DriverFiles/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String urlapp=prop.getProperty("url");
		driver.get(urlapp);
		
	}
	
	@BeforeSuite
	public void  extentReports() 
	{
		ExtentHtmlReporter extent=new ExtentHtmlReporter("Demotest.html");
		
		reports=new ExtentReports();
		reports.attachReporter(extent);
		
		
		reports.setSystemInfo("Browser", "fire fox");
		reports.setSystemInfo("os", "windows10");

		extent.config().setDocumentTitle("report212");
		extent.config().setReportName("report name");
		extent.config().setTestViewChartLocation(ChartLocation.TOP);
		extent.config().setTheme(Theme.STANDARD);
		extent.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
}
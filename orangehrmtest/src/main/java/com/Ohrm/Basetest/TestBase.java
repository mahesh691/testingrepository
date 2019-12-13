package com.Ohrm.Basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports reports;
	public static ExtentTest Test;

	public TestBase() {
		try {
			FileInputStream file= new FileInputStream("E:\\JavaProgrammes\\orangehrmtest\\src\\main\\java\\com\\Ohrm\\config\\config.properties");
			prop=new Properties();
			prop.load(file);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\JavaProgrammes\\orangehrmtest\\DriverFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\orangehrmtest\\DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String urlapp=prop.getProperty("url");
		driver.get(urlapp);
		
	}
	
	@BeforeSuite
	public void  extentReports() {
		ExtentHtmlReporter extent=new ExtentHtmlReporter("E:\\JavaProgrammes\\orangehrmtest\\Reports\\OhrmReports.html");
		reports=new ExtentReports();
		reports.attachReporter(extent);
			}
	
	
	
}

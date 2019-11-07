package com.Balu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver;
	//to initialize browser
	@BeforeClass
	@Parameters({"testBrowser"})
	public void setUp(String testBrowser) {
		
		switch (testBrowser.toUpperCase()){
		case "FF":
			System.out.println("Script executing on Firefox browser");
			System.setProperty("webdriver.gecko.driver", "E:\\JavaProgrammes\\Norepository\\DriverFiles\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		case "CHROME":
			System.out.println("Script executing on Chrome browser");
			System.setProperty("webdriver.chrome.driver", "E:\\JavaProgrammes\\Norepository\\DriverFiles\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "E:\\JavaProgrammes\\Norepository\\DriverFiles\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
			
		}
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	//to perform login validation
	@Test
		public void userLogin() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		String pgTitle=driver.getTitle();
		if(pgTitle.equalsIgnoreCase("OrangeHRM")) {
		Reporter.log("Successful login operation", true);
		}
		else {
		Reporter.log("Unsuccessful login operation", true);
		}
	}
	
	@AfterClass
	//to close application
	public void tearDown() {
		driver.close();
	}

}

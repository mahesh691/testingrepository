package com.OrangeHRM;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
WebDriver driver=null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
//Logger logger= Logger.getLogger(BaseTest.class);
@BeforeTest
public void setup() throws IOException {
FileInputStream fis= new FileInputStream("E:\\JavaProgrammes\\TestNG\\src\\com\\OrangeHRM\\orangeHRM_addEmployee.properties");
	Properties prop = new  Properties();
	prop.load(fis);
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.id(prop.getProperty("username"))).sendKeys("mahesh");
	driver.findElement(By.id(prop.getProperty("password"))).sendKeys("mahesh_01");
	driver.findElement(By.id(prop.getProperty("loginbutton"))).click();
}

@AfterTest
public void tearDown() {
	driver.close();
}
	
	
}

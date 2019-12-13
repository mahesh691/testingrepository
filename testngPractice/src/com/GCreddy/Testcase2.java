package com.GCreddy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {

//System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
WebDriver driver = null;


@Test(priority = 1)
public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver=new FirefoxDriver();
	
}
@Test(priority = 2)
public void verifyTitle() {
	driver.get("http://www.google.com");
	String pagetitle=driver.getTitle();
	Assert.assertEquals(pagetitle, "Google");
}	
@Test(priority = 3)
public void verifygcrshop() {
driver.get("http://www.gcrit.com/build3/");	
String pagetitle1=driver.getTitle();
Assert.assertEquals(pagetitle1, "GCR Shop");
}
@Test(priority = 4)
public void closeBrowser() {
	driver.close();
}
//use priorities attribute to control the test execution , if we 
//use priority attribute ,then program will run as per priority small number to big number)

}

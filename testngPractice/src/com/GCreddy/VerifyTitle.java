package com.GCreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
@Test  //test annotation
//testNG cases are executed in alphabetical order 
public void verifyTitle() {  // body, //you can write any name 
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	Assert.assertEquals("Gogle", pagetitle);
	driver.close();
	
	}


}

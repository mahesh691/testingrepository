package com.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeyword {
//methods to gmail
	WebDriver driver=null;
	
	public void Browser() {
		System.setProperty("webdriver.gecko.driver", ".\\DriverFiles\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		}

	public void navigate() {
		driver.get("https://www.facebook.com");
		
	}
	
	public void login() {
	WebElement	username=driver.findElement(By.name("email"));
	username.clear();
	username.sendKeys("cmahesh91@gmail.com");
	WebElement	password=driver.findElement(By.name("pass"));
	password.clear();
	password.sendKeys("1234");
	WebElement	login=driver.findElement(By.id("u_0_v"));
	login.click();
		
	}public void create() {
		driver.get("https://www.facebook.com");
		
	}public void tearDown() {
		driver.close();
		
	}
	
	

	
}

package com.Guru99;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest extends BaseTest {

	
	@Test
	public void loginTest() {
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement emailAddress=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("passwd"));
		
		emailAddress.sendKeys("abcd@gmail.com");
		
		password.sendKeys("abcdefghlkjl");
	
		WebElement loginbutton=driver.findElement(By.id("SubmitLogin"));
	
		loginbutton.click();
		
		String expected="Successfully Logged in...";
		
		WebElement header=driver.findElement(By.tagName("h3"));
		
		String actual	=header.getText();
		
		Assert.assertEquals(actual, expected);
	
		
		
			if(actual.equals(expected)) {
			
			System.out.println("successfully logged in to home page of the user");
		
			}else {
			
			System.out.println("logged failed");
			
			}
		
	}
}

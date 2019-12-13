package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {
	
	
	@Test
	public void login() throws InterruptedException {
		String expwelcome_text="Welcome";
		System.out.println("expected welcome element text is :"+ expwelcome_text);
		Thread.sleep(2000);
		WebElement welcome=driver.findElement(By.linkText("Welcome Admin"));
		String actwelcome_text=welcome.getText();
		
		System.out.println("actual welcome element text is :"+ actwelcome_text);
		
		if(actwelcome_text.contains(expwelcome_text))
		{
			System.out.println("Loggedin to OrangeHRM _ pass");
		}else {
			System.out.println("Error message dispaly to login_fail");
		}
		Thread.sleep(5000);
//		welcome.click();
//		driver.findElement(By.linkText("Logout")).click();
	}
	}



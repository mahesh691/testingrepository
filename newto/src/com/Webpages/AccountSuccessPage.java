package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage 
{
	public WebDriver driver;
	public AccountSuccessPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(tagName = "b")
	WebElement accountSuccessOrNot;
	
	public boolean validateAccountSuccessOrNot(String email)
	{
			return accountSuccessOrNot.getText().contains(email);
		
	}
}

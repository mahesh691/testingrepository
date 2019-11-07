package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage 
{
	public WebDriver driver;
	public SignOnPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOnLink;
	
	public void setUserName(String name)
	{
		userName.sendKeys(name);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnsignOnLink()
	{
		signOnLink.click();
	}
	public void clickOnLogin() throws InterruptedException
	
	{
	Thread.sleep(10000);
	login.click();
	}
	public boolean validateSignOn(String expectedTitle)
	{
		if(driver.getTitle().equals(expectedTitle))
			return true;
		else
			return false;
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}

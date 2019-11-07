package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Identification of object element
	@FindBy(linkText="SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	
	@FindBy(linkText="SUPPORT")
	WebElement supportLink;
	
	@FindBy(linkText="CONTACT")
	WebElement contactLink;
	
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	@FindBy(linkText="Flights")
	WebElement flightsLink;
	
	@FindBy(linkText="Hotels")
	WebElement hotelsLink;
	
	@FindBy(linkText="Car Rentals")
	WebElement carRentalsLink;
	
	@FindBy(linkText="Cruises")
	WebElement cruisesLink;
	
	@FindBy(linkText="Destinations")
	WebElement destinationsLink;
	
	@FindBy(linkText="Vacatations")
	WebElement vacationsLink;
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement signOnButton;
	
	//Performing operation on object element
	
	public void clicksignon(String name,String pass)
	{
		userName.sendKeys(name);
		password.sendKeys(pass);
		signOnButton.click();
	}
	
	public void clickOnRegisterLink()
	{
		registerLink.click();
	}
	public void clickOnSupportLink()
	{
		supportLink.click();
	}
	public void clickOnContactLink()
	{
		contactLink.click();
	}
	public void clickOnHomeLink()
	{
		homeLink.click();
	}
	public void clickOnFlightsLink()
	{
		flightsLink.click();
	}
	public void clickOnHotelsLink()
	{
		hotelsLink.click();
	}
	public void clickOnCarRentalsLink()
	{
		carRentalsLink.click();
	}
	public void clickOnCruisesLink()
	{
		cruisesLink.click();
	}
	public void clickOnDestinationsLink()
	{
		destinationsLink.click();
	}
	public void clickOnVacationsLink()
	{
		vacationsLink.click();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public boolean validateLogin(String expectedTitle)
	{
		return  verifyTitle().equals(expectedTitle);
		
	}
	
	
}

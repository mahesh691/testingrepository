package com.Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage
{
	public WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy(name = "userName")
	WebElement userName;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name="address2")
	WebElement address2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name = "register")
	WebElement register;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	WebElement success;
	
	public void setFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	public void setPhone(String ph)
	{
		phone.sendKeys(ph);
	}
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	public void setAddress1(String addr1)
	{
		address1.sendKeys(addr1);
	}
	public void setAddress2(String addr2)
	{
		address2.sendKeys(addr2);
	}
	
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	public void setState(String st)
	{
		state.sendKeys(st);
	}
	
	public void setPostalCode(String pcode)
	{
		postalCode.sendKeys(pcode);
	}
	public void setCountry(String cntry)
	{
		country.sendKeys(cntry);
	}
	public void setEmail(String eml)
	{
		email.sendKeys(eml);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void setConfirmPassword(String confPass)
	{
		confirmPassword.sendKeys(confPass);
	}
	public void clickOnRegister()
	{
		register.click();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public String successpagetitle() {
		return success.getText();
	}
	
		
}

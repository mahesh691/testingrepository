package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import bsh.This;

public class RegistrationPage {
	
	
	@FindBy(linkText="REGISTER")
	WebElement registration;
	@FindBy(name="firstName")
	WebElement fn;
	@FindBy(name="lastName")
	WebElement ln;
	@FindBy(name="phone")
	WebElement pn;
	@FindBy(name="userName")
	WebElement em;
	@FindBy(name="address1")
	WebElement ad;
	@FindBy(name="city")
	WebElement ct;
	@FindBy(name="state")
	WebElement st;
	@FindBy(name="postalCode")
	WebElement pc;
	@FindBy(name="country")
	WebElement cntry;
	@FindBy(name="email")
	WebElement usern;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(name="confirmPassword")
	WebElement cpwd;
	@FindBy(name="register")
	WebElement reg;
	
	
	public void register(String UserName,
			String lastName,String phone,String userName,String address1,
			String city,String state,String postalCode,String country,
			String email,String password,String confirmPassword) {
		
		registration.click();
		fn.sendKeys(UserName);
		ln.sendKeys(lastName);
		pn.sendKeys(phone);
		em.sendKeys(userName);
		ad.sendKeys(address1);
		ct.sendKeys(city);
		st.sendKeys(state);
		pc.sendKeys(postalCode);
//		cntry.sendKeys(country);
		Select select=new Select(cntry);
		select.selectByVisibleText(country);
		usern.sendKeys(email);
		pwd.sendKeys(password);
		cpwd.sendKeys(confirmPassword);
		reg.click();
		
	}

}

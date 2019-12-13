package com.Ohrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ohrm.Basetest.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "txtUsername")
	WebElement un;
	@FindBy(id = "txtPassword")
	WebElement pwd;
	@FindBy(id = "btnLogin")
	WebElement login;
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/img")
	WebElement logo;
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  boolean logoValid() {
		return logo.isDisplayed();
	}
	
	public String loginPagevalid() {
		return driver.getTitle();
	}
	
	public  HomePage loginPagevalid(String username,String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
		return new HomePage();
	}
	
	
}

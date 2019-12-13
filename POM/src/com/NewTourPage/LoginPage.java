package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(name="login")
	WebElement logIN;
	public void LoginValidation(String UserName,String PassWord) throws InterruptedException {
		username.clear();
		username.sendKeys(UserName);
		passWord.clear();
		passWord.sendKeys(PassWord);
		logIN.click();
	}
}


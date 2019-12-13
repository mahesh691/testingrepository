package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText = "Home")
	WebElement home;
	public void home1() {
		
		home.click();
	}
}

package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage {
	@FindBy(linkText = "SUPPORT")
	WebElement support;
	public void support1() {
		support.click();
		
	}
}

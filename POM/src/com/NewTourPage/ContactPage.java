package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	@FindBy(linkText = "CONTACT")
	WebElement contact;
	public void contact1() {
		
		contact.click();
	}
}

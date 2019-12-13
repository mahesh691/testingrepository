package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage {
	@FindBy(linkText = "Hotels")
	WebElement hotels;
	public void hotels1() {
		
		hotels.click();
	}
}

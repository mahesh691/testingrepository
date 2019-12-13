package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPage {
	@FindBy(linkText = "Flights")
	WebElement flights;
	public void flights1() {
		
		flights.click();
	}
}

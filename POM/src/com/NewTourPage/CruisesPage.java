package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CruisesPage {
	@FindBy(linkText = "Cruises")
	WebElement cruises;
	public void cruises1() {
		
		cruises.click();
	}
}

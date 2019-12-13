package com.NewTourPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarRentalPage {
	@FindBy(linkText = "Car Rentals")
	WebElement car_rentals;
	public void car_rentals() {
		
		car_rentals.click();
	}
}

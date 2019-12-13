package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;

public class HomePage extends BaseTest {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img")
	WebElement logo;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/span/strong" )
	WebElement number;
	
	@FindBy(linkText = "Women")
	WebElement womenLink;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	WebElement dressesLink;
	
	@FindBy(xpath  = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	WebElement tShirtsLink;
	
	public boolean logoTest() {
		boolean lg=logo.isDisplayed();
		return lg;
	}
	
	public String numberTest() {
		return number.getText();
		  
	}
	
	public Women womenpage() {
		 womenLink.click();
		 return new Women();
	}
	
	public Dresses dressespage() {
		dressesLink.click();
		 return new Dresses();
	}
	
	public Tshirts tshirtpage() {
		tShirtsLink.click();
		 return new Tshirts();
		 }
	
}

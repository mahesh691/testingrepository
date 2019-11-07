package com.Webpages;

import org.openqa.selenium.WebDriver;

public class FlightsPage
{
	public WebDriver driver;
	public FlightsPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}

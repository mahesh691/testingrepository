package com.Webpages;

import org.openqa.selenium.WebDriver;

public class CruisesPage
{
	public WebDriver driver;
	public CruisesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}

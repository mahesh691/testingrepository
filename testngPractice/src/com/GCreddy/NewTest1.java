package com.GCreddy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 extends newTestp{
	
	
	@Test(priority = 3)
	public void verifyyahoo() {
		driver.get("https://in.yahoo.com/");
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, "Yahoo India");
	}	
	
	@Test(priority = 4)
	public void verifyfacebook() {
		driver.get("https://www.facebook.com");
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, "Facebook – log in or sign up");
	}	
}

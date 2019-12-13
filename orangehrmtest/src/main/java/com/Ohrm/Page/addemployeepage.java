package com.Ohrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Ohrm.Basetest.TestBase;

public class addemployeepage extends TestBase{
	HomePage HomePage;
	public addemployeepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h1")
	WebElement addEmployeelabel;
	
	@FindBy(id = "firstName")
	WebElement firstName;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(id = "btnSave")
	WebElement btnSave;
	
	@FindBy(tagName = "h1")
	WebElement name;
	public String verifyaddemployeelabel() {
		
		return addEmployeelabel.getText();
		
	}
	
	public void createNewEmployee(String fn,String un) throws InterruptedException {
		firstName.sendKeys(fn);
		lastName.sendKeys(un);
		btnSave.click();

		Assert.assertEquals(name.getText(),fn+" "+un,"not matching");
		
		driver.navigate().back();
		
	}
}

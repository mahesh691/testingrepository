package com.SushanthTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dateset {

	@Test
	public void setdate() {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
			
			String month="April 2020";
			String date="20";
			
			driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("12/11/2040");
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[6]/a")).click();
			
			
	}
	
}

package com.Guru99;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest{

	
	@Test
	public void list() {
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 120)");  
	 
		WebElement cl=driver.findElement(By.name("country"));
		
		List<WebElement> clnames=cl.findElements(By.tagName("option"));
		
		int clnamescount=clnames.size();
		
		System.out.println("number of countries : "+ clnamescount);
		
		
		
		
		for(int i=0;i<clnamescount;i++) 
		{
		
			String cname=clnames.get(i).getText();
			Select selection=new Select(cl);
			selection.selectByIndex(i);
		
			System.out.println(cname);
		
			cl=driver.findElement(By.name("country"));
			
			

		}
		
		
	}
	
	
	
	
}

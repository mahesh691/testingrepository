package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee extends BaseTest{
	
	@Test
	public void addemployeereg() throws IOException {
		String fn="";
		String mn="";
		String ln="";

		
		FileInputStream file1= new FileInputStream("E:\\JavaProgrammes\\TestNG\\src\\com\\OrangeHRM\\orangeHRM_addEmployee.properties");
		Properties pr=new Properties();
		pr.load(file1);
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\TestNG\\src\\com\\OrangeHRM\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("OHRMaddE");
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++) {
//		Thread.sleep(10000);
		WebElement pim=driver.findElement(By.id(pr.getProperty("PIM")));
		Actions act1=new Actions(driver);
		act1.moveToElement(pim).perform();
//		Thread.sleep(5000);	
		
		if(i==i) {
		
		WebElement ae=driver.findElement(By.id(pr.getProperty("PIMmenu")));
		ae.click();
		fn=sheet.getRow(i).getCell(0).getStringCellValue();
		mn=sheet.getRow(i).getCell(1).getStringCellValue();
		ln=sheet.getRow(i).getCell(2).getStringCellValue();
		
		driver.findElement(By.id(pr.getProperty("FirstName"))).clear();
		driver.findElement(By.id(pr.getProperty("FirstName"))).sendKeys(fn);
		 
		driver.findElement(By.id(pr.getProperty("MddleName"))).clear();
		driver.findElement(By.id(pr.getProperty("MddleName"))).sendKeys(mn);
		
		driver.findElement(By.id(pr.getProperty("LastName"))).clear();
		driver.findElement(By.id(pr.getProperty("LastName"))).sendKeys(ln);
		
		driver.findElement(By.id(pr.getProperty("SaveButton"))).click();
		
		
		String id=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		String h11=driver.findElement(By.tagName(pr.getProperty("header"))).getText();
		System.out.println("employee registered name :"+ id +" "+ h11);
		
		driver.navigate().back();

		
		
		
			}
		}
	}

}

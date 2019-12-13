package com.Ohrm.Page;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ohrm.Basetest.TestBase;
import com.Ohrm.Utility.Log;

public class Employeelistpage extends TestBase {

	@FindBy(className = "head")
	WebElement label;
	@FindBy(id = "resultTable")
	WebElement table;
	
	@FindBy(xpath  = "/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody")
	WebElement tbody;
	
	
	public Employeelistpage() {
		PageFactory.initElements(driver, this);
	}
	public boolean addemplistlabel() {
		return	label.getText().equalsIgnoreCase("employee information");
	
	}
	
	public void getelistOfEmployees() throws IOException {		
		List<WebElement> rows=tbody.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\orangehrmtest\\src\\main\\java\\com\\Ohrm\\Testdata\\Data_asign.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.createSheet("elist");
		
		for(int i=0;i<rows.size();i++) {
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			cols.size();
			Row r=sheet.createRow(i);
			for(int k=0;k<cols.size();k++) {
			String colsName=cols.get(k).getText();
				Log.info(colsName+"  ");
				Test.info(colsName+"  ");
				
				Cell c=r.createCell(k);
				c.setCellValue(cols.get(k).getText());
				FileOutputStream update = new FileOutputStream("E:\\JavaProgrammes\\orangehrmtest\\src\\main\\java\\com\\Ohrm\\Testdata\\Data_asign.xlsx");
				workbook.write(update);
				
			}
			System.out.println();
		}
		Test.pass("successfully get data into excell sheet");
		
	}

	
}

package com.Guru99;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ActionTest {

	@Test
	public void login() throws IOException {
		
		ActionKeyword keys=new ActionKeyword();
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\Norepository\\src\\com\\Guru99\\practice.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh= wb.getSheet("Sheet1");
		Row r=null;
		int rowcount=sh.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++) {
			r=sh.getRow(i);
		String	runmode=r.getCell(4).getStringCellValue();
			if(runmode.equals("Y")) {
				
			String keyword=r.getCell(3).getStringCellValue();
			if(keyword.equals("Browser")) {
				keys.Browser();
			}else 
				if(keyword.equals("navigate")) {
				keys.navigate();
			}else 
				if(keyword.equals("login")) {
				keys.login();
			}else 
				if(keyword.equals("create")) {
				keys.create();
				keys.tearDown();

			}
	}
		
	}
		}
			}

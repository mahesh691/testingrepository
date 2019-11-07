package com.Utilities;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader 
{
	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	public FileInputStream fin;
	public String[][] data;
	public String[][] getTestData(String sheetName)
	{
		try
		{
			fin=new FileInputStream("E:\\JavaProgrammes\\newto\\src\\com\\Excwlldata\\Data_asign.xlsx");
			workBook=new XSSFWorkbook(fin);
			sheet=workBook.getSheet(sheetName);
			int row=sheet.getLastRowNum();
			int cell=sheet.getRow(1).getLastCellNum();
			data=new String[row][cell];
			for(int i=1;i<=row;i++)
			{
				for(int j=0;j<cell;j++)
				{
					if(sheet.getRow(i).getCell(j).getCellType()==CellType.NUMERIC)
					{
						sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
					}
					data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
					}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}

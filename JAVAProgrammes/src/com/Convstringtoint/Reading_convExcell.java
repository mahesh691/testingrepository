package com.Convstringtoint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.format.CellTextFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_convExcell {

	public static void main(String[] args) throws IOException, InterruptedException {
			FileInputStream fi=new FileInputStream("E:\\JavaProgrammes\\JAVAProgrammes\\src\\com\\Excell_Sheet\\conversion.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			int rc=sheet.getLastRowNum();
			System.out.println("active rows :"+rc);
			int colscount=sheet.getRow(1).getLastCellNum();
			System.out.println("active cols :"+colscount);
			
			for(int i=1;i<=rc;i++) 
			{
				Cell cell=sheet.getRow(i).getCell(1);
				String celltext="";
				
				if(cell.getCellType()==CellType.STRING) 
				{
					celltext=cell.getStringCellValue();
					System.out.println(celltext);
				}else 
					if(cell.getCellType()==CellType.NUMERIC) 
					{
						celltext=String.valueOf(cell.getNumericCellValue());
						System.out.println(celltext);
					}else 
						if(cell.getCellType()==CellType.BLANK) 
						{
							celltext="";
						}
				
			
				if(Integer.parseInt(celltext)>=12) {
					Thread.sleep(2000);
					sheet.getRow(i).getCell(2).setCellValue("major");
							}else {
									sheet.getRow(i).getCell(2).setCellValue("minor");
							}
			}// end loop
			fi.close();//close the ffile input stream
			FileOutputStream fos=new FileOutputStream("E:\\\\JavaProgrammes\\\\JAVAProgrammes\\\\src\\\\com\\\\Excell_Sheet\\\\conversion.xlsx");
			wb.write(fos);
			fos.close();
}
}

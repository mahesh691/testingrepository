package data;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader 
{
	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	public FileInputStream fin;
	public String[][] data;
	public String[][] getTestData(String Sheet3)
	{
		try
		{
			fin=new FileInputStream("E:\\JavaProgrammes\\POM\\src\\com\\ExcellDataText\\Data_asign.xlsx");
			workBook=new XSSFWorkbook(fin);
			sheet=workBook.getSheet(Sheet3);
			int row=sheet.getLastRowNum();
			int cell=sheet.getRow(1).getLastCellNum();
			data=new String[row][cell];
			for(int i=0;i<=row;i++)
			{
				for(int j=0;j<cell;j++)
				{
					if(sheet.getRow(i).getCell(j).getCellType()==CellType.NUMERIC)
					{
						sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
					}
					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
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

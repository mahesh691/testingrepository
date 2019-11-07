package com.Utilities;



public class TestDataProvider
{
	public static Object[][] getTestdatasheet(String sheetName)
	{
		XlsReader reader=new XlsReader();
		return reader.getTestData(sheetName);
	}
}

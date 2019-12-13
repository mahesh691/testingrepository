package com.SushanthTest;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ToolsQaDate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String dot="20/May/2021";
		String date,month,year;
		String caldt = null ,calmonth,calyear;		
		/*
		 * Split the String into String Array
		 */
		String dateArray[]= dot.split("/");
		date=dateArray[0];
		month=dateArray[1];
		year=dateArray[2];

		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();

		WebElement cal;
		cal=driver.findElement(By.className("calendar"));
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		/**
		 * Select the year
		 */
		while (!calyear.equals(year)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println("Displayed Year::" + calyear);
		}

		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		/**
		 * Select the Month
		 */
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}

		cal=driver.findElement(By.className("calendar"));
		/**
		 * Select the Date
		 */
		List<WebElement> rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				caldt=cols.get(j).getText();
				
				if (caldt.equals(date)) 
				{
					
					cols.get(j).click();
					
					break;
				}
			}
		}
		
		System.out.println("entered by automation date :" +caldt+"/"+calmonth+"/"+calyear);

	}

}
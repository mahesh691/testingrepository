package com.DBtest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewtourLogin {
WebDriver driver = null;
String url = "http://newtours.demoaut.com/";
	
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
	}
	@Test
	public void login() throws IOException{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3305/";
		String DBname="test";
		String dbdriver="com.mysql.jdbc.Driver";
		String Username	="root";
		String password="mahesh_01";
		try {
		Class.forName(dbdriver).newInstance();
		
		
		conn=DriverManager.getConnection(url+DBname, Username, password);
		PreparedStatement psmt =conn.prepareStatement("select * from orhrm");
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
		
		
				driver.findElement(By.name("userName")).sendKeys(rs.getString(1));
				System.out.println("entered username:tutorial");
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys(rs.getString(2));
				System.out.println("password entered:tutorial");
				Thread.sleep(1000);
				driver.findElement(By.name("login")).click();
				System.out.println("submitted ");
				Thread.sleep(1000);
				String actual_title=driver.getTitle();
				System.out.println("actual current successfull page is :"+actual_title);
				
				String expected_title="Find";
				System.out.println("expected title current successfull login page is :"+expected_title);
			
				if(actual_title.contains(expected_title)) {
					System.out.println("title matched : pass");
				}else {
					System.out.println("not matched title : fail");
				}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

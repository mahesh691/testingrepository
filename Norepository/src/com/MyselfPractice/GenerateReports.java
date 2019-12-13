package com.MyselfPractice;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReports {
	public static ExtentReports report;
	public static ExtentTest test;
	

	@BeforeSuite
	public void  extentReports() {
		ExtentHtmlReporter extents=new ExtentHtmlReporter("E:\\JavaProgrammes\\Norepository\\Reports\\mytest.html");
		report=new ExtentReports();
		report.attachReporter(extents);
		
	
	}	
	
}

package com.MyselfPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Genetest1 extends GenerateReports {
	
	
//	@BeforeTest
//	public void testcreate() {
//		test=report.createTest("genrate 1");
//	}
	@Test
	public void display() {
		test=report.createTest("genrate 1");
		test.pass("greerr");
		report.flush();
		
	}
}

package com.Definition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "featurefile" , 
		glue = {"com.LoginTest"},
		format = {"pretty","html:cucumber-html_reports"})


public class TestRunner
{
	
	}

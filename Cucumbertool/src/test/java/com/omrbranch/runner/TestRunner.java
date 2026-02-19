package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish =true,
		dryRun=false,
		monochrome=true,
		name= {"Verify Greens login"},
		plugin= {"pretty","json:Cucumbertool\\target\\targetoutput.json"},
	    glue = "com.omrbranch.stepdefinition",
	    features = "src\\test\\resources\\features"
)
public class TestRunner {
	
	@AfterClass
	public static void afterclass()
	{
		String jsonReport = "C:\\Users\\Tamilarasan T\\eclipse-workspace\\Cucumbertool\\target\\targetoutput.json";
		System.out.println("Tester");
		Reporting.generateJvmReport(jsonReport);
	}
	
	
	
	
}


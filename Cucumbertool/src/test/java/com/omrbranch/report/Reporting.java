package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonfile)
	{
		Configuration config = new Configuration(new File("C:\\Users\\Tamilarasan T\\eclipse-workspace\\Cucumbertool\\Cucumbertool\\target"),"Green home page");
		config.addClassifications("Author","Tamil");
		config.addClassifications("OS","Windows");
		config.addClassifications("Project","Cucumber Report");
		List<String> jsonFiles= new ArrayList<>();
		
		jsonFiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		builder.generateReports();
	}
}

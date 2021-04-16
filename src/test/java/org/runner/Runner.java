package org.runner;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.lanuch.JVMreport;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature files",
glue = "org.models",
dryRun = false, tags = {"@login"},
plugin = {"pretty",
		"html:target\\report",
		"json:target\\report\\output.json","junit:target\\report\\fb.xml"})
public class Runner {
	
	@AfterClass
	public static void jumreport() {
JVMreport.generateJVMreport(System.getProperty("user.dir")+"\\target\\report\\JVMReport");
	}
	
	 

}
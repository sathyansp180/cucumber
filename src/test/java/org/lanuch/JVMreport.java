package org.lanuch;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	
	public static void generateJVMreport(String jsonPath) {

		File f = new File(System.getProperty("user.dir")+"\\target\\report\\JVMReport");
	
			Configuration con = new Configuration(f, "adactinhotelapp");
			con.addClassifications("name","chrome");
			con.addClassifications("name", "chrome.10");
			con.addClassifications("name", "chrome.15");
		
		List <String> l = new ArrayList<String>();
		
		l.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(l, con);
		r.generateReports();
	}
}

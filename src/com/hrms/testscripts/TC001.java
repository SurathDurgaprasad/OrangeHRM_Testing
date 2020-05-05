package com.hrms.testscripts;


import com.hrms.lib.*;
import org.testng.annotations.*;
import org.apache.log4j.xml.DOMConfigurator;

public class TC001 {
	public General obj = new General();

	@BeforeClass
	public void openingapllication() {
		obj.openApplication();
	}

	@Test
	public void LoginLogout() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		obj.login();
		obj.logout();
	}

	@AfterClass
	public void colseapplication() {
		obj.closeAppliction();
	}
}
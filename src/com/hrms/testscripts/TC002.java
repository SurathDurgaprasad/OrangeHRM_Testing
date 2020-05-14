package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

	General obj = new General();

	@BeforeClass
	public void openbrowser() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		obj.openApplication();
	}

	@Test(priority = 1)
	public void admin_Login() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		obj.login();
	}

	@Test(priority = 2)
	public void addingEmployee() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		obj.pointingPim();
		obj.addEmp();
	}

	@Test(priority = 3)
	public void deletingEmplyee() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		obj.pointingPim();
		obj.delEmp();
	}

	@AfterClass
	public void logout_CloseApplication() {
		DOMConfigurator.configure("log4j.xml");

		obj.logout();
		obj.closeAppliction();
	}
}

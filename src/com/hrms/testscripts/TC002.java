package com.hrms.testscripts;

import com.hrms.lib.*;
import org.testng.annotations.*;
import org.apache.log4j.xml.DOMConfigurator;


public class TC002 {

	General obj = new General();
	MouseoverMenu1 obj1 = new MouseoverMenu1();
	PimAddEmpDelEmp obj2 = new PimAddEmpDelEmp();

	@BeforeClass
	public void openbrowser() throws Exception {
		obj.openApplication();
		obj.login();
	}

	@Test
	public void add_del_emp() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		obj1.pointingPim();
		obj2.addEmp();
		obj2.delEmp();
	}

	@AfterClass
	public void closebrowser() {
		obj.logout();
		obj.closeAppliction();
	}
}

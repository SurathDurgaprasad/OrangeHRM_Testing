package com.hrms.testscripts;

import com.hrms.lib.*;
import org.testng.annotations.*;

public class TC003 {

	 General obj = new General();
	 MouseoverMenu1 obj1 = new MouseoverMenu1();
	 AdminCompantinfoFunctions obj2 = new AdminCompantinfoFunctions();
	
	@BeforeClass
	public void opening_browser_login() throws Exception {
		obj.openApplication();
		obj.login();
	}

	@Test
	public void entering_company_info() throws Exception {
		obj1.pointingAdmin();
		obj2.pointingAdminCompanyinfo();
		obj2.generalForm();
	}

	@AfterClass
	public void logout_from_application() {
		obj.logout();
	}
}

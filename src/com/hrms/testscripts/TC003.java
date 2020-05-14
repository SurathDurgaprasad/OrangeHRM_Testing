package com.hrms.testscripts;

import com.hrms.lib.*;
import org.testng.annotations.*;

public class TC003 {

	General obj = new General();

	@Test
	public void entering_company_info1() throws Exception {
		obj.openApplication();
		obj.login();

		obj.pointingAdmin();

		obj.pointingAdminCompanyinfo();

		obj.generalForm();

		obj.logout();
		obj.closeAppliction();
	}
}

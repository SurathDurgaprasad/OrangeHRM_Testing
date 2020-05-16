package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void windowHandle() throws Exception{
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.pointingHelp();
		obj.clickingFourm();
		obj.pointingHelp();
		obj.clickingBlog();
	
		obj.logout();
		obj.quiteAppliction();
	}
}

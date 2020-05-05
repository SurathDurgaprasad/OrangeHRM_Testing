package com.hrms.values;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global {

	public WebDriver driver;
	
	public Actions action_obj;

	public String driver_locaton = "D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe";

	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";

	public String username = "admin";

	public String password = "admin";

	}

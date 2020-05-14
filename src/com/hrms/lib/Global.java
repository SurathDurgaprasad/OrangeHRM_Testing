package com.hrms.lib;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;

public class Global {

	public WebDriver driver = null;

	public Actions action_obj = null;

	public String driverKey = "webdriver.chrome.driver";

	public String driverValue = "D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe";

	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";

	public String username = "admin";

	public String password = "admin";

	public String general_form_location = "D:\\excel_files_for_selenium\\general_form_xls.xls";

	public FileInputStream file;

	public Workbook wb;

	public Sheet st;

	public String company_info;

	public String tax_id;

	public String naics;

	public String phone;

	public String fax;

	public String country;

	public String add1;

	public String add2;

	public String city;

	public String state_province;

	public String zip;

	public String comments;

}

package com.hrms.lib;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

import jxl.Workbook;

public class General extends Global {

	public void openApplication() {
		if (driver == null) {
			System.setProperty(driverKey, driverValue);
			driver = new ChromeDriver();
		}
		driver.navigate().to(url);

		System.out.println("Application opened");
		Reporter.log("Application opend");
		Log.info("Application opend");
	}

	public void closeAppliction() {
		driver.close();

		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
	}

	public void login() throws Exception {
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);

		System.out.println("Login completed");
		Reporter.log("Login completed");
		Log.info("Login completed");
	}

	public void logout() {
		driver.findElement(By.linkText("Logout")).click();

		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}

	public void pointingAdmin() {
		WebElement adminMenu;
		action_obj = new Actions(driver);
		adminMenu = driver.findElement(By.xpath("//span[text() = 'Admin']"));
		action_obj.moveToElement(adminMenu).build().perform();
	}

	public void pointingPim() {
		WebElement pimMenu;
		action_obj = new Actions(driver);
		pimMenu = driver.findElement(By.xpath("//span[text() = 'PIM']"));
		action_obj.moveToElement(pimMenu).perform();
	}

	public void pointingLeave() {
		WebElement leaveMenu;
		action_obj = new Actions(driver);
		leaveMenu = driver.findElement(By.xpath("//span[text() = 'Leave']"));
		action_obj.moveToElement(leaveMenu).perform();
	}

	public void pointingTime() {
		WebElement timeMenu;
		action_obj = new Actions(driver);
		timeMenu = driver.findElement(By.xpath("//span[text() = 'Time']"));
		action_obj.moveToElement(timeMenu).perform();
	}

	public void pointingBenefits() {
		WebElement benefitsMenu;
		action_obj = new Actions(driver);
		benefitsMenu = driver.findElement(By.xpath("//span[text() = 'Benefits']"));
		action_obj.moveToElement(benefitsMenu).perform();
	}

	public void pointingRecruit() {
		WebElement recruitMenu;
		action_obj = new Actions(driver);
		recruitMenu = driver.findElement(By.xpath("//span[text() = 'Recruitment']"));
		action_obj.moveToElement(recruitMenu).perform();
	}

	public void pointingPerform() {
		WebElement performMenu;
		action_obj = new Actions(driver);
		performMenu = driver.findElement(By.xpath("//span[text() = 'Performance']"));
		action_obj.moveToElement(performMenu).perform();
	}

	public void pointingReport() {
		WebElement reportMenu;
		action_obj = new Actions(driver);
		reportMenu = driver.findElement(By.xpath("//span[text() = 'Reports']"));
		action_obj.moveToElement(reportMenu).perform();
	}

	public void pointingBugtracker() {
		WebElement bugMenu;
		action_obj = new Actions(driver);
		bugMenu = driver.findElement(By.xpath("//span[text() = 'Bug Tracker']"));
		action_obj.moveToElement(bugMenu).perform();
	}

	public void pointingHelp() {
		WebElement helpMenu;
		action_obj = new Actions(driver);
		helpMenu = driver.findElement(By.xpath("//span[text() = 'Help']"));
		action_obj.moveToElement(helpMenu).perform();
	}

	public void pointingAdminCompanyinfo() {
		WebElement companyinfoMenu;
		action_obj = new Actions(driver);
		companyinfoMenu = driver.findElement(By.xpath("//span[text() = 'Company Info']"));
		action_obj.moveToElement(companyinfoMenu).build().perform();
	}

	public void pointingAdminJobs() {
		WebElement jobMenu;
		action_obj = new Actions(driver);
		jobMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[2]/a/span"));
		action_obj.moveToElement(jobMenu).build().perform();
	}

	public void pointingAdminQualification() {
		WebElement qualificationMenu;
		action_obj = new Actions(driver);
		qualificationMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[3]/a/span"));
		action_obj.moveToElement(qualificationMenu).build().perform();
	}

	public void pointingAdminSkills() {
		WebElement skillsMenu;
		action_obj = new Actions(driver);
		skillsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[4]/a/span"));
		action_obj.moveToElement(skillsMenu).build().perform();

	}

	public void pointingAdminMemberships() {
		WebElement membershipsMenu;
		action_obj = new Actions(driver);
		membershipsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[5]/a/span"));
		action_obj.moveToElement(membershipsMenu).build().perform();
	}

	public void pointingAdminNationnality_race() {
		WebElement nationalityMenu;
		action_obj = new Actions(driver);
		nationalityMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[6]/a/span"));
		action_obj.moveToElement(nationalityMenu).build().perform();
	}

	public void pointingAdminUsers() {
		WebElement usersMenu;
		action_obj = new Actions(driver);
		usersMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[7]/a/span"));
		action_obj.moveToElement(usersMenu).build().perform();
	}

	public void pointingAdminEmailnotification() {
		WebElement emailnotificationMenu;
		action_obj = new Actions(driver);
		emailnotificationMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[8]/a/span"));
		action_obj.moveToElement(emailnotificationMenu).build().perform();
	}

	public void pointingAdminProjectinfo() {
		WebElement projectsMenu;
		action_obj = new Actions(driver);
		projectsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[9]/a/span"));
		action_obj.moveToElement(projectsMenu).build().perform();
	}

	public void pointingAdminDataimport_export() {
		WebElement dataimport_export_Menu;
		action_obj = new Actions(driver);
		dataimport_export_Menu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[10]/a/span"));
		action_obj.moveToElement(dataimport_export_Menu).build().perform();

	}

	public void generalForm() throws Exception {
		driver.findElement(By.xpath("//span[text()='General']")).click();
		driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		

		file = new FileInputStream(general_form_location);
		wb = Workbook.getWorkbook(file);
		st = wb.getSheet("Sheet1");

		company_info = st.getCell(0, 1).getContents();

		tax_id = st.getCell(1, 1).getContents();

		naics = st.getCell(2, 1).getContents();

		phone = st.getCell(3, 1).getContents();

		fax = st.getCell(4, 1).getContents();

		country = st.getCell(5, 1).getContents();

		add1 = st.getCell(6, 1).getContents();

		add2 = st.getCell(7, 1).getContents();

		city = st.getCell(8, 1).getContents();

		state_province = st.getCell(9, 1).getContents();

		zip = st.getCell(10, 1).getContents();

		comments = st.getCell(11, 1).getContents();
		
		driver.findElement(By.xpath("//input[@id = 'editBtn']")).click();
//
		driver.findElement(By.xpath("//input[@id = 'txtCompanyName']")).clear();
		driver.findElement(By.xpath("//input[@id='txtTaxID']")).clear();
		driver.findElement(By.xpath("//input[@id='txtNAICS']")).clear();
		driver.findElement(By.xpath("//input[@id='txtPhone']")).clear();
		driver.findElement(By.xpath("//input[@id='txtFax']")).clear();
		Select dropdown_box2 = new Select(driver.findElement(By.xpath("//*[@id=\"cmbCountry\"]")));
		dropdown_box2.selectByValue("0");
		driver.findElement(By.xpath("//input[@id='txtStreet1']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStreet2']")).clear();
		driver.findElement(By.xpath("//input[@id='cmbCity']")).clear();
		driver.findElement(By.xpath("//input[@id='txtState']")).clear();
		driver.findElement(By.xpath("//input[@id='txtZIP']")).clear();
		driver.findElement(By.xpath("//*[@id = 'txtComments']")).clear();	
//
		
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'txtCompanyName']")).sendKeys(company_info);
		driver.findElement(By.xpath("//input[@id='txtTaxID']")).sendKeys(tax_id);
		driver.findElement(By.xpath("//input[@id='txtNAICS']")).sendKeys(naics);
		driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@id='txtFax']")).sendKeys(fax);
		dropdown_box2.selectByVisibleText(country);
		driver.findElement(By.xpath("//input[@id='txtStreet1']")).sendKeys(add1);
		driver.findElement(By.xpath("//input[@id='txtStreet2']")).sendKeys(add2);
		driver.findElement(By.xpath("//input[@id='cmbCity']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@id='txtState']")).clear();
		driver.findElement(By.xpath("//input[@id='txtState']")).sendKeys(state_province);
		driver.findElement(By.xpath("//input[@id='txtZIP']")).sendKeys(zip);
		driver.findElement(By.xpath("//*[@id = 'txtComments']")).sendKeys(comments);
		driver.findElement(By.xpath("//input[@id='editBtn']")).click();

		driver.switchTo().defaultContent();
	}

	public void addEmp() throws Exception {
		driver.findElement(By.xpath("//span[text() = 'Add Employee']")).click();

		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into frame");

		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Bond");
		System.out.println("Entered Last name is done ");

		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Bond");
		System.out.println("Entered first name is done ");

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.findElement(By.id("txtEmpMiddleName")).sendKeys("American");
		System.out.println("Entered middle name is done ");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.id("txtEmpNickName")).sendKeys("bond007");
		System.out.println("Entered nick name is done ");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		WebElement upload_img = driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
		upload_img.sendKeys("D:\\JamesBond007.jpg");
		System.out.println("Uploading image file is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		System.out.println("out of frame");
		System.out.println("Adding new Emp");
		Log.info("Adding new employee");
	}

	public void delEmp() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[1]/a/span")).click();

		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into frame");
		Thread.sleep(3000);

		Select dropdown_box = new Select(driver.findElement(By.xpath("//*[@id=\"loc_code\"]")));

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		dropdown_box.selectByValue("1");
		System.out.println("Dropdown Selection is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"loc_name\"]")).sendKeys("Bond");
		System.out.println("entering the emp id is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
		System.out.println("clicking on search button is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
		System.out.println("Ticking the Checkbox is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
		System.out.println("clicking on delete button is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.switchTo().defaultContent();
		System.out.println("out of frame");
		System.out.println("Deleting the emp");
		Log.info("Delting the employee done");
	}
}

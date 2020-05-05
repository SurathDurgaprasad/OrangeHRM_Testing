package com.hrms.lib;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jxl.Workbook;

public class AdminCompantinfoFunctions extends Global {
	 action_obj = new Actions(driver);
	 
	public void pointingAdminCompanyinfo() {
		WebElement companyinfoMenu;
		
		companyinfoMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span"));
		action_obj.moveToElement(companyinfoMenu).build().perform();
	}

	public void generalForm() throws Exception {

		driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"editBtn\"]")).click();
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

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"txtCompanyName\"]")).sendKeys(company_info);
		driver.findElement(By.xpath("//*[@id=\"txtTaxID\"]")).sendKeys(tax_id);
		driver.findElement(By.xpath("//*[@id=\"txtNAICS\"]")).sendKeys(naics);
		driver.findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys(phone);
		driver.findElement(By.xpath("//*[@id=\"txtFax\"]")).sendKeys(fax);
		Thread.sleep(3000);

		Select dropdown_box2 = new Select(driver.findElement(By.xpath("//*[@id=\"cmbCountry\"]")));
		dropdown_box2.selectByVisibleText(country);

		driver.findElement(By.xpath("//*[@id=\"txtStreet1\"]")).sendKeys(add1);
		driver.findElement(By.xpath("//*[@id=\"txtStreet2\"]")).sendKeys(add2);
		driver.findElement(By.xpath("//*[@id=\"cmbCity\"]")).sendKeys(city);
		driver.findElement(By.xpath("//*[@id=\"txtState\"]")).sendKeys(state_province);
		driver.findElement(By.xpath("//*[@id=\"txtZIP\"]")).sendKeys(zip);
		driver.findElement(By.xpath("//*[@id=\"txtComments\"]")).sendKeys(comments);
		driver.findElement(By.xpath("//*[@id=\"editBtn\"]")).click();

		driver.switchTo().defaultContent();
	}

}

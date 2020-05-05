package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseoverMenu2 extends Global {
	action_obj = new Actions(driver);
	
	public void pointingAdminJobs() {
		WebElement jobMenu;
		
		jobMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[2]/a/span"));
		action_obj.moveToElement(jobMenu).build().perform();
	}

	public void pointingAdminQualification() {
		WebElement qualificationMenu;
		
		qualificationMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[3]/a/span"));
		action_obj.moveToElement(qualificationMenu).build().perform();
	}

	public void pointingAdminSkills() {
		WebElement skillsMenu;
		
		skillsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[4]/a/span"));
		action_obj.moveToElement(skillsMenu).build().perform();

	}

	public void pointingAdminMemberships() {
		WebElement membershipsMenu;
		
		membershipsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[5]/a/span"));
		action_obj.moveToElement(membershipsMenu).build().perform();
	}

	public void pointingAdminNationnality_race() {
		WebElement nationalityMenu;
		
		nationalityMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[6]/a/span"));
		action_obj.moveToElement(nationalityMenu).build().perform();
	}

	public void pointingAdminUsers() {
		WebElement usersMenu;
		
		usersMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[7]/a/span"));
		action_obj.moveToElement(usersMenu).build().perform();
	}

	public void pointingAdminEmailnotification() {
		WebElement emailnotificationMenu;
		
		emailnotificationMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[8]/a/span"));
		action_obj.moveToElement(emailnotificationMenu).build().perform();
	}

	public void pointingAdminProjectinfo() {
		WebElement projectsMenu;
		
		projectsMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[9]/a/span"));
		action_obj.moveToElement(projectsMenu).build().perform();
	}

	public void pointingAdminDataimport_export() {
		WebElement dataimport_export_Menu;
		
		dataimport_export_Menu = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[10]/a/span"));
		action_obj.moveToElement(dataimport_export_Menu).build().perform();
	}

}

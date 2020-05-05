package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseoverMenu1 extends Global {
	 action_obj = new Actions(driver);
	
	 public void pointingAdmin() {
		WebElement adminMenu;
		
		adminMenu = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
		action_obj.moveToElement(adminMenu).build().perform();
	}

	public void pointingPim() {
		
		
		WebElement pimMenu;
		
		pimMenu = driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"));
		action_obj.moveToElement(pimMenu).perform();
	}

	public void pointingLeave() {
		WebElement leaveMenu;
		
		leaveMenu = driver.findElement(By.xpath("//*[@id=\"leave\"]/a/span"));
		action_obj.moveToElement(leaveMenu).perform();
	}

	public void pointingTime() {
		WebElement timeMenu;
	
		timeMenu = driver.findElement(By.xpath("//*[@id=\"time\"]/a/span"));
		action_obj.moveToElement(timeMenu).perform();
	}

	public void pointingBenefits() {
		WebElement benefitsMenu;
	
		benefitsMenu = driver.findElement(By.xpath("//*[@id=\"benefits\"]/a/span"));
		action_obj.moveToElement(benefitsMenu).perform();
	}

	public void pointingRecruit() {
		WebElement recruitMenu;
		
		recruitMenu = driver.findElement(By.xpath("//*[@id=\"recruit\"]/a/span"));
		action_obj.moveToElement(recruitMenu).perform();
	}

	public void pointingPerform() {
		WebElement performMenu;
		
		performMenu = driver.findElement(By.xpath("//*[@id=\"perform\"]/a/span"));
		action_obj.moveToElement(performMenu).perform();
	}

	public void pointingReport() {
		WebElement reportMenu;
		
		reportMenu = driver.findElement(By.xpath("//*[@id=\"report\"]/a/span"));
		action_obj.moveToElement(reportMenu).perform();
	}

	public void pointingBugtracker() {
		WebElement bugMenu;
	
		bugMenu = driver.findElement(By.xpath("//*[@id=\"bug\"]/a/span"));
		action_obj.moveToElement(bugMenu).perform();
	}

	public void pointingHelp() {
		WebElement helpMenu;
		
		helpMenu = driver.findElement(By.xpath("//*[@id=\"bug\"]/a/span"));
		action_obj.moveToElement(helpMenu).perform();
	}

}

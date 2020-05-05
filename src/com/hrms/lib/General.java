package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global {

	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
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
}

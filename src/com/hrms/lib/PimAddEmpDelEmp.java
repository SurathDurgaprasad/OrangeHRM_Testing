package com.hrms.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class PimAddEmpDelEmp extends Global {

	public void addEmp() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();

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

		dropdown_box.selectByValue("0");
		System.out.println("Dropdown Selection is done");

		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//*[@id=\"loc_name\"]")).sendKeys("0002");
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

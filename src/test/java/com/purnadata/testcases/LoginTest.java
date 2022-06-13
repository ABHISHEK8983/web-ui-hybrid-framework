package com.purnadata.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.purnadata.libraries.BaseClass;
import com.purnadata.libraries.Utilities;
import com.purnadata.pages.LoginPage;
import com.purnadata.pages.SaleDashboardPage;

public class LoginTest extends BaseClass {

	LoginPage loginPage;
	Utilities utils;
	SaleDashboardPage saleDashboardPage;

	@BeforeMethod
	public void init() {
		initialization();
		loginPage = new LoginPage(driver);
		utils = new Utilities();
		saleDashboardPage=new SaleDashboardPage(driver);
		loginPage.logintoPurna(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void loginsuccess() {
		loginPage.logintoPurna(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(saleDashboardPage.text_page.getText(), "Sale Invoice Details");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
package com.purnadata.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.purnadata.libraries.BaseClass;
import com.purnadata.libraries.ExcelUtils;
import com.purnadata.libraries.Utilities;
import com.purnadata.pages.LoginPage;
import com.purnadata.pages.SaleDashboardPage;
import com.purnadata.pages.SupplierPage;
import com.purnadata.pages.SupplierdashboardPage;

public class SupplierTest extends BaseClass {
	LoginPage loginPage;
	SaleDashboardPage saleDashboardPage;
	SupplierdashboardPage supplierdashboardPage;
	SupplierPage supplierPage;
	Utilities utils;

	@BeforeMethod
	public void init() {
		initialization();
		loginPage = new LoginPage(driver);
		saleDashboardPage = new SaleDashboardPage(driver);
		supplierdashboardPage = new SupplierdashboardPage(driver);
		supplierPage = new SupplierPage(driver);
		utils = new Utilities();
		loginPage.logintoPurna(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getsupplierData() {
		Object[][] data = ExcelUtils.getTestData("Supplier");		
		return data;
	}

	@Test(dataProvider = "getsupplierData")
	public void addSupplier(String sno, String name, String cno, String addr, String email, String coper, String contno,
			String gst, String pan, String bank, String baddr, String acc, String ifsc) {
		utils.clickElement(driver, saleDashboardPage.link_main);
		utils.clickElement(driver, saleDashboardPage.link_supplier);
		utils.clickElement(driver, supplierdashboardPage.btn_newsupplier);
		supplierPage.txtbox_srno.clear();
		supplierPage.txtbox_srno.sendKeys(sno);
		supplierPage.txtbox_name.sendKeys(name);
		supplierPage.txtbox_contactno.sendKeys(cno);
		supplierPage.txtbox_addr.sendKeys(addr);
		supplierPage.txtbox_email.sendKeys(email);
		supplierPage.txtbox_contactper.sendKeys(coper);
		supplierPage.txtbox_contno.sendKeys(contno);
		supplierPage.txtbox_gst.sendKeys(gst);
		supplierPage.txtbox_pan.sendKeys(pan);
		supplierPage.txtbox_bankname.sendKeys(bank);
		supplierPage.txtbox_bankaddr.sendKeys(baddr);
		supplierPage.txtbox_accno.sendKeys(acc);
		supplierPage.txtbox_ifsc.sendKeys(ifsc);
		supplierPage.btn_save.click();
		utils.alertAccept(driver);
		utils.clickElement(driver, supplierPage.btn_supplierdetails);
		Assert.assertEquals(supplierdashboardPage.txt_save.getText(),"200" );
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}

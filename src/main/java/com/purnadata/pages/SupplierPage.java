package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierPage {

	public SupplierPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "sr_no")
	public WebElement txtbox_srno;
	@FindBy(id = "supplier_name")
	public WebElement txtbox_name;
	@FindBy(id = "contact_no")
	public WebElement txtbox_contactno;
	@FindBy(id = "address")
	public WebElement txtbox_addr;
	@FindBy(id = "email_id")
	public WebElement txtbox_email;
	@FindBy(id = "contact_person")
	public WebElement txtbox_contactper;
	@FindBy(id = "cont_no")
	public WebElement txtbox_contno;
	@FindBy(id = "gst_no")
	public WebElement txtbox_gst;
	@FindBy(id = "pan_no")
	public WebElement txtbox_pan;
	@FindBy(id = "bank_name")
	public WebElement txtbox_bankname;
	@FindBy(id = "bank_addr")
	public WebElement txtbox_bankaddr;
	@FindBy(id = "account_no")
	public WebElement txtbox_accno;
	@FindBy(id = "ifsc_code")
	public WebElement txtbox_ifsc;
	@FindBy(id="btn")
	public WebElement btn_save;
	@FindBy(xpath="//a[text()='Supplier Details']")
	public WebElement btn_supplierdetails;
	
}

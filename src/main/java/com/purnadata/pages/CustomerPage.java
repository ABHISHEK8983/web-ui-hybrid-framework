package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {

	public CustomerPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "sr_no")
	public WebElement txtbox_srno;
	@FindBy(id = "customer_name")
	public WebElement txtbox_cname;
	@FindBy(id = "contact_no")
	public WebElement txtbox_contactno;
	@FindBy(id = "billing_address")
	public WebElement txtbox_billaddr;
	@FindBy(id = "shipping_address")
	public WebElement txtbox_shipaddr;
	@FindBy(id = "myButton")
	public WebElement chkbox_sameaddr;
	@FindBy(id = "email")
	public WebElement txtbox_email;
	@FindBy(id = "contact_person")
	public WebElement txtbox_contper;
	@FindBy(id = "person_no")
	public WebElement txtbox_personsno;
	@FindBy(id = "gst_no")
	public WebElement txtbox_gst;
	@FindBy(id = "pan_no")
	public WebElement txtbox_pan;
	@FindBy(id = "vendor_code_no")
	public WebElement txtbox_vendorcode;
	@FindBy(name="submit")
	public WebElement btn_save;
	@FindBy (xpath="//a[text()='Customer Details']")
	public WebElement btn_customerdetails;

}

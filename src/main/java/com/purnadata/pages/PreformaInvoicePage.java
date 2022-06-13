package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreformaInvoicePage {

	public PreformaInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Invoice No: ']/following-sibling::input")
	public
	WebElement txtbox_invoiceno;

	@FindBy(xpath = "(//input[@type='date'])[1]")
	public WebElement txtbox_invoicedate;

	@FindBy(id = "powo")
	public WebElement txtbox_powo;

	@FindBy(id = "powo_date")
	public WebElement txtbox_powodate;

	@FindBy(id = "bill_to")
	public WebElement sele_billto;

	@FindBy(id = "terms_cond")
	public WebElement txtbox_clause;

	@FindBy(id = "sr_no")
	public WebElement txtbox_srno;

	@FindBy(id = "item_no")
	public WebElement txtbox_itemno;

	@FindBy(id = "description")
	public WebElement txtbox_description;

	@FindBy(id = "hsn_code")
	public WebElement txtbox_code;

	@FindBy(id = "unit")
	public WebElement txtbox_unit;

	@FindBy(id = "qty")
	public WebElement txtbox_qty;

	@FindBy(id = "rate")
	public WebElement txtbox_rate;

	@FindBy(id = "myButton")
	public WebElement btn_calculate;

	@FindBy(id = "btn_save_item")
	public WebElement btn_saveitem;

	@FindBy(id = "cgst")
	public WebElement txtbox_cgst;

	@FindBy(id = "sgst")
	public WebElement txtbox_sgst;

	@FindBy(id = "igst")
	public WebElement txtbox_igst;

	@FindBy(id = "transportation")
	public WebElement txtbox_trans;

	@FindBy(id = "packing_and_forwording")
	public WebElement txtbox_packfwd;

	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement btn_save;

	@FindBy(xpath = "//a[text()='Performa Details']")
	public WebElement btn_performadetails;

}

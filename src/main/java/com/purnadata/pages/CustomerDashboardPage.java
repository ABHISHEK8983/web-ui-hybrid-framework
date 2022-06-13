package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDashboardPage {

	public CustomerDashboardPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//button[text()=' New Customer']")
	public
	WebElement btn_newcustomer;
	
	@FindBy (xpath="//td[text()='205']")
	public WebElement txt_save;
	
}

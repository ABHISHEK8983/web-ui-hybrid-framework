package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreformadashboardPage {
	
	public PreformadashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[text()=' New Proforma Invoice']")
	public
	WebElement btn_newpreforma;
	
	@FindBy(xpath="//td[text()='abcd']")
	public WebElement txt_save;

}

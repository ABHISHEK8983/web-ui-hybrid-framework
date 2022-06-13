package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierdashboardPage {
	
	public SupplierdashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=' New Supplier']")
	public WebElement btn_newsupplier;
	
	@FindBy(xpath="//td[text()='200']/following::a[2]")
	public WebElement btn_view;
	
	@FindBy(xpath="//td[text()='200']/following::a[3]")
	public WebElement btn_delete;
	
	@FindBy(xpath="//td[text()='200']")
	public WebElement txt_save;

}

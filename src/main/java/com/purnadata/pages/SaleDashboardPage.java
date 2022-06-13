package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleDashboardPage {
	
	public SaleDashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='menu-text'])[2]")
	public WebElement link_main;
	
	@FindBy(xpath="//a[@href='supplier_dashboard.php']")
	public WebElement link_supplier;
	
	@FindBy (xpath="//a[@href='customer_dashboard.php']")
	public WebElement link_customer;
	
	@FindBy (xpath="(//a[@href='#'])[5]")
	public WebElement link_sales;
	
	@FindBy (xpath="(//b[@class='arrow']/preceding-sibling::a)[10]")
	public WebElement link_preforma;
	
	@FindBy (xpath="//h4[text()='Sale Invoice Details']")
	public WebElement text_page;

}

 package com.purnadata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	WebElement textbox_username;

	@FindBy(id="password")
	WebElement textbox_password;

	@FindBy(name="submit")
	WebElement btn_login;

	public void logintoPurna(String username,String password)
	{
		textbox_username.sendKeys(username);
		textbox_password.sendKeys(password);
		btn_login.click();
	}

}

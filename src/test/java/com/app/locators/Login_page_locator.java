package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class Login_page_locator extends BaseClass {
	
	public Login_page_locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}

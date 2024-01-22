package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Locator extends Search_Hotel_Locator {
	public Select_Hotel_Locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioBtn;
	
	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;
}

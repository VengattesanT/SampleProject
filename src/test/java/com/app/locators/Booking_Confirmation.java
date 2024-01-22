package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Booking_Confirmation extends Book_Hotel_Locator {
	public Booking_Confirmation() {
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement ordernumber;

	public WebElement getOrdernumber() {
		return ordernumber;
	}
}	

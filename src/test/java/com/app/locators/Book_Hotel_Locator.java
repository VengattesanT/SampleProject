package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Locator extends Select_Hotel_Locator {
	public Book_Hotel_Locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement craditCardno;
	
	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCraditCardno() {
		return craditCardno;
	}

	public WebElement getCraeditcardType() {
		return craeditcardType;
	}

	public WebElement getExpiryDateMonth() {
		return expiryDateMonth;
	}

	public WebElement getExpiryDateYear() {
		return expiryDateYear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement craeditcardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryDateMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryDateYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;
	
	
	
	
	
	
	
	
	
	
	
	
	
}

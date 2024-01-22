package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Locator extends Login_page_locator {
	public Search_Hotel_Locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numberofRoom;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofRoom() {
		return numberofRoom;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckOutate() {
		return checkOutate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrensperRoom() {
		return childrensperRoom;
	}

	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkinDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath= "//select[@id='child_room']")
	private WebElement childrensperRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	
}

package com.app.exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.locators.Login_page_locator;
import com.app.pageexe.Booking_Confirmation;
import com.app.pageexe.Login_Exe;
import com.app.pageexe.Search_Hotel_Exe;

public class Main_Exe extends Booking_Confirmation{
	public static void main(String[] args) throws InterruptedException {
		WebElement user = driver.findElement(By.id("email"));
			
		browserLaunch();
		userName();
		passWord();
		logIn();
		location();
		hotel();
		roomType();
numberRoom();
	checkinDate();
		checkoutDate();
		adults();
		childrens();
		search();
		radioBtn();
		continnueBtn();
		fName();
		lName();
		billingAddress();
		creditCardNO();
		CreditCardType();
		expiryDateMonth();
		expiryDateYear();
		ccV();
		bookNow();
		Thread.sleep(15000);
		printConfirmation();
		
		
		
		
		
		
		
	}

}

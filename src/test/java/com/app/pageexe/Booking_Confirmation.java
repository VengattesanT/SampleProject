package com.app.pageexe;

import com.app.base.BaseClass;

public class Booking_Confirmation extends Book_Hotel_Exe {
	public static void printConfirmation() {
		BaseClass.print_Text(new com.app.locators.Booking_Confirmation().getOrdernumber());
	}
	

}

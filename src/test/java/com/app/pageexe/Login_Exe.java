package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.Booking_Confirmation;
import com.app.locators.Login_page_locator;

public class Login_Exe extends Booking_Confirmation {

	
	
	public static void  userName() {
		BaseClass.input_Data(new Login_page_locator().getUsername(), BaseClass.excel_Read_Base_ReUse(1, 0));
			
	}
	public static void passWord() {
		BaseClass.input_Data(new Login_page_locator().getPassWord(), BaseClass.excel_Read_Base_ReUse(1, 1));
	}
	public static void logIn() {
		BaseClass.input_Click(new Login_page_locator().getLoginbtn());
	}
	

}

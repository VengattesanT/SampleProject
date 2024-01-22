package com.app.pageexe;

import java.awt.print.Book;

import com.app.base.BaseClass;
import com.app.locators.Book_Hotel_Locator;

public class Book_Hotel_Exe extends Select_Hotel_Exe {
public static void fName() {
	BaseClass.input_Data(new Book_Hotel_Locator().getfName(),BaseClass.excel_Read_Base_ReUse(1, 10));
}
public static void lName() {
	BaseClass.input_Data(new Book_Hotel_Locator().getlName(),BaseClass.excel_Read_Base_ReUse(1, 11));
}
public static void billingAddress() {
	BaseClass.input_Data(new Book_Hotel_Locator().getBillingAddress(),BaseClass.excel_Read_Base_ReUse(1, 12));
}
public static void creditCardNO() {
	BaseClass.input_Data(new Book_Hotel_Locator().getCraditCardno(),BaseClass.excel_Read_Base_ReUse(1, 13));
}
public static void CreditCardType() {
	BaseClass.dropDown_Value(new Book_Hotel_Locator().getCraeditcardType(),BaseClass.excel_Read_Base_ReUse(1, 14));
}
public static void expiryDateMonth() {
	BaseClass.dropDown_Value(new Book_Hotel_Locator().getExpiryDateMonth(),BaseClass.excel_Read_Base_ReUse(1, 15));
}
public static void expiryDateYear() {
	BaseClass.dropDown_Value(new Book_Hotel_Locator().getExpiryDateYear(),BaseClass.excel_Read_Base_ReUse(1, 16));
}
public static void ccV() {
	BaseClass.input_Data(new Book_Hotel_Locator().getCcv(),BaseClass.excel_Read_Base_ReUse(1, 17));
}
public static void bookNow() {
	BaseClass.input_Click(new Book_Hotel_Locator().getBook());
}
}

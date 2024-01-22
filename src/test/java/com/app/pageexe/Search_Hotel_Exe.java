package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.Search_Hotel_Locator;

public class Search_Hotel_Exe extends Login_Exe {
	public static void location () {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getLocation(),BaseClass.excel_Read_Base_ReUse(1, 2));
	}
	public static void hotel () {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getHotel(),BaseClass.excel_Read_Base_ReUse(1, 3));
	}
	public static void roomType() {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getRoomType(),BaseClass.excel_Read_Base_ReUse(1, 4));
	}
	public static void numberRoom() {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getNumberofRoom(),BaseClass.excel_Read_Base_ReUse(1, 5));
	}
	public static void checkinDate() throws InterruptedException {
		BaseClass.input_Data_Clear(new Search_Hotel_Locator().getCheckinDate(),BaseClass.excel_Read_Base_ReUse(1, 6));
	}
	public static void checkoutDate() throws InterruptedException {
		BaseClass.input_Data_Clear(new Search_Hotel_Locator().getCheckOutate(),BaseClass.excel_Read_Base_ReUse(1, 7));
	}public static void adults() {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getAdultsperroom(),BaseClass.excel_Read_Base_ReUse(1, 8));
	}
	public static void childrens() {
		BaseClass.dropDown_Value(new Search_Hotel_Locator().getCheckinDate(),BaseClass.excel_Read_Base_ReUse(1, 9));
	}
	public static void search() {
		BaseClass.input_Click(new Search_Hotel_Locator().getSearch());
	}




}	


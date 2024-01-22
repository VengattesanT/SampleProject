package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.Select_Hotel_Locator;

public class Select_Hotel_Exe extends Search_Hotel_Exe {
	public static void radioBtn() {
		BaseClass.input_Click(new Select_Hotel_Locator().getRadioBtn());
	}
	public static void continnueBtn() {
		BaseClass.input_Click(new Select_Hotel_Locator().getContinueBtn());
	}

}

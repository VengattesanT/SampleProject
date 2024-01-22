package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class SamplePOM_POJO extends BaseClass {
	
	public SamplePOM_POJO() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")	
	private WebElement user;
	
	@FindBys({
		@FindBy(name="state"),
		@FindBy(name="//div//select")		
	})
	private WebElement username;
	
	@FindAll({
		@FindBy(name ="password"),
		@FindBy(id="passwor"),
		@FindBy(xpath="//div//div")
		
	})
		private WebElement pass;
		
	
	
	

}

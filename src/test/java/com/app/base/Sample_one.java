package com.app.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_one{
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("veng");
			WebElement pass = driver.findElement(By.name("pass"));
			pass.sendKeys("1234");
			WebElement btn = driver.findElement(By.name("login"));
			btn.click();
							}
			
		}




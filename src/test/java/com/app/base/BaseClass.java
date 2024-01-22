
package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	 public static BaseClass base;
	 
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	public static void input_Data(WebElement ele, String data) {
		ele.sendKeys(data);
	
	}
	public static void input_Data_Clear(WebElement ele, String data) throws InterruptedException {
		ele.clear();
		Thread.sleep(5000);
		ele.sendKeys(data);
	}
	public static void input_Click(WebElement ele) {
		ele.click();

	}
	public static void dropDown_Value(WebElement ele, String data) {
		Select s = new Select(ele);
		s.selectByValue(data);
	}
	public static String print_Text(WebElement ele) {
		String value = null;
		System.out.println(ele.getAttribute(value));
		return value;
	}
	public static String excel_Read_Base_ReUse(int row1, int cell1) {
		String value= null;
		try {
			// file locate
			File f = new File("C:\\Users\\JAVA VENKAT\\eclipse-workspace\\Adactin_MavenProject\\src\\test\\resources\\Test_Data\\Test_Data_sheet.xlsx");
			// fileread
			FileInputStream fis = new FileInputStream(f);
			// workbook access
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Data");
			Row row2 = sheet.getRow(row1);
			Cell cell2 = row2.getCell(cell1);
			int cellType = cell2.getCellType();
			if (cellType == 1) {
				value = cell2.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell2)) {
					Date dateCellValue = cell2.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell2.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
		}
		return value;

	}
	public static String  read_prop_reuse(String data) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\new"
					+ "\\Dec_Project\\src\\test\\resources\\Test_Data\\file.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value= prop.getProperty(data);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void afterClass() {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\HP\\Downloads\\Oct_2023_Project\\Oct_2023_Project_One\\Screen\\test.png");
			org.openqa.selenium.io.FileHandler.copy(screenshotAs, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}





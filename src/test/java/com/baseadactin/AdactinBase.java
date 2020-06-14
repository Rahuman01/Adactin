package com.baseadactin;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase {
	static WebDriver driver;
	public static void browserlaunch() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AdactinBaseClass\\driver\\chromedriver1.exe");
			driver= new ChromeDriver();
			System.out.println("Browser succecfully Launched");
		}
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("Browser Launch Failed");
		}
	}
	public static void maximum() {
		try {
			driver.manage().window().maximize();
			System.out.println("Window Maximize Done");
		}
	catch (Exception e){
		e.getMessage();
		System.out.println("Window Maximize Failed");
	}
	}
	public static void loadUrl(String value) {
		driver.get(value);
	}
	public static void getTitle() {
		String title = driver.getTitle();
	System.out.println(title);
	}
	public static void fill(WebElement ele, String value )
	{
		ele.sendKeys(value);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void getAttribute(WebElement ele, String value) {
		String text = ele.getAttribute(value);
		System.out.println(text);
	}
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}
	public static void select(WebElement ele, String value) {
		Select SH = new Select(ele);
		SH.selectByVisibleText(value);
	}
	
	public String generaterandomDate() {
	return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date());
	
	}
    public void Screenshot() {
    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File d =new File ("C:\\Users\\Dell\\eclipse-workspace\\AdactinBaseClass\\Screenshot\\"+generaterandomDate() + ".png");
}
	public static void quitBrowser()
	{
	driver.quit();
	}
	public static void closeBrowser() {
		driver.close();
	}

}

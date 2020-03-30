package com.Facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.Facebook.Utilities.BrowserSelector;
import com.Facebook.Utilities.ConfigDataReader;
import com.Facebook.Utilities.ExcelDataReader;
import com.Facebook.Utilities.HelperFunctions;

public class BaseClass {
	
	public WebDriver driver;
	
	public ExcelDataReader excel;

	
	
	
	@BeforeSuite
	public void setUpBrowser() 
	{   
		excel=new ExcelDataReader();
		
		ConfigDataReader ConfigRead=new ConfigDataReader();
		
	    driver = BrowserSelector.startBrowser(ConfigRead.getPro().getProperty("Browser"));
	}

	@AfterSuite
	public void closeBrowser() {

		BrowserSelector.quitBrowser(driver);
	}
	
	@AfterMethod
	public void  tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			HelperFunctions.CaptureScreenShots(driver);
		}
		
	}

}

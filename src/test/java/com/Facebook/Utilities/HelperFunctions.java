package com.Facebook.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class HelperFunctions {
      
	public static void CaptureScreenShots(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File(".\\ScreenShots\\Login.png"));
		} catch (IOException e) {
			System.out.println("UNABLE TO CAPTURE SCREENSHOT");
			
		}
	}
}

package com.Facebook.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector {

    public static WebDriver driver;

	public static WebDriver startBrowser(String browserName) 
	{
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
            ChromeOptions option=new ChromeOptions();
		    option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		return driver;

	}

	public static  void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}

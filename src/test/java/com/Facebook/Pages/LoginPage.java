package com.Facebook.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Facebook.Utilities.ConfigDataReader;

public class LoginPage {

	WebDriver driver;
	
	ConfigDataReader ConfigRead=new ConfigDataReader();

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	@FindBy(id = "email")
	@CacheLookup
	WebElement Username;

	@FindBy(how = How.XPATH, using = "//*[@id='pass']")
	@CacheLookup
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//*[@type='submit'][1]")
	@CacheLookup
	WebElement LogIN_Button;
	

	public void LoginFaceBook(String Uname, String pass) {
		
		
		
		driver.get(ConfigRead.getPro().getProperty("Url"));

		driver.manage().window().maximize();

		
		Username.sendKeys(Uname);

		Password.sendKeys(pass);

		LogIN_Button.click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		final String expectedTitle="Facebook";
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  
		wait.until(ExpectedConditions.titleContains("Facebook"));
		  
		String ActualTitle= driver.getTitle();

		Assert.assertEquals(ActualTitle,expectedTitle);
		


	}
}

package com.Facebook.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Facebook.Pages.BaseClass;
import com.Facebook.Pages.LoginPage;
import com.Facebook.Pages.ProfilePageFacebook;

public class Addingpost extends BaseClass 
{

@Test(priority = 2)
public void postingOnFaceebook() 
    {   LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	    loginPage.LoginFaceBook(excel.getStringData(0,1,0),excel.getStringData(0,1,1));
	
		ProfilePageFacebook postcontent = PageFactory.initElements(driver,ProfilePageFacebook.class);
		
		postcontent.postContentOnFacebook("Hye its vishal here");
		
	}

}

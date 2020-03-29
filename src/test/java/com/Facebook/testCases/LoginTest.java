package com.Facebook.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import com.Facebook.Pages.BaseClass;
import com.Facebook.Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider="UserData")
	public void facebookLoginTest(String Username,String Password) {
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.LoginFaceBook(Username,Password);
		
	}
	
	
	@DataProvider(name="UserData")
	public Object[][] FaceBookUserData()
	{   
		int row=excel.getRowCount();
		
		int col=excel.getColumnCount();
	
		Object[][] data=new Object[row][col];
		
		
		for(int usersRow=0;usersRow<(excel.getRowCount());usersRow++)
		{
			data[usersRow][0]=excel.getStringData(0,usersRow,0);
			
			data[usersRow][1]=excel.getStringData(0,usersRow,1);
			
		}
		return data;
	}
}
	
 
package com.Facebook.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePageFacebook
{
	WebDriver driver;
	
	public ProfilePageFacebook(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//textarea[@title='Write something here...']")
	WebElement post;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit'][contains(text(),'Post')]")
	WebElement postbutton;
	
	public void postContentOnFacebook(String content)
	{   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		post.click();
		post.sendKeys(content);
		postbutton.click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	
	
}

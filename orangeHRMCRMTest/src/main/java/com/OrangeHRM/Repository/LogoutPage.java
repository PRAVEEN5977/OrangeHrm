package com.OrangeHRM.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{

	//Elements
		@FindBy(id="welcome")
		private WebElement welcome;
		
		
		@FindBy(xpath="//a[text()='Logout']")
		private WebElement logOut;
		
		//getter
		public WebElement getWelcome() {
			return welcome;
		}

		public WebElement getLogOut() {
			return logOut;
		}

		
		public LogoutPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void logout() throws InterruptedException
		{
			getWelcome().click();
			Thread.sleep(2000);
			getLogOut().click();
			
		}
}

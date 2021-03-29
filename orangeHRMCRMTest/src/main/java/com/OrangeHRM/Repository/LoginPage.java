package com.OrangeHRM.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Elements
		@FindBy(id="txtUsername")
		private WebElement uernameTB;


		@FindBy(id="txtPassword")
		private WebElement passworTB;
		

		@FindBy(id="btnLogin")
		private WebElement loginButton;
		
		//getters
		
		public WebElement getUernameTB() {
			return uernameTB;
		}

		public WebElement getPassworTB() {
			return passworTB;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		//constructor
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Action method
		
		public void login(String un, String pw)
		{
			getUernameTB().clear();
			getUernameTB().sendKeys(un);
			getPassworTB().clear();
			getPassworTB().sendKeys(pw);
			getLoginButton().click();
			
			
			
		}

}

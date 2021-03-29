package com.OrangeHRM.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.OrangeHRM.Repository.LoginPage;
import com.OrangeHRM.Repository.LogoutPage;

public class BaseClass 
{

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver1.exe");
	}
	
	public static WebDriver driver;
	public FileLib f= new FileLib();
	public WebDriverCommonLib w= new WebDriverCommonLib();
	
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		w.waitForElementInGui(driver);
	}
	
	@AfterTest
	public void  closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@BeforeMethod
	public void loginApp() throws IOException
	{
	  String un = f.getPropertyValue("UN");
	  String pw = f.getPropertyValue("PWD");
	  driver.get(f.getPropertyValue("URL"));
	  LoginPage l= new LoginPage(driver);
      l.login(un, pw);
	}
	
	@AfterMethod
	public void logoutApp() throws InterruptedException
	{
		LogoutPage lg= new LogoutPage(driver);
		Thread.sleep(2000);
		lg.logout();
	}
	
}

package com.OrangeHRM.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OrangeHRM.Repository.AdminPage;
import com.OrangeHRM.Repository.LoginPage;
import com.OrangeHRM.Repository.LogoutPage;

public class Tc01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		LoginPage lp= new LoginPage(driver);
		lp.login("admin","admin123");
		
		AdminPage av=new AdminPage(driver);
		av.clicks(driver);
		
		//LogoutPage olp= new LogoutPage(driver);
		//Thread.sleep(5000);
		
		
		
	}

}

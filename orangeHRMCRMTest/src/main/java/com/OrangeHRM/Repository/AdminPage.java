package com.OrangeHRM.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
	WebDriver driver;
	Actions action;
	
	//Elements
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement adminButton;
	
	@FindBy(id="menu_admin_UserManagement")
    private WebElement userManagement;
    
    @FindBy(id="menu_admin_viewSystemUsers")
    private WebElement user;
    
    
    //getters methods


	public WebElement getAdminButton() {
		return adminButton;
	}

	public WebElement getUserManagement() {
		return userManagement;
	}
	
	
	// Action method
	
	public void clicks(WebDriver driver) {
		 action= new Actions(driver);
		 action.click(adminButton).perform();
		
	}
    
 
	//Constructor
    
    public AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
}

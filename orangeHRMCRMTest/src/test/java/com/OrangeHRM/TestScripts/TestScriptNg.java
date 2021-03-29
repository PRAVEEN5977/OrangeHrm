package com.OrangeHRM.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OrangeHRM.Repository.AdminPage;
import com.OrangeHRM.generics.BaseClass;
//@Listeners
public class TestScriptNg extends BaseClass

{

	@Test
	public void runTest()
	{
		AdminPage ad= new AdminPage(driver);
		ad.clicks(driver);
	}
}

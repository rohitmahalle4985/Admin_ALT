package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.LoginExcelReading;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.LoginPage_Register;

public class LoginPageTestData extends TestBase 
{
	
	LoginPage loginpage;
	HomePage logindata;
	LoginPage_Register loginpageReg;

	public LoginPageTestData() throws IOException  
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
		loginpageReg=new LoginPage_Register();
	}
	
	
	
	
	@Test(priority=1,groups="smoke")
	public void LoginPageTest()
	{
		String loginPagetitle=loginpage.LoginPageTitle();
		System.out.println(loginPagetitle);
		Assert.assertEquals(loginPagetitle, "AdminLTE 2 | Log in");
		
		
	}
	

	@Test(priority=2,groups="smoke")
	public void dialogueHeading()
	{
		String boxheading=loginpage.loginPageDialogueHeadingM();
		System.out.println(boxheading);
		Assert.assertEquals(boxheading,"Sign in to start your session");
	}
	

	@Test(priority=3,groups="smoke")
	public void loginRegister() throws IOException
	{
		loginpageReg=loginpage.loginPagerRegisterLinkM();		
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] loginDataProvider() throws Exception
	{
		
		Object[][] data = LoginExcelReading.getTestData("login");
		return data;
		
	}
	
	@Test(priority=4,dataProvider="loginData",groups="smoke")
	public void LoginPageDataTest(String uname,String pass) throws IOException
	{
					
		loginpage.loginPageData(uname,pass);
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}

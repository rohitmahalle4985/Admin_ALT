package com.qa.test;

import java.io.IOException;

import org.apache.xalan.xsltc.runtime.Operators;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.JBKPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LoginPage_Register;
import com.qa.pages.OperatorsPage;
import com.qa.pages.UsersPage;

public class HomePageTest extends TestBase {
	
	public HomePageTest() {
		super();
	}
	
	HomePage homepage;
	UsersPage userpage;
	OperatorsPage operatorspage;
	LoginPage loginpage;
	JBKPage jbklink;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		TestBase.initialization();
		homepage=new HomePage();
		loginpage=new LoginPage();
		loginpage.loginPageData(properti.getProperty("username"),properti.getProperty("password"));
		
	}
	
	@Test(priority=1)
	//1
	public void HomePageHeadingTest()
	{
		String heading=homepage.HomePageHeading();
		System.out.println(heading);
		Assert.assertEquals(heading,"AdminLTE 2 | Dashboard","Heading not matches properly");
	}
	
	@Test(priority=2)
	//2
	public void headingLogTest()
	{
		String heading_logo=homepage.headingLogoM();
		System.out.println(heading_logo);
		Assert.assertEquals(heading_logo,"AdminLTE","logo text does not match properly");
	}
	
	@Test(priority=3)
	//3
	public void onlineImageTest()
	{
		boolean onlineImage=homepage.imgOnlineM();
		System.out.println(onlineImage);
	}
	
	@Test(priority=4)
	//4
		public void onlineStatusTest()
		{
			boolean onlinestatus=homepage.onlineStatusM();
			System.out.println(onlinestatus);
		}
		
	@Test(priority=5)
		//5
		public void dashboardTest()
		{
			boolean dashboard=homepage.dashboardM();
			System.out.println(dashboard);
		}
		
	@Test(priority=6)
		//6
		public void userPageTest()
		{
			userpage=homepage.usersM();
		}

	@Test(priority=7)
		//7
		public void operatorsTest()
		{
			operatorspage=homepage.operatorsM();
		}
		
	@Test(priority=8)
		//8
		public void loginpagelogoutTest() throws IOException
		{
			loginpage=homepage.logoutM();
		}
	
	@Test(priority=9)
		//9
		
		public void jbklinkTest()
		{
			jbklink=homepage.jbklink();
		}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}

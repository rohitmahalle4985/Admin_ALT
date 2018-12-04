package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddUsersPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.UsersPage;
import com.qa.pages.AddUsersPage;

public class UsersPageTest extends TestBase {
	
	/*public UsersPageTest() {
		super();
	}
	
	
	 LoginPage loginpage;
	 HomePage homepage;
	 UsersPage userpage;
	 AddUsersPage addusersPage;
	 
	 @BeforeMethod
	public void setup() throws IOException
	{
		TestBase.initialization();
		loginpage=new LoginPage();
		loginpage.loginPageData(properti.getProperty("username"), properti.getProperty("password"));
		userpage=new UsersPage();
		homepage=new HomePage();
		userpage=homepage.usersM();
	}
	
	 @Test
	public void addButtonTestM()
	{
		addusersPage=userpage.addButtonM();
	}
	 
	 @Test
	 public void webTableTestM()
	 {
		 userpage.webTableM();
		
	 }
	 
	 @AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }
*/
}

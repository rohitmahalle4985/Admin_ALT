package com.qa.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.JBKPage;
import com.qa.pages.LoginPage;

public class JBKPageTest extends TestBase {

	
	
	public JBKPageTest() 
	{
		super();
	}
	
	LoginPage loginpage;
	HomePage homepage;
	JBKPage jbkpage;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		TestBase.initialization();
		loginpage=new LoginPage();
		jbkpage=new JBKPage();
		loginpage.loginPageData(properti.getProperty("username"),properti.getProperty("password"));
		driver.findElement(By.xpath("//a[contains(@href,'http://jbk.com')]")).click();
		//jbkpage=homepage.jbklink();
		
		
		
	}
	
	
	@Test(priority=1)
	public  void JBKHeadingTestM()
	{
		String jbkheading=jbkpage.JBKHeadingM();
		System.out.println(jbkheading);
		Assert.assertEquals(jbkheading,"Welcome to JBK.com");
	}
	
	@Test(priority=2)
	public  void redInfoTestM()
	{
		String jbksubHeading=jbkpage.redInfoM();
		System.out.println(jbksubHeading);
		Assert.assertEquals(jbksubHeading,"Site is being renewed - check back after 10/01/2015","Text doesnt not get matched");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}

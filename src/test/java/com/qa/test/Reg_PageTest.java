package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mongodb.assertions.Assertions;
import com.qa.base.LoginExcelReading;
import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.LoginPage_Register;
import com.qa.utils.TestUtils;

public class Reg_PageTest extends TestBase {
	
	public Reg_PageTest() 
	{
		super();
	}

	LoginPage_Register loginPage_register; 
	LoginPage loginpage;
	TestUtils testutils;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		loginPage_register=new LoginPage_Register();
		loginPage_register.regLinkEntryM();
	}
	
	
	@Test(priority=1)
	public void reg_DialogueheadingTest() throws InterruptedException 
	{
		
		String headingdialogue=loginPage_register.reg_DialogueheadingM();
		System.out.println(headingdialogue);
		Assert.assertEquals(headingdialogue,"Register a new membership");
	}
	
	
	@DataProvider(name="RegData")
	public Object[][] loginDataProvider() throws Exception
	{
		
		Object[][] data = LoginExcelReading.getTestData("regData");
		return data;
		
	}
	
	@Test(priority=2,dataProvider="RegData")
	public void reg_Data(String name,String mobile,String email,String password) throws IOException, InterruptedException
	{
		loginPage_register.reg_DataM(properti.getProperty("regname"),
						properti.getProperty("regmob") ,properti.getProperty("regemail") ,
						properti.getProperty("regpass"));
		Thread.sleep(500);
		
	}
	
	@Test(priority=3)
	public void reg_linkTest() throws IOException
	{
			loginpage=loginPage_register.reg_linkM();
	}
	
	@AfterMethod
	public void tearDownReg_log()
	{
		driver.quit();
	}
	
}

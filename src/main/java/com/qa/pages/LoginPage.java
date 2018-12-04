package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase 
{

	//initializing the page objects or webelements
	public LoginPage() throws IOException 
	{
		
		PageFactory.initElements(driver,this);
	}
	
	//Page Factory / Object repository
	@FindBy(id="email1")
	protected WebElement uname;
	
	@FindBy(id="password")
	protected WebElement pass;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block btn-flat')]")
	protected WebElement signIn;
	
	@FindBy(xpath="//*[contains(@href,'pages/examples/dashboard.html')])")
	protected WebElement loginPageHead;
	
	@FindBy(xpath="//p[contains(@class,'login-box-msg')]")
	protected WebElement loginPageDialogueHead;

	@FindBy(xpath="//*[contains(@class,'text-center')]")
	protected WebElement loginPageRegisterlink;

	
	//Actions
	public String LoginPageTitle()
	{
		return driver.getTitle();
		 
	}
	
	public String loginPageDialogueHeadingM()
	{
		
		return loginPageDialogueHead.getText();
	}
	
	public LoginPage_Register loginPagerRegisterLinkM() throws IOException
	{
		loginPageRegisterlink.click();
		return new LoginPage_Register();
	}
	
	public HomePage loginPageData(String uData,String passData) throws IOException
	{
		uname.sendKeys(uData);
		pass.sendKeys(passData);
		signIn.click();
		
		return new HomePage();
		
	}
	
	
}

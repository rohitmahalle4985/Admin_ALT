package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase 
{

	public HomePage() throws IOException 
		{
			PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="//[contains(@class,'logo')]")
	private WebElement headingLogo;
	
	@FindBy(xpath="//img[contains(@class,'img-circle')]")
	private WebElement imgOnline;
	
	@FindBy(xpath="//div[contains(@class,'pull-left info')]")
	private WebElement onlineStatus;
	
	@FindBy(xpath="//a[contains(@href,'dashboard.html')]")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[contains(@href,'users.html')]")
	private WebElement users;
	
	@FindBy(xpath="//a[contains(@href,'operators.html')]")
	private WebElement operators;
	
	@FindBy(xpath="//a[contains(@href,'logout.html')]")
	private WebElement logout;
	

	@FindBy(xpath="//a[contains(@href,'http://jbk.com')]")
	private WebElement jbklink;

	//1
	public String HomePageHeading()
	{
		return driver.getTitle();
	}
	
	//2
	public String headingLogoM()
	{
		return headingLogo.getText();
	}
	
	//3
	public boolean imgOnlineM()
	{
	return imgOnline.isDisplayed();
	}
	
	//4
	public boolean onlineStatusM()
	{
		return onlineStatus.isEnabled();
	}
	
	//5
	public boolean dashboardM()
	{
		return dashboard.isDisplayed();
	}
	
	//6
	public UsersPage usersM()
	{
		if(users.isDisplayed())
		{
			//users.getText();
			users.click();
			
		}
		return new UsersPage();
	}
	
	//7
	@SuppressWarnings("unlikely-arg-type")
	public OperatorsPage operatorsM()
	{
		if(operators.equals("Operators"))
		{
			//users.getText();
			operators.click();
			
		}
		return new OperatorsPage();
		
	}
	
	//8
	public LoginPage logoutM() throws IOException
	{
		if(logout.isEnabled())
		{
			//users.getText();
			logout.click();
			
		}
		return new LoginPage();
		
	}
	
	//9
	public JBKPage jbklink()
	{
		jbklink.click();
		return new JBKPage();
	}
}

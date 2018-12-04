package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage_Register extends TestBase {

	public LoginPage_Register() throws IOException {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//page factory objects
	@FindBy(xpath="//a[contains(@href,'pages/examples/register.html')]")
	private WebElement regLinkEntry;
	
	@FindBy(xpath="//p[contains(text(),'Register a new membership')]")
	private WebElement reg_Dialogueheading;
	
	
	@FindBy(xpath="//input[contains(@id,'name')]")
	private WebElement reg_name;
	
	@FindBy(xpath="//input[contains(@id,'mobile')]")
	private WebElement reg_mob;
	
	@FindBy(xpath="//input[contains(@id,'email')]")
	private WebElement reg_email;
	
	@FindBy(xpath="//input[contains(@id,'pass')]")
	private WebElement reg_pass;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block btn-flat')]")
	private WebElement reg_signIn;
	
	
	@FindBy(xpath="//a[contains(@class,'text-center')]")
	private WebElement reg_link;
	
	public LoginPage_Register regLinkEntryM() throws IOException
	{
		regLinkEntry.click();
		return new LoginPage_Register();
	}
	
	public String reg_DialogueheadingM()
	{
		return reg_Dialogueheading.getText();
		 
	}
	
	public void reg_DataM(String regname,String regmob,String regemail,String regpass ) throws IOException
	{	
		 reg_name.sendKeys(regname);
		 reg_mob.sendKeys(regmob);
		 reg_email.sendKeys(regemail);
		 reg_pass.sendKeys(regpass);
		 
		 reg_signIn.click();
		 driver.switchTo().alert().accept();
		 
		
		 
		 
	}
	
	public LoginPage reg_linkM() throws IOException
	{
		reg_link.click();
		return new  LoginPage();
	}
	
	
	

}

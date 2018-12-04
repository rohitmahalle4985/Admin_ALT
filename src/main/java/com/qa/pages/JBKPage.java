package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class JBKPage extends TestBase {
	 
	public JBKPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="html/body/center/h1")
	 private WebElement JBKHeading;
	
	@FindBy(xpath="//font[contains(@color,'red')]")
	private WebElement redInfo;
	
	
	public String JBKHeadingM()
	{
		return JBKHeading.getText();
		
	}
	
	public String redInfoM()
	{
		return redInfo.getText();
		
	}
	

}

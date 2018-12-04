package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AddUsersPage extends TestBase {
	
	public AddUsersPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[contains(@id,'username')]")
	private WebElement userName;
	
	@FindBy(xpath="//input[contains(@id,'mobile')]")
	private WebElement mobile;
	
	@FindBy(xpath="//input[contains(@id,'email')]")
	private WebElement email;
	
	@FindBy(xpath="//input[contains(@id,'gender')]")
	private WebElement gender;
	
	@FindBy(xpath="//select[contains(@class,'form-control')]")
	private WebElement state;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(@id,'submit')]")
	private WebElement submit;
	
	
	


}

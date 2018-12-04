package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utils.TestUtils;
import com.qa.utils.WebdriverEventListener;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestBase {
	
	
	
	public static WebDriver driver;
	public static Properties properti;
	public static WebElement element;
	
	public static Workbook book;
	public static Sheet sheet;

	public static EventFiringWebDriver e_driver;
	public static WebdriverEventListener eventListener; 
	
	

	
	public TestBase(){
		
		properti=new Properties();
		FileInputStream fis;
		try 
		{
		fis = new FileInputStream(("C:\\Users\\Nishant\\eclipse-workspace\\Offline_ALT\\src\\main"
									+ "\\java\\com\\qa\\config\\config.properties"));
		properti.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
		e.printStackTrace();
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
		}
	
	
	public static void initialization()
	{
		String browsername=properti.getProperty("browser");
		
		if (browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equals("Chrome"))
		{	
			System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new WebdriverEventListener();
		e_driver.register(eventListener);
		driver=e_driver; 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.time_PageLayout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.time_PageLayout, TimeUnit.SECONDS);
		
		driver.get(properti.getProperty("url"));
	}
	


	
	
		
	}

	
	
	
	
	
	
	 
	
	
	
	



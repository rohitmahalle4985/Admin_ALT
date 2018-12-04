package com.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class TestUtils extends TestBase {

	
	 public static int time_PageLayout=20;
	public static int time_implicit=10; 
	
	
	public void switchToAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	
	public static void takesScreenshotAtEndOfTest(String screenshotname) throws IOException
	{
		
	TakesScreenshot shot= (TakesScreenshot)driver;
	
	File f=shot.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(f,new File(".\\ScreenShots\\"+screenshotname+".png"));
	
	}
}

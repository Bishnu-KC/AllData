package com.selenium.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicCommandsForBrowsers {
	
	WebDriverConfig driver=new WebDriverConfig();
	WebDriver chrome=driver.getChrome();
	
	@Test
	public void basicCommandTest()
	{
		
		//Implicit wait
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.get("https://google.com");
		
		
		//chrome.findElement(By.id("q")).getText();
		
		chrome.findElement(By.name("q")).sendKeys("QA Automation Class");
		
		
		//Explicit Wait
		
		WebDriverWait wait=new WebDriverWait(chrome,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		
		/*
		 * wait for 10 seconds
		 * open an amazon in chrome and firefox browsers
		 * find the name or ID for search box on amazon
		 * refresh the webpage
		 * find the name or id for search box and type iphone case 
		 * close the both of browsers
		 * 
		 * */
		
		
		
		
		
	}
	
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}

}

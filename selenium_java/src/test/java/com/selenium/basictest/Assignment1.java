package com.selenium.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/*
 * wait for 10 seconds
 * open an amazon in chrome and firefox browsers
 * find the name or ID for search box on amazon
 * refresh the webpage
 * find the name or id for search box and type iphone case 
 * close the both of browsers
 * 
 * */

public class Assignment1 {
	WebDriverConfig driver=new WebDriverConfig();
	WebDriver chrome=driver.getChrome();
//	WebDriver firefox= driver.getFirefox();
	
	@Test
	public void locatorsInWeb()
	{
		chrome.get("HTTP://amazon.com");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		chrome.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone case");
		
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void basicCommands()
//	{
//		firefox.navigate().to("http://amazon.com");
//		firefox.navigate().refresh();
//	
//		
//		try
//		{
//			Thread.sleep(10000);
//			//throw new InterruptedException();
//			
//		}
//		catch(InterruptedException e)
//		{
//			//System.out.println("Hello");
//			e.printStackTrace();
//		}
//		
		
	}
	/*
	
	@AfterTest
	public void closeTest()
	{
	chrome.quit();
	firefox.quit();
	}
	*/
	

	


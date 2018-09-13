package com.selenium.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assignment2 {
	
	WebDriverConfig div=new WebDriverConfig();
	WebDriver chrome=div.getChrome();
	@Test
	public void clickingLearnHtml()
	{
		chrome.get("http://www.w3schools.com");
		chrome.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		chrome.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();
		
		chrome.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		chrome.navigate().back();
	}
	
	
	@AfterTest
	public void close()
	{
		chrome.close();
	}

}

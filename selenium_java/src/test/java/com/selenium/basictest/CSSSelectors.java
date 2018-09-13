package com.selenium.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CSSSelectors {
	
	WebDriverConfig driver=new WebDriverConfig();
	WebDriver firefox=driver.getFirefox();
	
	
	@Test
	public void searchWithCssPath()
	{
		//firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		firefox.navigate().to("http://google.com");
		//firefox.findElement(By.cssSelector("#lst-ib")).sendKeys("CSS name");;
		WebElement searchBox=firefox.findElement((By.cssSelector("#lst-ib")));
		searchBox.sendKeys("Bishnu");
		
		
		WebDriverWait wait=new WebDriverWait(firefox,1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#lst-ib")));
	}
	
	@AfterTest
	public void closeTest()
	{
		firefox.close();
	}

}

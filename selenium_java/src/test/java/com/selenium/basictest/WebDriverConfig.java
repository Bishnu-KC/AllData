package com.selenium.basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	
	public WebDriver getChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bishnu/Documents/Software/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		return driver;
	}
	
	public WebDriver getFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bishnu/Documents/Software/geckodriver");
		WebDriver driver= new FirefoxDriver();
		return driver;
	}
	

}

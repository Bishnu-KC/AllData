package com.aop;

public class Logging {
	
	//before the method execution
	public void beforeAdvice()
	{
		System.out.println("Employee profile is going to setup.");
	}
	
	//after selected method execution
	public void afterAdvice()
	{
		System.out.println("Employee profile is set up.");
	}
	
	//when any method returns
	public void afterReturningAdvice(Object retVal)
	{
		System.out.println("Returning: "+retVal.toString());
	}
	
	// when exception raised
	public void afterThrowingAdvice(IllegalArgumentException ex)
	{
		System.out.println("THere has been an exception: "+ex.toString());
	}

}

package ts.aop;

public class Logging {
	
	//before a selected method execution
	
	public void beforeAdvice()
	{
		System.out.println("Going to setup student profile");
	}
	
	//after a selected method execution
	
	public void afterAdvice()
	{
		System.out.println("Student profile has been setup.");
	}
	
	//when any method returns
	
	public void afterReturningAdvice(Object retVal)
	{
		System.out.println("Returning: "+retVal.toString());
	}
	
	//exception raised
	public void afterThrowingAdvice(IllegalArgumentException ex)
	{
		System.out.println("THere has an exception: "+ex.toString());
	}

}

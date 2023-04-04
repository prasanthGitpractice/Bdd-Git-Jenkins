package glueCode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Shared 
{
	public RemoteWebDriver driver;
	public Scenario s;//or
	//public static int step=1;
	// We can Also write these Hooks in StepDefs Class Also
	/*@Before("@smokeTest and @RealTest")//conditional hook
	public void beforeHook(Scenario s)
	{
		//System.out.println(s.getName()+" is started");//or
		s.log(s.getName()+" is started");
	}
	@BeforeStep
	public void beforeStepHook(Scenario s)
	{
		//System.out.println(step);//or
		s.log(s.getLine()+" is started");
	}
	@After("@smokeTest or @RealTest")//conditional hook
	public void AfterHook(Scenario s)
	{
		//System.out.println(s.getName()+" is "+s.getStatus());//or
		s.log(s.getName()+" is "+s.getStatus());
	}
	@BeforeStep
	public void afterStepHook(Scenario s)
	{
		//step++;//or
		s.log(s.getLine()+" is executed");
	}*/
}

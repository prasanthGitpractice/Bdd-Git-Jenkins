package tests_Runner;

import org.testng.annotations.DataProvider;

//import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
		features={"D:\\eclipse\\BDD\\src\\test\\resources\\Features"},
		glue= {"glueCode"},
		monochrome=true
	)
public class Runner1 extends AbstractTestNGCucumberTests
{
	// to run our INDIVIDUAL scenarios in parallel
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return (super.scenarios());
	}

}

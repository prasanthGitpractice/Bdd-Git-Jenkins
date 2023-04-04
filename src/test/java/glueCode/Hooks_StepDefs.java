/*package glueCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_StepDefs 
{
	Shared sh;
	public Hooks_StepDefs(Shared sh)
	{
		this.sh=sh;
	}
	
	@Given("open browser")
	public void openbrowser()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		// to avoid Illegal state exception
		System.setProperty("webdriver.chrome.driver",
	      "D:\\eclipse\\BDD\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		sh.driver=new ChromeDriver(co);
		sh.driver.manage().window().maximize();
	}
	
	@When("launch site {string}")
	public void launchsite( String x) 
	{
		sh.driver.get(x);
	}
	@Then("page title should be {string}")
	public void googlepagetitle(String x)
	{
		String y=sh.driver.getTitle();
		if(y.contains(x))
		{
			System.out.println("page title test passed");
		}
		else
		{
			//System.out.println("page title test failed");//or ------>result comes in console
			sh.s.log(sh.s.getName()+" is failed");// result comes in cucumber reports
			//log() method in Scenario class is for to print results with message in cucumber reports
		}
	}
	@When("quit site")
	@When("close site")
	public void exitsite()
	{
		sh.driver.quit();
	}
	@And("search a word {string} and click ENTER key")
	public void search(String x) 
	{
		sh.driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	}
	@Then("page title should contain {string}")
	public void pageTitle(String x) 
	{
		String y=sh.driver.getTitle();
		if(y.contains(x))
		{
			System.out.println("page title test passed");
		}
		else
		{
			System.out.println("page title test failed");
		}
	}
	@And("search {string} and click ENTER key")
	public void searchword(String x)
	{
		sh.driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	}
	@Then("page title should contain that <word>")
	public void word(String x)
	{
		if((sh.driver.getTitle())==x)
		{
			System.out.println("word test passed");
		}
		else
		{
			System.out.println("word test failed");
		}
	}
	@Then("search a word and click Enter key and check page title")
	public void datatable(DataTable dt)
	{
		List<String> words=dt.asList();
		for(int i=1;i<words.size();i++)
		{
			sh.driver.findElement(By.name("q")).sendKeys(words.get(i),Keys.ENTER);
			if(sh.driver.getTitle().contains(words.get(i)))
			{
				System.out.println("Data table test passed");
			}
			else
			{
				System.out.println("Data table test failed");
			}
			sh.driver.findElement(By.name("q")).clear();
		}
	}
}*/

/*package glueCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs 
{
	public RemoteWebDriver driver;
	
	@Given ("open browser")
	public void openbrowser()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		// to avoid Illegal state exception
		System.setProperty("webdriver.chrome.driver",
	      "D:\\eclipse\\BDD\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	}
	
	@When("launch site {string}")
	public void launchsite( String x) 
	{
		driver.get(x);
	}
	@Then("page title should be {string}")
	public void googlepagetitle(String x)
	{
		String y=driver.getTitle();
		if(y==x)
		{
			System.out.println("page title test passed");
		}
		else
		{
			System.out.println("page title test failed");
		}
	}
	@When("quit site")
	@When("close site")
	public void exitsite()
	{
		driver.quit();
	}
	@And("search a word {string} and click ENTER key")
	public void search(String x) 
	{
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	}
	@Then("page title should contain {string}")
	public void pageTitle(String x) 
	{
		String y=driver.getTitle();
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
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	}
	@Then("page title should contain that <word>")
	public void word(String x)
	{
		if((driver.getTitle())==x)
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
			driver.findElement(By.name("q")).sendKeys(words.get(i),Keys.ENTER);
			if(driver.getTitle().contains(words.get(i)))
			{
				System.out.println("Data table test passed");
			}
			else
			{
				System.out.println("Data table test failed");
			}
			driver.findElement(By.name("q")).clear();
		}
	}
}*/

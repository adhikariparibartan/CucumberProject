package CucumberFramework.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() +  "/src/test/java/CucumberFramework/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		//this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	
	@After()
	public void tearDown() {
		driver.manage().deleteAllCookies();
		//driver.quit();
	}
	
	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url)  {
		driver.get(url); // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	

	@When("^user lands on facebook login page$")
	public void user_lands_on_facebook_login_page() {
		 
		String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = "";

		actualTitle = driver.getTitle();
		  
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	   
	}

	@And("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String username)  {
		
		//send username keys
		driver.findElement(By.cssSelector("input[type ='text']")).sendKeys(username);
	

	}

	@And("^user enter the \"([^\"]*)\" password$")
	public void user_enter_the_password(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(password);	

	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^the user should land on home page with title  \"([^\"]*)\"$")
	public void the_user_should_land_on_home_page_with_title(String arg1) throws Throwable {
		String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = "";

		actualTitle = driver.getTitle();
		  
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        System.out.println(actualTitle);  
	}
	@Then("^should enter user account \"([^\"]*)\"$")
	public void should_enter_user_account(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@type=\"search\"]")).click();
		driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@type=\"search\"]")).clear();
		driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("Aastha Bharati");
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter_this_url(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	    throw new PendingException();
	}
	@When("^user enter \"([^\"]*)\" this name$")
	public void user_enter_this_name(String arg1) throws Throwable {
		//input[type='text']
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys(arg1);
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys(arg1);
		driver.findElement(By.cssSelector("input[type ='text']")).sendKeys(arg1);

		
		 throw new PendingException(); 
	}
//	@Given("^User nevigate to \"([^\"]*)\"$")
//	public void user_nevigate_to(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.get(arg1);
//	    throw new PendingException();
//	}
	
	//@When("^user land o contact us page$")
//	public void user_land_o_contact_us_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
	//}
	//*************************************************************
	
	
	
	@Given("^User nevigate to  \"([^\"]*)\"$")
	public void user_nevigate_to(String arg1) throws Throwable {
	   driver.get(arg1);
	   // throw new PendingException();
	}
	
	@When("^user land to Create Account page$")
	public void user_land_to_Create_Account_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}
	@And("^user enter name \"([^\"]*)\"$")
	public void user_enter_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#firstName")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(arg1);
	   // throw new PendingException();
	}
	@And("^user enter lastname \"([^\"]*)\"$")
	public void user_enter_lastname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#lastName")).sendKeys(arg1);
	  //  throw new PendingException();
	}
	
	@And("^user Enter use rname \"([^\"]*)\"$")
	public void user_Enter_use_rname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#username")).sendKeys(arg1);
	  //  throw new PendingException();
	}
	@Then("^enter user password \"([^\"]*)\"$")
	public void enter_user_password(String arg1) throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys(arg1);
	   // throw new PendingException();
	}

}

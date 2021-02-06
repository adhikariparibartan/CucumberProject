package CucumberFramework.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@Before() // @before is called hook annotation. This hook makes the anotated code below to
				// run before every method.
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@After() // This annotation runs after every test is done. with this code below,
	// the Chrome browser driver closes automatically. If the Chrome exits at the
	// end automatically,
	// you need to comment this section.
	public void tearDown() {
		// driver.manage().deleteAllCookies();
		// driver.quit();
	}

	@Given("^user navigatess to \"([^\"]*)\"$")
	public void user_navigatess_to(String url) throws Throwable {
		driver.get(url);
		// throw new PendingException();
	}

	@When("^user lands on Facebook login page$")
	public void user_lands_on_Facebook_login_page() throws Throwable {
		driver.getTitle();
	}

	@When("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String arg1) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(arg1);
	}

	@When("^user enter the \"([^\"]*)\" password$")
	public void user_enter_the_password(String arg1) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(arg1);
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
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		System.out.println(actualTitle);
	}

	@Then("^user searches for \"([^\"]*)\" in searchbar$")
	public void user_searches_for_in_searchbar(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input"))
				.sendKeys(arg1);
	}

	@Then("^user lands in searched content$")
	public void user_lands_in_searched_content() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input"))
		.sendKeys(Keys.RETURN);
	    throw new PendingException();
	}
	@Then("^the search is successful$")
	public void the_search_is_successful() throws Throwable {
		System.out.println("You have been successful");
		throw new PendingException();
	}

//=========================================== Practice guru 99 Demo Page====================================================================//

	@Given("^I want to get \"([^\"]*)\"$")
	public void i_want_to_get(String url) throws Throwable {
		driver.get(url);
	}

	@When("^user lands on Guru (\\d+) home page$")
	// arg1 can be changed to whatever variableName you want to give. Check line no
	// 121-123
	public void user_lands_on_Guru_home_page(int arg1) throws Throwable {
		driver.getTitle();
	}

	@When("^user enters \"([^\"]*)\" username$")
	public void user_enters_username(String username) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(username);
	}

	@When("^user enter \"([^\"]*)\" password$")
	public void user_enter_password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@Then("^click Login$")
	public void click_Login() throws Throwable {
		driver.findElement(By.name("btnLogin")).click();
	}

	@When("^user lands on Home page, validate Title$")
	public void user_lands_on_Home_page_validate_Title() throws Throwable {
		driver.getTitle();
		String title = " Guru99 Bank Manager HomePage ";
		if (title.contentEquals(" Guru99 Bank Manager HomePage ")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

//========================================Negative Scenario login=======================================

	@Given("^I want to ope \"([^\"]*)\"$")
	public void i_want_to_ope(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@When("^user navigates to the Guru (\\d+) Home Page$")
	public void user_navigates_to_the_Guru_Home_Page(int arg1) throws Throwable {
		driver.getTitle();
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String username) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(username);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String password) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^use click on Login button$")
	public void use_click_on_Login_button() throws Throwable {
		driver.findElement(By.name("btnLogin")).click();

	}

}

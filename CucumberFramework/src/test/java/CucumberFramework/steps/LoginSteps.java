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

		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath()
				+ "/src/test/java/CucumberFramework/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@After()
	public void tearDown() {
		driver.manage().deleteAllCookies();
		// driver.quit();
	}

	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) {
		driver.get(url); // Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^user lands on facebook login page$")
	public void user_lands_on_facebook_login_page() {

		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = "";

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

	}

	@And("^user enters the \"([^\"]*)\" username$")
	public void user_enters_the_username(String username) {

		// send username keys
		driver.findElement(By.id("email")).sendKeys(username);

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

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		System.out.println(actualTitle);
	}

	// -------------------------------------------------------------------New Face
	// book login

	@Given("^user url \"([^\"]*)\" facebook_login$")
	public void user_url_facebook_login(String urllogin) throws Throwable {
		driver.get(urllogin);

	}

	@Given("^user le login page kholna lagyo \"([^\"]*)\"$")
	public void user_le_login_page_kholna_lagyo(String username) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(username);

	}

	// for password
	@Given("^user le password lagayo \"([^\"]*)\" password$")
	public void user_le_password_lagayo_password(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(password);

	}

//login

	@Given("^lets login bro$")
	public void lets_login_bro() throws Throwable {
		driver.findElement(By.name("login")).click();

	}

	@And("^niraj lai search garne$")
	public void niraj_lai_search_garne() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/label/input"))
				.sendKeys("niraj");
		throw new PendingException();
	}

//driver.findElement(By.cssSelector("input[XPath='//*[@id="mount_0_0"]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input']"));

//login bank project............................................................................

	@Given("^Open login page \"([^\"]*)\" login$")
	public void open_login_page_login(String url) throws Throwable {
		driver.get(url);
		
	}

@And("^user put in user name \"([^\"]*)\" user_name$")
public void user_put_in_user_name_user_name(String arg1)  {
   driver.findElement(By.name("uid")).sendKeys(arg1);
}

@And("^user put in password \"([^\"]*)\" password$")
public void user_put_in_password_password(String arg1)  {
    driver.findElement(By.name("password")).sendKeys(arg1);
    
}
@And("^user cick login log_in$")
public void user_cick_login_log_in() throws Throwable {
    driver.findElement(By.name("btnLogin")).click();
}
// cuctoemr entry form.....................................................

@Given("^cuctomer form  \"([^\"]*)\" url$")
public void cuctomer_form_url(String url) throws Throwable {
    driver.get(url);
   
}
@Given("^data entry \"([^\"]*)\"$")
public void data_entry(String arg1) throws Throwable {
    driver.findElement(By.name("name")).sendKeys(arg1);
    
}
@Given("^date of birthdate \"([^\"]*)\"$")
public void date_of_birthdate(String arg1) throws Throwable {
    driver.findElement(By.name("dob")).sendKeys(arg1);
    
}
@Given("^address is added \"([^\"]*)\"$")
public void address_is_added(String arg1) throws Throwable {
    driver.findElement(By.name("addr")).sendKeys(arg1);
    
}

}


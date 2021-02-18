package CucumberFramework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OnlineRegistration {
	private LoginSteps loginStep;

	public OnlineRegistration(LoginSteps loginStep) {
		this.loginStep = loginStep;
	}

	@Given("^get url \"([^\"]*)\" url$")
	public void get_url_url(String arg1) {
		loginStep.driver.get(arg1);
	}

	@And("^user click online registration button$")
	public void user_click_online_registration_button() throws Throwable {
		loginStep.driver.findElement(By.xpath("//*[@id=\"menu-bar\"]/li[1]/a")).click();
	}

	@Given("^user select citizen$")
	public void user_select_citizen() throws Throwable {

		Select drpCountry = new Select(loginStep.driver.findElement(By.name("citizenshipID")));
		drpCountry.selectByVisibleText("Nepal");

	}

	@Given("^user select licence type$")
	public void user_select_licence_type() throws Throwable {
		Select licenceType = new Select(loginStep.driver.findElement(By.name("statusType")));
		licenceType.selectByVisibleText("NEWLICENSE");

	}

	@Then("^user click on proceed$")
	public void user_click_on_proceed() throws Throwable {
		loginStep.driver.findElement(By.id("confirmBox")).click();
	}


}

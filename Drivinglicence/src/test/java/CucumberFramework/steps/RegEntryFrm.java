package CucumberFramework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class RegEntryFrm {
	private LoginSteps loginStep;

	public RegEntryFrm(LoginSteps loginStep) {
		this.loginStep = loginStep;
	}
	

	@Given("^user enter first_name \"([^\"]*)\"$")
	public void user_enter_first_name(String arg1) throws Throwable {
		loginStep.driver.findElement(By.id("firstname")).sendKeys(arg1);
	}
//	@Given("^user go back previous page$")
//	public void user_go_back_previous_page() throws Throwable {
//	    //loginStep.driver.navigate().back();

	@Given("^User enter midd_name \"([^\"]*)\"$")
	public void user_enter_midd_name(String arg1) throws Throwable {
		loginStep.driver.findElement(By.id("middlename")).sendKeys(arg1);
	}

	@Given("^use enter last_name\"([^\"]*)\"$")
	public void use_enter_last_name(String arg1) throws Throwable {
		loginStep.driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(arg1);
	}
	//for date of birth
	@Given("^use enter DOB\"([^\"]*)\"$")
	public void use_enter_DOB(String arg1) {
		loginStep.driver.findElement(By.xpath("//*[@id=\"dob\"]/input[2]")).sendKeys(arg1);
	    
	}

@Given("^user select gender$")
public void user_select_gender()  {
	loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_gender_id\"]")).sendKeys();
	
	
	Select gender = new Select(loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_gender_id\"]")));
	gender.selectByVisibleText("Female");
}


  @Given("^User enter occupation \"([^\"]*)\"$")
   public void user_enter_occupation(String arg1) throws Throwable {
	loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_occupation\"]")).sendKeys(arg1);
   
}

@Given("^User select blood group$")
public void user_select_blood_group() throws Throwable {
	Select blood = new Select(loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_bloodgroup_id\"]")));
	blood.selectByVisibleText("B+");
}
@Given("^enter education \"([^\"]*)\"$")
public void enter_education(String arg1) throws Throwable {
    loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_education\"]")).sendKeys(arg1);
}
@Given("^Enter citizen no\\.\"([^\"]*)\"$")
public void enter_citizen_no(String arg1) throws Throwable {
    loginStep.driver.findElement(By.xpath("//*[@id=\"appEntry_dlOnlineReg_citizenshipnumber\"]")).sendKeys(arg1);
}
}



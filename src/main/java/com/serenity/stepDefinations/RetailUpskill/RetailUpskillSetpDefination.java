package com.serenity.stepDefinations.RetailUpskill;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.util.Map;

import com.serenity.steps.RetailUpskillSteps.RetailUpskillSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RetailUpskillSetpDefination {
	@Steps
	RetailUpskillSteps russtep;

	@Given("I am on {string}")
	public void i_am_on_url(String url) {
		russtep.geturl(url);
	}

	@When("I perform {string} to the website")
	public void i_perform_to_the_website(String action, io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Map<String, String> UserDetails = dataTable.asMap(String.class, String.class);
		String userid = UserDetails.get("User");
		String password = UserDetails.get("password");
		System.out.println("Details:" + userid + "      " + password);
		System.out.println(action);
		if (action.equals("Register")) {
			System.out.println("before registration");
			russtep.Register(userid, password);

		} else{
			System.out.println("before login");
			russtep.Login(userid, password);

		} 

	}
	@And("I perform Logout")
	public void i_perform_Logout() throws InterruptedException {
		System.out.println("before logout");
		russtep.Logout();

	}

	@Then("I successfully registerd")
	public void i_successfully_registerd() throws InterruptedException {

		assertEquals(russtep.registrationsuccess(), true);

	}

	@Then("My Account page should get displayed")
	public void my_account_page_should_get_displayed() throws InterruptedException {

		assertEquals(russtep.loginsuccess(), true);

	}
}

package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("user logged in with valid admin credentials")
	public void user_logged_in_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("admin is successfully logged in")
	public void user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome text is not displayed correctly", expected, actual);
		System.out.println(actual);
	}
 
	@When("user enters valid ess username and password")
	public void user_enters_valid_ess_username_and_password() {
		sendText(login.username, "Kaleb");
		sendText(login.password, "iphoneCase703a!");
	}

	@When("user will click on login button")
	public void user__will_click_on_login_button() {
		click(login.loginBtn);
	}

	@Then("ess user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected = "Welcome Abdallah";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct", expected, actual);
		System.out.println(actual);
	}
	@When("the user enters valid username and invalid password")
	public void the_user_enters_valid_username_and_invalid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax123.....!");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		click(login.loginBtn);
	}

	@Then("User sees Invalid Credentials text on the page")
	public void user_sees_Invalid_Credentials_text_on_the_page() {
		String expected = "Invalid credentials";
		String actual = login.errorMsg.getText();
		Assert.assertEquals(" error message is displayed or not correct", actual, expected);
		System.out.println(actual);

	}

}

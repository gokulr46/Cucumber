package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	
	@Given("user launches the browser and launches facebook application")
	public void user_launches_the_browser_and_launches_facebook_application() {
        Hooks.driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password and User clicks login button")
	public void user_enter_username_and_password_and_User_clicks_login_button() {
		Hooks.driver.findElement(By.id("email")).sendKeys("Gokul");
		Hooks.driver.findElement(By.id("pass")).sendKeys("12345");
		Hooks.driver.findElement(By.id("loginbutton")).click();
	}


	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
		System.out.println("Login successful");

	}
	
	@Given("User click the notification")
	public void user_click_the_notification() {
		System.out.println("User click the notification");

	}

	@When("user navigate to notification page")
	public void user_navigate_to_notification_page() {
		System.out.println("user navigate to notification page");

	}

	@Then("user check recent notification")
	public void user_check_recent_notification() {
		System.out.println("user check recent notification");

	}

	@Given("User click the setting")
	public void user_click_the_setting() {
		System.out.println("User click the setting");

	}

	@When("user navigate to setting page")
	public void user_navigate_to_setting_page() {
		System.out.println("user navigate to setting page");

	}

	@Then("user change the setting")
	public void user_change_the_setting() {

	}



}

package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonOrderStepDefinition {
	
	@Given("^a registered user exists$")
	public void a_registered_user_exists() {
		System.out.println("Registered user");
	    
	}
	@Given("^user is on the Amazon login page$")
	public void user_is_on_the_amazon_login_page() {
	    
	}
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    
	}
	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    
	}
	@Then("user is on the account home page")
	public void user_is_on_the_account_home_page() {
	    
	}
	@Then("user navigates to the order page")
	public void user_navigates_to_the_order_page() {
	   
	}
	@When("user clicks on the previuos order link")
	public void user_clicks_on_the_previuos_order_link() {
	  
	}
	@Then("user checks the previous order details")
	public void user_checks_the_previous_order_details() {
	    
	}
	@When("user clicks on the open order link")
	public void user_clicks_on_the_open_order_link() {
	   
	}
	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
		System.out.println("Open orders");
	}
	@When("user clicks on the cancelled order link")
	public void user_clicks_on_the_cancelled_order_link() {
	    
	}
	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
		System.out.println("Cancel order details");
	}
	

}

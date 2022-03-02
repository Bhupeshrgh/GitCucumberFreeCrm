Feature: Amazon order page
	to check order details 
	as a registered user 
	I want to specify the order details page

Background:
Given a registered user exists
Given user is on the Amazon login page
Then user enters username and password
Then user clicks on the login button
And user is on the account home page
And user navigates to the order page	
	
@Smoke @Sprint1 @Regression		
Scenario: Check previous orders
When user clicks on the previuos order link
Then user checks the previous order details

@Regression @Smoke @Skip
Scenario: check open order details
When user clicks on the open order link
Then user checks the open order details

@Smoke 
Scenario: check cancelled order details
When user clicks on the cancelled order link
Then user checks the cancelled order details
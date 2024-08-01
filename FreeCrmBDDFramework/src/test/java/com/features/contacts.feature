Feature: Free Crm contacts creation Feature

Scenario Outline: FreeCrm contacts creation Testing Scenario

Given user is present on the home page after loggedin
When user is on the first page
Then user clicks on login option
Then user enters "<Email>" and "<Password>"
Then user clicks on login button
Then user is on the home page
Then close the browser

Examples:
	| Email | Password |
	| bhupeshrgh@gmail.com | Bhupesh@123 |
	| bhupesh@gmail.com | Bhupesh@ | 
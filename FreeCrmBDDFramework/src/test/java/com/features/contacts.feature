Feature: Free Crm contacts creation Feature

Scenario Outline: FreeCrm new contacts creation Test Scenario

Given user is present on the first page of the website
When user clicks on the login option 
Then user enters "<emailid>" and "<password>"       //should not have same words in any statement
Then user clicks on login button
Then user is on the home page
Then user mouse hover on the contacts 
Then user clicks on the add button
Then user enters contact details "<firstname>" and "<lastname>" and "<company>"
Then user clicks on save button
Then close the browser

Examples:
	| emailid | password | firstname | lastname | company |
	| bhupeshrgh@gmail.com | Bhupesh@123 |
	| bhupesh@gmail.com | Bhupesh@ | 
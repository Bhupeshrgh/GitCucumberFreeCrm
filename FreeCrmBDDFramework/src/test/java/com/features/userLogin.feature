Feature: FreeCrm login Feature

#Without Examples keyword
#Scenario: FreeCrm login functionality Testing Scenario
#
#Given user is present on the first page of the website
#When title on the first page is Free CRM
#Then user clicks on login option
#Then user enters Email and Password
#Then user clicks on login button
#Then user is on the home page


#With Examples keyword
Scenario Outline: FreeCrm login functionality Testing Scenario

Given user is present on the first page of the website
When title on the first page is Free CRM
Then user clicks on login option
Then user enters "<Email>" and "<Password>"
Then user clicks on login button
Then user is on the home page
Then close the browser

Examples:
	| Email | Password |
	| bhupeshrgh@gmail.com | Bhupesh@123 |
	| bhupesh@gmail.com | Bhupesh@ |
	






#Scenario: User creating new contact
#Given user is already on the home page
#When user is 


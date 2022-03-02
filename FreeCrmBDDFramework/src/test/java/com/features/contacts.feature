Feature: Free Crm contacts creation Feature

Scenario Outline: FreeCrm new contacts creation Test Scenario

Given user is present on first page of the website
When user clicks on the login option 
Then user enters "<emailid>" and "<password>"            //should not have same words in any statement
And user clicks on login button
Then user is on the home page
And user mouse hover on the contacts 
Then user clicks on the add button
And user enters contact details "<firstname>" and "<lastname>" and "<company>"
And user clicks on save button
Then close the browser

Examples:
	| emailid | password | firstname | lastname | company |
	| bhupeshrgh@gmail.com | Bhupesh@123 | Bhupesh | Gupta | Amazon |
	| bhupesh@gmail.com | Bhupesh@ | Tom | Jerry | Alibaba | 
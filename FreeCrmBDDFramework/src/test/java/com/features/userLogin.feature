Feature: FreeCrm login Feature

Background: Launch url
Given user is present on the first page of the website

#With Examples keyword
@CRMLogin
Scenario Outline: FreeCrm login functionality passed Scenario

When title on the first page is Free CRM
Then user clicks on login option
Then user enters "<Email>" and "<Password>"
Then user clicks on login button
Then user is on the home page
Then close the browser

Examples:
	| Email | Password |
	| bhupeshrgh@gmail.com | Bhupesh@123 |

@CRMLogininvalid
Scenario Outline: FreeCrm login functionality failed Scenario

When title on the first page is Free CRM
Then user clicks on login option
Then user enters "<Email>" and "<Password>"
Then user clicks on login button
Then user is able to see invalid login message
Then close the browser

Examples:
	| Email | Password |
	| bhupesh@gmail.com | Bhupesh@ |	


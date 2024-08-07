Feature: Create new contacts
		and enter all the fields data

Background: Launch url
Given user is present on the first page of the website
Then user clicks on login option
Then user enters "bhupeshrgh@gmail.com" and "Bhupesh@123"
Then user clicks on login button
		
@Contacts
Scenario: Add new contact to the registered user

Given user is on the create new contact page
Then user enters all the following details

| Bhupesh | Gupta | NA | Apple | custom | bhupesh@gmail.com | Personal | crm lead | 9898546758 | Home | gupta | 03 | 1987 | gupta |

Then user clicks on save button

		
		 
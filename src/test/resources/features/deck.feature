@B34G9-115
Feature: Default

	Background:
		#@B34G9-116
		Given user is on the login page
		Given user logged in with username as "user1" and password as "Userpass123"
		

	
	@B34G9-111
	Scenario: Scenario 
			When User click deck module
			And User click hamburger menu
			When User scroll and click on add Board button
			And User see Board input box
		    And User type in board name input "New Board"
			When User click arrow button of the created board
			And "New board" is displayed	

	
	@B34G9-112
	Scenario: Test for Scenario
			When User click on deck module
			And User click hamburger menu
			When User scroll and click on add Board button
			And User see Board input box
			And User type in board name input "New Board"
			When User click arrow button of the created board
			And "New board" is displayed
			And User click on a board name
			And User click on the + button
			When List name input box appaired 
			And User type in to input box "My list"
			When User click arrow button of the list
			Then "My list" appaired	

	
	@B34G9-113
	Scenario: Test for Scenario
		When User click on deck module
		And User click hamburger menu
		When User scroll and click on add Board button
		And User see Board input box
		And User type in board name input "New Board"
		When User click arrow button of the created board
		And "New board" is displayed
		And User click on a board name
		And User click on the + button
		When List name input box appaired
		And User type in to input box "My list"
		When User click arrow button of the list
		Then "My list" appaired
		When User click + button to add card
		And Card name input box appaired
		When User type in card name input box "My card"
		And User click arrow button
		When "My card" is displayed under the "My list"
		Then Card details are displayed  "My card"

	
	@B34G9-114
	Scenario: Test for Scenario
		When User click on deck module
		And User click hamburger menu
		When User scroll and click on add Board button
		And User see Board input box
		And User type in board name input "New Board"
		When User click arrow button of the created board
		And "New board" is displayed
		And User click on a board name
		And User click on the + button
		When List name input box appaired
		And User type in to input box "My list"
		When User click arrow button of the list
		Then "My list" appaired
		When User click + button to add card
		And Card name input box appaired
		When User type in card name input box "My card"
		And User click arrow button
		When "My card" is displayed under the "My list"
		Then Card details are displayed  "My card"
		When User click 3 dots menu 
		And Dropdown menu displayed 
		When User click assign to me
		Then User profile icon should be displayed near three dots icon
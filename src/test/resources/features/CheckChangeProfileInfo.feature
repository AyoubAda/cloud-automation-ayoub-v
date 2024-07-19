@B34G9-168
Feature: Default

	Background:
		#@B34G9-116
		Given user is on the login page
		Given user logged in with username as "Employee2" and password as "Employee123"
		

	
	@B34G9-165
	Scenario: Full name and username should be the same.
		Given user clicks on the profile icon
		  Then user clicks on the settings button
		  And personal info should be displayed
		  And the full name should be the same with the "Employee2"

	
	@B34G9-166
	Scenario: User can enter a proper e-mail to E-mail input box.
		Given user clicks on the profile icon
		  Then user clicks on the settings button
		  And user should be able to enter a proper e-mail to Email input box	

	
	@B34G9-167
	Scenario: User can change Language.
		Given user clicks on the profile icon
		  Then user clicks on the settings button
		  And user clicks on the language dropDownList
		  And user should be able to select a language from the dropDownList
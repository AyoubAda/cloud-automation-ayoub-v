@B34G9-130
Feature: Calender Module Functionality

  Background:
		#@B34G9-116
    Given user is on the login page
    Given user logged in with username as "user1" and password as "Userpass123"


  @B34G9-127
  Scenario: User can display daily calendar view
    Given the user clicks on calender module
    Then the user clicks on the actions button
    Then the user clicks on the daily calender view
    And the user should see the daily calender view displayed


  @B34G9-128
  Scenario: User can display weekly calendar view
    Given the user clicks on calender module
    Then the user clicks on the actions button
    Then the user clicks on the weekly calender view
    And the user should see the weekly calender view displayed


  @B34G9-129
  Scenario: User can display monthly calendar view
    Given the user clicks on calender module
    Then the user clicks on the actions button
    Then the user clicks on the monthly calender view
    And the user should see the monthly calender view displayed


  @B34G9-131
  Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
    Given the user clicks on calender module
    Given user clicks on new event button
    Then user should see event detail icon pops-up having (Event Title,date from-to, All day check box, more&save buttons)
    Then user should be able to fill out the event detail and click on the save button
    And user should see an event created on the related day through the Monthly Calendar view
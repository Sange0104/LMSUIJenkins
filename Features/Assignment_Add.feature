Feature: Add new Assignments

Background: 
Given User is logged on to LMS website
And User clicks on Assignment tab
And User is on Assignment page

   Scenario: validate add new assignment
		When User clicks A New Assignment button
    Then user can see Assignment details form
    
    Scenario: Empty form submission 
 		When User clicks Save button without entering data
    Then User gets message 'Name is required.'
    
    Scenario: Enter Assignment Name
		When user enters Assignment name
    Then User can see 'Name' entered
    
    Scenario: Enter Assignment Description 
		When user enters Assignment description
    Then User can see 'Description' entered
    
    Scenario: Enter assignment grade
		When user enters assignment grade
    Then user can see 'Grade' entered
    
    Scenario: Enter assignment due date 
		When user enters assignment due date
  #  Then user can see "Assignment due date"
    
    Scenario: Click Cancel 
		When User clicks on <Cancel> button
    Then User can see Assignment Details form disappears
    
  	Scenario: Click Save 
		When User clicks the <Save> button
    Then User can see 'Assignment Created' message
        
    Scenario: Validate Search feature
		Then Text box used for search has text as 'Search...'    
    
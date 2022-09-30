Feature: Edit Assignments

Background: 
Given User is on Assignment Details form  

Scenario: Edit Assignment Name
   	When  User edits the Name
    Then User can see the updated Name
   
  Scenario: Edit Assignment Description 
		When User edits Description
    Then User can see updated Description
    
  Scenario: Edit Assignment Grade 
		When User edits Grade
    Then User can see updated Grade
    
  Scenario: Edit Assignment Due Date
		When User edits Due Date
    Then User can see updated Due Date
    
  Scenario: Click Cancel 
		When User clicks <Cancel> button edit
    Then User can see Assignment Details form disappears
    
  Scenario: Click Save 
		When User clicks <Save> button edit
    Then User can see 'Successful Assignment Updated' edit message
    
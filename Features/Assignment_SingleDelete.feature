Feature: Delete Assignments 

Background:

Given User is logged on to LMS website
And When User is on <Module> page
And User clicks on <Delete> button	
And Confirm deletion popup opens

Scenario: Click Yes	 on confirmation pop up

When User clicks <Yes> button	
Then User can see 'Assgigment Deleted' delete message	

Scenario: Click No on confirmation pop up

When User clicks <No> button	
Then User can see Confirm Deletion form disappears	
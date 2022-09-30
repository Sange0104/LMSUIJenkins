Feature: Delete multiple programs

Background:

Given User is logged on to LMS website
And When User is on <Module> page
And User selects more than one checkbox


Scenario: Select multiple assignments	

When User clicks on <Delete> button on top left corner	
Then User lands on Confirm Deletion form 

Scenario: Select Yes on confirmation pop up

When User clicks <Yes> button	
Then User can see 'Successful Programs Deleted' message

Scenario: Select No on confirmation pop up	

When User clicks <No> button	
Then User can see Confirm Deletion form disappears
Feature: Add New Program
Background:

Given User is logged on to LMS website
And User is on Manage Program page
And User clicks <A New Program> button	
And Program Details pop box opens

Scenario: Empty form submission	

When User clicks <Save> button without entering data	
Then User gets warning message 'Name is required.'	

Scenario: Enter Program Details	

When User enters <Name> and <Description> in text box
And User selects <Status> using radiobutton
And User clicks <Save> button
Then User gets success message Successful 'Program Created'	

Scenario: Click Cancel	

When User clicks <Cancel> button	
Then User can see Program Details form disappears 

Scenario: Close button functionality

When User clicks on <X>
Then Pop up box gets closed 

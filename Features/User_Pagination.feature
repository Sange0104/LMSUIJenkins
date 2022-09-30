Feature: Pagination

Background:
Given User is logged on to LMS website
And User is on "User" page

Scenario: Verify Pagination control is disable	
When User is on first page of "Manage User"
And Number of records are less than or equal to 5 	
Then Pagination control is disable

Scenario: Verify Pagination control is enable	
When User is on first page of Manage User
And Number of records are more than 5 	
Then Pagination control is enable

Scenario: Verify previous link on the first page	
When User is on first page of Manage User 	
Then Verify that previous link is disabled

Scenario: Verify next link	
When User is on the page number '1' 	
And User clicks navigate > button	
Then User navigated to page number '2'
	
Scenario: Verify previous link	
When User is on page number '2'	
And User clicks navigate < button	
Then User navigated to page number '1'
	
Scenario: Verify next link on the last page	
When User is on last page of Manage User 	
Then Verify that next link is disabled
Scenario: Verify first page with << icon
When User clicks << icon in pagination
Then User should see the First page of the table
Scenario: Verify last page with >> icon
When User clicks >> icon in pagination
Then User should see the Last page of the table
Feature: Add batch

Background:
Given User is logged on to LMS website
And User is on "Batch" page
And User clicks on "A New Batch" button
And User is on Batch details page pop-up box

Scenario: Empty form submission
When User clicks on "Save" button
Then User gets a message 'Name is required.'

Scenario: Click Cancel
When User clicks on "Cancel" button
Then User can see Batch Details form disappears

Scenario Outline: Verify newly added batch
When User enters "<Batch Name>" in text box "Batch Name" 
And User enters "<Description>" in text box "Description"
And User selects Program name
And User selects "<Status>" using radio button
And User enters "<No of classes>" in text box "No of classes"
And User clicks on "Save" button
Then User gets a message "Batch created"
And Records of the newly created "<Batch Name>" is displayed


Examples:
| Status | Batch Name 		| Description | No of classes |
| Active | Tech Explorer	| Java 		  | 20 |
| Inactive | Tech Explorer2 | Python 	  | 20 |

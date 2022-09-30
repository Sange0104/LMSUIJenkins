Feature: Edit batch

Background:
Given User is logged on to LMS website
And User is on "Batch" page
And User clicks on Edit button
And User is on Batch details page pop-up box

Scenario: Edit Batch Name
When User edits "Name"
And User clicks on "Save" button
Then User can see edited "Name"
And User can see Successful 'batch Updated' alert

Scenario: Edit Batch Description
When User edits "Description"
And User clicks on "Save" button
Then User can see edited "Description"

Scenario: Edit program name
When User edits "Program Name"
And User clicks on "Save" button
Then User can see edited "Program Name"

Scenario: change status
When User edits "Status"
And User clicks on "Save" button
Then User can see edited "Status"

Scenario: Edit No of classes
When User edits "No of classes"
And User clicks on "Save" button
Then User can see edited "No of classes"

Scenario: Verify Batch Details are not updated on Clicking Cancel
When User edits "Name"
And User clicks on "Cancel" button
Then User can see Batch Details are not updated 

Scenario: Verify Edited Batch details
When User edits "Name"
And User clicks on "Save" button
And User searches and verifies the newly updated "Batch Name"
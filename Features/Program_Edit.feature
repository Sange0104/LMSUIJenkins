Feature: Edit Program details

Background:
Given User is logged on to LMS website
And User is on Manage Program page
And User clicks on <Edit> button
And Program Details pop box opens


Scenario: Edit Program name

When User edits Name
And  selects the Save button
Then User can see updated Name

Scenario: Edit Program description

When User edits Program description 
And selects the Save button
Then User can see updated description


#Scenario: Change Program status
#
#When User changes status 
#And selects the Save button
#Then User can see updated Status

Scenario: Click Cancel


When User clicks <Cancel> button
Then User can see Program Details form disappears 

Scenario: Click Save

When User clicks <Save> button
Then User can see the Successful 'Program Updated' message
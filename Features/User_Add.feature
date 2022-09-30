Feature: Add User

Background:
Given User is logged on to LMS website
And User is on "User" page
And User clicks on add new user button
And User Details frame pop up


Scenario Outline: Verify newly added User
When User enters First Name as "<First Name>" and Last Name as "<Last Name>" and Email as "<Email>" and Phone number as "<Phno>" and Email as "<Email>" and Batch as "<Batch>" and Skill as "<Skill>" and Username as "<Username>" and Password as "Password"
And The user clicks on "Save" button
Then Message displayed : "User created"


Examples:
| FistName  | LastName | Email | Phno | Batch | Skill | Username | Password |
| John |  Smith 		| John_Smith22@gmail.com | 1234787877 | SDET45 | Java | Jsk2121 |  learnjava |

Scenario: Empty form submission
When User clicks on Submit button
Then User gets message "Enter Valid Data"

Scenario: Click Cancel
When The user Clicks on Cancel button
Then User can see User Details form disappears
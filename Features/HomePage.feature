Feature: Homepage Menubar Button 

  Background: 
  Given User is logged on to LMS website

      
  Scenario: Verify that the title of the Home page is "LMS"
  Then User should see a title with text "LMS" on the Home page
    
   Scenario: Validating all buttons on header displayed on menu bar
    Then All the tabs present are displayed   
    
  Scenario: Verifying the Program button
  When User clicks on "Program" button on the menu bar
  Then User should land on "Program" page

  Scenario: Verifying the Batch button 
  When User clicks on "Batch" button on the menu bar
  Then User should land on "Batch" page
  
  Scenario: Verifying the User button 
  When User clicks on "User" button on the menu bar
  Then User should land on "User" page
  
  Scenario: Verifying the Assignment button 
  When User clicks on "Assignment" button on the menu bar
  Then User should land on "Assignment" page
  
  Scenario: Verifying the Attendance button
  When User clicks on "Attendance" button on the menu bar
 Then User should land on "Attendance" page
  
  Scenario: Verifying the Logout button 
  When User clicks on "Logout" button on the menu bar
  Then User should land on "HomePage" page
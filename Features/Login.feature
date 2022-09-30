 Feature: LoginPage
 
 
  Scenario: Validating the url
    Given User is on the browser
    When User opens the LMS Website
    Then User should see the Login page
    
  Scenario Outline: Successful login
    Given User is on the login page
    When User enters "<username>" and "<password>"
    And User clicks on Login button
    Then User lands on Home page

    Examples: 
      | username  | password |
      | lms |     lms |
      
  Scenario Outline: Validating the Login functionality with invalid password field
    Given User is on the login page
    When User enters "<username>" and "<password>"
    And User clicks on Login button
    Then User should receive the message "<message>"
    
     Examples: 
      | username  | password  | message               |
      |          |         |  Invalid username and password Please try again|
      | lms 22    |     lms   |  Invalid username and password Please try again|
      | lms     |     lms767   |  Invalid username and password Please try again|
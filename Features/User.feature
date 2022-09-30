Feature: Manage User feature validation

Background:
Given User is logged on to LMS website
And User is on "User" page

Scenario: Validating the Manage User mandatory fields
    Then User should see all mandatory fields
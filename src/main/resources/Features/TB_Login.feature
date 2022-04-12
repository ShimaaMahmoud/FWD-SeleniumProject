Feature: Logining
  @smoke


  Scenario: user could login with valid email and password
  When there is registered user
Given user go to login page
  And user login with valid user and password
And user press on login button
Then user login to the system successfully
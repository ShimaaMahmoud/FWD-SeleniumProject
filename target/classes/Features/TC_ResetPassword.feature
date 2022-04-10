Feature: Reset Password
@c
  Scenario: user can reset password


  Given there is registered user
    Given user go to reset password page
    When  user enter valid mail
    Then user can reset password sucsessfully

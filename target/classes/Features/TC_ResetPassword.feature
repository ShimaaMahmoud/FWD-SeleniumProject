Feature: Reset Password
  @smoke
  Scenario: user can reset password



    Given user go to reset password page
    When  user enter valid mail
    Then user can reset password sucsessfully

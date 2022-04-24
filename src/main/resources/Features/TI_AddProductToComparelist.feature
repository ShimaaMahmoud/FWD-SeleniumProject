Feature: Logged user could add different products to comparelist
  @smoke

  Scenario: Add product to comparelist

    Given  there is logged in user
    Given  user select specific category
    When  user click on Add to comparelist
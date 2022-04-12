Feature: Select specific category
  @smoke
  Scenario: User can Select different category

    Given  there is logged in user
    When  user select specific category
    Then  user find  the relative results
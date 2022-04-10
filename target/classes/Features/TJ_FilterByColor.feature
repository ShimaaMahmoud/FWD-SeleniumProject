Feature: filter by color

  Scenario: User can filter by color

    Given  there is logged in user
    Given  user select specific category
    When user select specific color
    Then element is checked
Feature: Logged user could create successful order
  @smoke
  Scenario: create successful order

    Given  there is logged in user
    Given  user select specific category
    When   user click on Add to cart
    And    user check shopping cart
    Then   order is created sucsessfully
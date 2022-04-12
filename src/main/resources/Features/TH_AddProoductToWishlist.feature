
Feature: Logged user could add different products to wishlist
  @smoke
  Scenario: Add product to wishlist

    Given  there is logged in user
    Given  user select specific category
    When user click on Add to wishlist
    Then product added sucsessfully to wishlist
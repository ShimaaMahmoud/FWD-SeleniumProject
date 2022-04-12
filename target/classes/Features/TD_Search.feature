
Feature: Search for any product
  @smoke
  Scenario: User can Search for product using sku

    And   user navigate to home page
    When  user search on specific product
    Then  user find relative results


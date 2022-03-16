Feature: Search for any product

  Scenario: User can Search for product using sku

    And   user navigate to home page
    When  user search on specific product
    Then  user find relative results


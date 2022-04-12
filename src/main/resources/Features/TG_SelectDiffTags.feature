Feature: Select specific category
  @smoke
  Scenario: User can Select different category


    Given  user navigate to tags page
    When    user select appearal tags
    Then    user get results related to appearal
    When   user select book tag
    Then    user get results related to books

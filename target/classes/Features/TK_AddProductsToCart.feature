 Feature: Logged user could add different products to Shopping cart
@c
Scenario: Add product to cart

Given  there is logged in user
Given  user select specific category
  When user click on Add to cart
  Then product added sucsessfully to cart




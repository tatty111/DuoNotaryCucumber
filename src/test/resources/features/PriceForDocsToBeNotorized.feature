
Feature: Verify the HomePage functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage

  @4price
  Scenario: Verify the Order info Section (Schedule -> Order info->  num of docs to be notarized=price)
    When The user is able to click on Schedule link
    Then The user can clicks on plus button to get 1 quantity of a document
    And The price of the product should be $30.00



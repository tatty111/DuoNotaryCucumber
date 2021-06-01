Feature: Verify the HomePage functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage

  @temp
  Scenario: Verify the Order info Section (Schedule -> Order info->  num of docs to be notarized=price)
    When The user is able to click on Schedule link
    Then The user can clicks on plus button to get 1 quantity of a document
    And The price of the product should be $30.00

  Scenario:  Validate the price of a document

    When The user clicks on a product "Printed Chiffon Dress"
    Then The user should be taken to product details page with title "Printed Chiffon Dress"
    And The price of the product should be 16.40
    And The default quantity should be 2

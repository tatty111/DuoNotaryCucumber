@1taniaTRAVELLING
Feature: Verify the Travelling Notarization page functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage



  Scenario: Verify the TRAVELLING NOTARIZATION
    When The user navigates and clicking on TRAVELLING NOTARIZATION window
    Then The user should see text "Location for an appointment"
    And The user can fill the "address" and click on next button
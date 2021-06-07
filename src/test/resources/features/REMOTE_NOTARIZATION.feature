
Feature: Verify the HomePage functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage
    When The user navigates and clicking on REMOTE NOTARIZATION window

  @2REMOTERemote
  Scenario: Verify the REMOTE NOTARIZATION -> Schedule Page
    Then The user should land on Schedule online notary services page

  @2REMOTENow
  Scenario: Verify the REMOTE NOTARIZATION -> Now Page
    Then The user should land on Now online notary services page








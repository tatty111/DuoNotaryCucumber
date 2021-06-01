Feature: Verify the HomePage functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage

@apple
  Scenario: Verify the Order info Section (Schedule -> Order info)
    When The user is able to click on Schedule link
    Then The user should be able to fill the Order info section and move to next section


  Scenario: Verify the Data / Time Section
    Then The user should be able to fill the Order info section and move to next section









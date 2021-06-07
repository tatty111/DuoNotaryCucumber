
Feature: Verify the HomePage functions

# executed before each scenario
  Background: Common step
    Given The user is on the homepage

  @3Schedule
  Scenario: Verify the Order info Section (Schedule -> Order info)
    When The user is able to click on Schedule link
    Then The user should be able to fill the Order info section and move to next section

  @3Data
  Scenario: Verify the Data and Time Section
    When The user is able to click on Schedule link
    Then The user should be able to fill the Order info section and move to next section
    Then Verify the Data and Time Section Day "1"
    Then Verify User info section using Faker class









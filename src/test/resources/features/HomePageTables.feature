Feature: Verify the HomePage tables


  Scenario: Verify product names
    Given The user is on the homepage
    Then The following products should be displayed
      | Online Notary         |
      | Real Estate/Refinance |
      | Apostille Services    |
      | Embassy legalization  |
      | I-9 Verification      |
      | Traveling notary      |
    And The page title should be "DuoNotary | Notarize documents online or in-person at your convenient time and location"



  Scenario: Verify product names WebelementsWhychooseDuoNotary
    Given The user is on the homepage
    Then The following products should be displayed as
      | All notary services (domestic & international) |
      | Legal services at your door                    |
      | Same day services                              |
      | Affordable prices                              |
    And The page should contain text "Why choose DuoNotary"


  @scenario
  Scenario Outline: Verify product names outline
    Given The user is on the homepage
    When The user clicks on "<link>"
    Then The link contain the relavent text of the "<link>"
    Examples:
      | link                  |
      | Online Notary         |
      | Real Estate/Refinance |
      | Apostille Services    |
      | Embassy legalization  |
      | I-9 Verification      |
      | Traveling notary      |



  Scenario: Verify product that have been placed into the user's account - Main page - Upcoming
    Given The precondition is satisfied
    When The action is done
    Then The result should contain this information as
      | Agents            | Date, time of order  | Order number |
      | Sirojiddin Saidov | 26-May, 2021 8:00 AM | 51310121     |
      | TestAgent Agentov | 26-May, 2021 1:51 PM | 41318161     |



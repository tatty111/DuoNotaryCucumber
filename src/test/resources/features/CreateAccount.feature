#DAY 83. WEDNESDAY. 05/19/2021. CUCUMBER. APACHI PO..
Feature: Verify the creation of an account


#  Background:
#    When The user navigates and clicking on menu button -> to be trasnfered to SING IN page
#    Then The user should click on creation of an account button


  Scenario: Verify creation of an account
#    When The user navigates and clicking on menu button -> to be trasnfered to SING IN page
#    Then The user should click on creation of an account button
    Then The user should fill his data info and click sign in button
    And The Congradulation msg should apear "Congratulations! Your registration is almost complete, please verify your email by clicking the link we emailed you."



  Scenario: Verify user registration using datatable
    Then The user should pass following info and click sign in button
      | first_name | last_name | email address  | phone        | password   | repassword |
      | Lemmy      | Innocenti | fgfg@gmail.com | 515-225-0199 | Tampa1234  | Tampa1234  |
    And The Congradulation msg should apear "Congratulations! Your registration is almost complete, please verify your email by clicking the link we emailed you."






  Scenario Outline: Verify user registration using Outline datatable
    Then The user should pass following info and click sign in button
      | first_name | last_name | email address  | phone        | password   | repassword |
      | <first_name>      | <last_name> | <email address> | <phone> | <password>  | <repassword>  |

    And The Congradulation msg should apear "Congratulations! Your registration is almost complete, please verify your email by clicking the link we emailed you."

    Examples:
      | first_name | last_name | email address     | phone        | password    | repassword  |
      | Lemmy      | Innocenti | fgfg@gmail.com    | 515-225-0199 | Tampa1234   | Tampa1234   |
      | Yummy      | Zunami    | zummifg@gmail.com | 202-225-0199 | Pampa1234   | Pampa1234   |
      | Tommy      | Durdomi   | mumu@gmail.com    | 303-005-0199 | Durdomi1234 | Durdomi1234 |
      | Lolla      | Perdola   | bubufg@gmail.com  | 333-225-0199 | OOmpa1234   | OOmpa1234   |
      | Tommy      | Durdomi   | kuku@gmail.com    | 660-005-0199 | GGrdomi1234 | GGrdomi1234 |


#    //DAY 83. WEDNESDAY. 05/19/2021. CUCUMBER. APACHI PO..
  @current
  Scenario: Verify user registration using external excel file
    And The user passes the information and the name should be correct




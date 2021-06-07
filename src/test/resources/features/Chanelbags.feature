@9Bagstables
Feature: Verify the Bags tables


    #    //DAY 84. FRIDAY. 05/21/2021 - Parallel execution
    Scenario: Verify Product details using external Excel file
    Given The user is on chanel page
    Then The product details should match the info in an excel file "testData.xlsx" and sheet "Sheet1"

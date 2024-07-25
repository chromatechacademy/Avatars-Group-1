Feature: Ability to add and remove expense heads

  @Regression @Antony2 @AG1CP-26
    Scenario: Ability to add and remove expense heads
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And the user clicks on the Expenses Module
    And the user clicks on Expense Head
    And the user is on the Expense Head page
    And the user enters "Bill" in the expense head field
    And the user clicks on the Save button
    Then the expense added displays as expected
    And the user clicks on the x button to delete
    Then clicks OK on the alert message
Feature: AG1CP-2: Security mechanism to prevent invalid credentials login

  @Regression @AG1CP-2 @Hasnaa @SecurityMechanismToPreventInvalidCredentialsLogin
  Scenario: Security mechanism to prevent invalid credentials login
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "hasnaa@teacher.com" in username text box
    When the user enters password "202030" in password text box
    And clicks on Sign In button
    Then the user remains on the login page "https://mexil.it/chroma/site/login"
    Then an error message is displayed "Invalid Username or Password"
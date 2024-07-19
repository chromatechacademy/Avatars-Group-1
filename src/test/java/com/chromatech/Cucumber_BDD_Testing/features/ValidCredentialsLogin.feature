Feature: Valid Credentials Login

@Regression @Hasnaa @AG1CP-1 @Progression
  Scenario: Valid Credentials Login
  Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
  When the user enters username "general@teacher.com" in username text box
  When the user enters password "123456" in password text box
  And clicks on Sign In button
  Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"


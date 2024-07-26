Feature: Class and Section

  @Regression @Antony @AG1CP-11
    Scenario: Class and Section
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    Given a Chroma Tech user is on the dashboard page
    When the user navigates to the Class submodule
    Then there are two classes, SDET and Cyber Security displayed with the following sections:
    | Class           | Section
    | Cyber Security  | Penetration Testing/Ethical Hacking, Database Testing, SDLC Methodologies, Selenium Test Automation, API Testing, Git/GitHub, Java 11 for Cool People, Mobile Test Automation, Accessibly Testing, Networking Fundamentals, Linux Fundamentals, CIA Triad
    | SDET            | Cucumber Fundamentals
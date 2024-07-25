Feature: AG1CP-17: AcademicModuleSections

  @Regression @Dm @AG1CP-17
  Scenario: In Academic Module shoes next Submodule - Sections And adds a section
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    Given a Chroma Tech faculty member clicks the "Academics" module
    When the user navigates to the "Sections" submodule
    And adds a section
    And the section is added
    And the user can also delete the section
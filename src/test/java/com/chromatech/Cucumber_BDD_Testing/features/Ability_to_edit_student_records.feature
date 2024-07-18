Feature: Ability to edit student records

  @Regression @Antony @AG1CP-14
  Scenario: Ability to edit student records
    Given a CTSMS user opens a student record
    When making and saving changes to the student information
    Then the student information is successfully saved

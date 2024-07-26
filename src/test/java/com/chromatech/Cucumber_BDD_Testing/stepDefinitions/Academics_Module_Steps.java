package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Academics_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user navigates to the Academics Module")
    public void the_user_navigates_to_the_academics_module() {
        CommonMethods.click(dashboardPage.academicsModule);
    }
    @Then("the Class Timetable {string} submodule is displayed")
    public void the_class_timetable_submodule_is_displayed(String expectedClassTimetable) {
        CommonMethods.assertTrue(dashboardPage.classTimetableSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.classTimetableSubModule.getText(), expectedClassTimetable);
    }
    @Then("the Teachers Timetable {string} submodule is displayed")
    public void the_teachers_timetable_submodule_is_displayed(String expectedTeachersTimetable) {
        CommonMethods.assertTrue(dashboardPage.teachersTimetableSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.teachersTimetableSubModule.getText(), expectedTeachersTimetable);
    }
    @Then("the Assign Class Teacher {string} submodule is displayed")
    public void the_assign_class_teacher_submodule_is_displayed(String expectedAssignClassTeacher) {
       CommonMethods.assertTrue(dashboardPage.assignClassTeacherSubModule.isDisplayed());
       CommonMethods.assertEquals(dashboardPage.assignClassTeacherSubModule.getText(), expectedAssignClassTeacher);
    }
    @Then("the Promote Students {string} submodule is displayed")
    public void the_promote_students_submodule_is_displayed(String expectedPromoteStudents) {
       CommonMethods.assertTrue(dashboardPage.promoteStudentsSubModule.isDisplayed());
       CommonMethods.assertEquals(dashboardPage.promoteStudentsSubModule.getText(), expectedPromoteStudents);
    }
    @Then("the Subject Group {string} submodule is displayed")
    public void the_subject_group_submodule_is_displayed(String expectedSubjectGroup) {
       CommonMethods.assertTrue(dashboardPage.subjectGroupSubModule.isDisplayed());
       CommonMethods.assertEquals(dashboardPage.subjectGroupSubModule.getText(), expectedSubjectGroup);
    }
    @Then("the Subjects {string} submodule is displayed")
    public void the_subjects_submodule_is_displayed(String expectedSubjects) {
        CommonMethods.assertTrue(dashboardPage.subjectsSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.subjectsSubModule.getText(), expectedSubjects);
    }
    @Then("the Class {string} submodule is displayed")
    public void the_class_submodule_is_displayed(String expectedClass) {
       CommonMethods.assertTrue(dashboardPage.classSubModule.isDisplayed());
       CommonMethods.assertEquals(dashboardPage.classSubModule.getText(), expectedClass);
    }
    @Then("the Sections {string} submodule is displayed")
    public void the_sections_submodule_is_displayed(String expectedSections) {
      CommonMethods.assertTrue(dashboardPage.sectionsSubModule.isDisplayed());
      CommonMethods.assertEquals(dashboardPage.sectionsSubModule.getText(), expectedSections);
    }

}

package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Information_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on Student Information module")
    public void the_user_clicks_on_student_information_module() {
        CommonMethods.assertTrue(dashboardPage.studentInformationModule.isDisplayed());
        CommonMethods.click(dashboardPage.studentInformationModule);
    }

    @Then("the first submodule {string} is displayed")
    public void the_first_submodule_is_displayed(String studentDetails) {
        CommonMethods.assertTrue(dashboardPage.studentDetailsSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentDetailsSubModule.getText(), studentDetails);
    }

    @And("the second submodule is displayed {string}")
    public void the_second_student_admission_submodule_is_displayed(String studentAdmission) {
        CommonMethods.assertTrue(dashboardPage.studentAdmissionSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentAdmissionSubModule.getText(), studentAdmission);
    }

    @And("the third submodule displays {string}")
    public void the_third_submodule_displays(String disabledStudents) {
        CommonMethods.assertTrue(dashboardPage.disabledStudentsSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.disabledStudentsSubModule.getText(), disabledStudents);
    }

    @And("the fourth submodule {string} is displayed")
    public void the_fourth_submodule_is_displayed(String bulkDelete) {
        CommonMethods.assertTrue(dashboardPage.bulkDeleteSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.bulkDeleteSubModule.getText(), bulkDelete);
    }

    @And("the fifth submodule {string} displays")
    public void the_fifth_submodule_is_displays(String studentCategories) {
        CommonMethods.assertTrue(dashboardPage.studentCategoriesSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentCategoriesSubModule.getText(), studentCategories);
    }

    @And("the sixth submodule {string} is displayed")
    public void the_sixth_submodule_is_displayed(String studentHouse) {
        CommonMethods.assertTrue(dashboardPage.studentHouseSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentHouseSubModule.getText(), studentHouse);
    }

    @And("the last submodule {string} is displayed")
    public void the_last_submodule_is_displayed(String disableReason) {
        CommonMethods.assertTrue(dashboardPage.disableReasonSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.disableReasonSubModule.getText(), disableReason);
    }
}
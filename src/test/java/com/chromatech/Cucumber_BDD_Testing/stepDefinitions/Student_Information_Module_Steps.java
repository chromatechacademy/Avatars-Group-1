package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Information_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on {string} module")
    public void the_user_clicks_on_module(String expectedStudentInformationModuleText) {
        CommonMethods.assertTrue(dashboardPage.studentInformationModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentInformationModule.getText(), expectedStudentInformationModuleText);
        CommonMethods.click(dashboardPage.studentInformationModule);
    }

    @Then("the first submodule {string} is displayed")
    public void the_first_submodule_is_displayed(String expectedStudentDetailsText) {
        CommonMethods.assertTrue(dashboardPage.studentDetailsSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentDetailsSubModule.getText(), expectedStudentDetailsText);
    }

    @And("the second submodule is displayed {string}")
    public void the_second_student_admission_submodule_is_displayed(String expectedStudentAdmissionText) {
        CommonMethods.assertTrue(dashboardPage.studentAdmissionSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentAdmissionSubModule.getText(), expectedStudentAdmissionText);
    }

    @And("the third submodule displays {string}")
    public void the_third_submodule_displays(String expectedDisabledStudentsText) {
        CommonMethods.assertTrue(dashboardPage.disabledStudentsSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.disabledStudentsSubModule.getText(), expectedDisabledStudentsText);
    }

    @And("the fourth submodule {string} is displayed")
    public void the_fourth_submodule_is_displayed(String expectedBulkDeleteText) {
        CommonMethods.assertTrue(dashboardPage.bulkDeleteSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.bulkDeleteSubModule.getText(), expectedBulkDeleteText);
    }

    @And("the fifth submodule {string} displays")
    public void the_fifth_submodule_is_displays(String expectedStudentCategoriesText) {
        CommonMethods.assertTrue(dashboardPage.studentCategoriesSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentCategoriesSubModule.getText(), expectedStudentCategoriesText);
    }

    @And("the sixth submodule {string} is displayed")
    public void the_sixth_submodule_is_displayed(String expectedStudentHouseText) {
        CommonMethods.assertTrue(dashboardPage.studentHouseSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentHouseSubModule.getText(), expectedStudentHouseText);
    }

    @And("the last submodule {string} is displayed")
    public void the_last_submodule_is_displayed(String expectedDisableReasonText) {
        CommonMethods.assertTrue(dashboardPage.disableReasonSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.disableReasonSubModule.getText(), expectedDisableReasonText);
    }
<<<<<<< HEAD

    public static class Ability_to_edit_student_records_steps {
    }
}
=======
}
>>>>>>> 694cc312f526189e1ccfdf79122f337c6a54918a

package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class VerifyingStudentData_Steps {

    @When("the user navigates to the detailed {string} student information page {string}")
    public void the_user_navigates_to_the_detailed_student_information_page(String adminssionNumber, String url) {
        StepsImplementation.the_user_navigates_to_the_detailed_student_information_page(adminssionNumber, url);
    }

    @When("verifies the information in the student name block:")
    public void verifies_the_information_in_the_student_name_block(DataTable dataTable) {
        StepsImplementation.verifies_the_information_in_the_student_name_block(dataTable);
    }

    @When("if the {string} block is displayed, verifies the data from that block:")
    public void if_the_block_is_displayed_verifies_the_data_from_that_block(String expectedSiblingBlockName, DataTable dataTable) {
        StepsImplementation.if_the_block_is_displayed_verifies_the_data_from_that_block(expectedSiblingBlockName, dataTable);
    }

    @When("checks the data from the first block under the {string} tab:")
    public void checks_the_data_from_the_first_block_under_the_tab(String expectedText, DataTable dataTable) {
        StepsImplementation.checks_the_data_from_the_first_block_under_the_tab(expectedText, dataTable);
    }

    @When("checks the data from the seconds block {string}:")
    public void checks_the_data_from_the_seconds_block(String expectedHeaderText, DataTable dataTable) {
        StepsImplementation.checks_the_data_from_the_seconds_block(expectedHeaderText, dataTable);
    }

    @When("checks the data from the third block {string}:")
    public void checks_the_data_from_the_third_block(String expectedHeaderText, DataTable dataTable) {
        StepsImplementation.checks_the_data_from_the_third_block(expectedHeaderText, dataTable);
    }

    @When("checks the data from the fourth block {string}:")
    public void checks_the_data_from_the_fourth_block(String expectedHeaderText, DataTable dataTable) {
        StepsImplementation.checks_the_data_from_the_fourth_block(expectedHeaderText, dataTable);
    }
}
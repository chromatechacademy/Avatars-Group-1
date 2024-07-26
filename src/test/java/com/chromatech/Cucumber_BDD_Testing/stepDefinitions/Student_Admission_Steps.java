package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Admission_Steps {

    StepsImplementation stepsImplementation = new StepsImplementation();

    @Given("a CTSMS user is logged in to the main page {string}")
    public void a_ctsms_user_is_logged_in_to_the_main_page(String url) {
        stepsImplementation.a_ctsms_user_is_logged_in_to_the_main_page(url);
    }

    @When("if a student record already exists, the user deletes it:")
    public void if_a_student_record_already_exists_the_user_deletes_it(DataTable dataTable) {
        stepsImplementation.if_a_student_record_already_exists_the_user_deletes_it(dataTable);
    }

    @When("user goes to the {string} page:")
    public void user_goes_to_the_page(String pageName, DataTable dataTable) {
        stepsImplementation.user_goes_to_the_page(pageName, dataTable);
    }

    @When("user fills the first row:")
    public void user_fills_the_first_row(DataTable dataTable) {
        stepsImplementation.user_fills_the_first_row(dataTable);
    }

    @When("user fills the second row:")
    public void user_fills_the_second_row(DataTable dataTable) {
        stepsImplementation.user_fills_the_second_row(dataTable);
    }

    @When("user fills the third row:")
    public void user_fills_the_third_row(DataTable dataTable) {
        stepsImplementation.user_fills_the_third_row(dataTable);
    }

    @When("user fills the fourth row:")
    public void user_fills_the_fourth_row(DataTable dataTable) {
        stepsImplementation.user_fills_the_fourth_row(dataTable);
    }

    @When("user fills the fifth row:")
    public void user_fills_the_fifth_row(DataTable dataTable) {
        stepsImplementation.user_fills_the_fifth_row(dataTable);
    }

    @When("user adds a sibling using the {string} button:")
    public void user_adds_a_sibling_using_the_button(String text, DataTable dataTable) {
        stepsImplementation.user_adds_a_sibling_using_the_button(text, dataTable);
    }

    @When("user adds father's information:")
    public void user_adds_father_s_information(DataTable dataTable) {
        stepsImplementation.user_adds_father_s_information(dataTable);
    }

    @When("user adds mothers's information:")
    public void user_adds_mothers_s_information(DataTable dataTable) {
        stepsImplementation.user_adds_mothers_s_information(dataTable);
    }

    @When("user selects {string} in If Guardian Is radiobuttons")
    public void user_selects_in_the_if_guardian_is_radiobuttons(String value) {
        stepsImplementation.user_selects_in_the_if_guardian_is_radiobuttons(value);
    }

    @When("user adds the first row of guardian's information:")
    public void user_adds_the_first_row_of_guardian_s_information(DataTable dataTable) {
        stepsImplementation.user_adds_the_first_row_of_guardian_s_information(dataTable);
    }

    @When("user adds the second row of guardian's information:")
    public void user_adds_the_second_row_of_guardian_s_information(DataTable dataTable) {
        stepsImplementation.user_adds_the_second_row_of_guardian_s_information(dataTable);
    }

    @When("user adds information in the {string} block:")
    public void user_adds_information_in_the_block(String headerText, DataTable dataTable) {
        stepsImplementation.user_adds_information_in_the_block(headerText, dataTable);
    }

    @When("user adds information in the first row of the {string} section:")
    public void user_adds_information_in_the_first_row_of_the_section(String headerText, DataTable dataTable) {
        stepsImplementation.user_adds_information_in_the_first_row_of_the_section(headerText, dataTable);
    }

    @When("user adds information in the second row of the {string} section:")
    public void user_adds_information_in_the_second_row_of_the_section(String headerText, DataTable dataTable) {
        stepsImplementation.user_adds_information_in_the_second_row_of_the_section(headerText, dataTable);
    }

    @When("user adds information in the third row of the {string} section:")
    public void user_adds_information_in_the_third_row_of_the_section(String headerText, DataTable dataTable) {
        stepsImplementation.user_adds_information_in_the_third_row_of_the_section(headerText, dataTable);
    }

    @When("fills out all text fields and uploads files in the {string} section:")
    public void fills_out_all_text_fields_and_uploads_files_in_the_section(String sectionName, DataTable dataTable) {
        stepsImplementation.fills_out_all_text_fields_and_uploads_files_in_the_section(sectionName, dataTable);
    }

    @When("saves submission")
    public void saves_submission() {
        stepsImplementation.saves_submission();
    }

    @When("user is searching for a student record based on parameters:")
    public void user_is_searching_for_a_student_record_based_on_parameters(DataTable dataTable) {
        stepsImplementation.user_is_searching_for_a_student_record_based_on_parameters(dataTable);
    }

    @Then("make sure the entry {string} is in the list:")
    public void make_sure_the_entry_is_in_the_list(String admissionNumber, DataTable dataTable) {
        stepsImplementation.make_sure_the_entry_is_in_the_list(admissionNumber, dataTable);
    }
}
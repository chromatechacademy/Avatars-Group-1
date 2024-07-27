package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Admission_Steps extends PageInitializer {

    @Given("a CTSMS user is logged in to the main page {string}")
    public void a_ctsms_user_is_logged_in_to_the_main_page(String url) {
        StepsImplementation.a_ctsms_user_is_logged_in_to_the_main_page(url);
    }

    @When("if a student record already exists, the user deletes it:")
    public void if_a_student_record_already_exists_the_user_deletes_it(DataTable dataTable) {
        StepsImplementation.if_a_student_record_already_exists_the_user_deletes_it(dataTable);
    }

    @When("user goes to the {string} page:")
    public void user_goes_to_the_page(String pageName, DataTable dataTable) {
        StepsImplementation.user_goes_to_the_page(pageName, dataTable);
    }

    @When("user fills the first row:")
    public void user_fills_the_first_row(DataTable dataTable) {
        StepsImplementation.user_fills_the_first_row(dataTable);
    }

    @When("user fills the second row:")
    public void user_fills_the_second_row(DataTable dataTable) {
        StepsImplementation.user_fills_the_second_row(dataTable);
    }

    @When("user fills the third row:")
    public void user_fills_the_third_row(DataTable dataTable) {
        StepsImplementation.user_fills_the_third_row(dataTable);
    }

    @When("user fills the fourth row:")
    public void user_fills_the_fourth_row(DataTable dataTable) {
        StepsImplementation.user_fills_the_fourth_row(dataTable);
    }

    @When("user fills the fifth row:")
    public void user_fills_the_fifth_row(DataTable dataTable) {
        StepsImplementation.user_fills_the_fifth_row(dataTable);
    }

    @When("user adds a sibling using the {string} button:")
    public void user_adds_a_sibling_using_the_button(String text, DataTable dataTable) {
        StepsImplementation.user_adds_a_sibling_using_the_button(text, dataTable);
    }

    @When("user adds father's information:")
    public void user_adds_father_s_information(DataTable dataTable) {
        StepsImplementation.user_adds_father_s_information(dataTable);
    }

    @When("user adds mothers's information:")
    public void user_adds_mothers_s_information(DataTable dataTable) {
        StepsImplementation.user_adds_mothers_s_information(dataTable);
    }

    @When("user selects {string} in If Guardian Is radiobuttons")
    public void user_selects_in_the_if_guardian_is_radiobuttons(String value) {
        StepsImplementation.user_selects_in_the_if_guardian_is_radiobuttons(value);
    }

    @When("user adds the first row of guardian's information:")
    public void user_adds_the_first_row_of_guardian_s_information(DataTable dataTable) {
        StepsImplementation.user_adds_the_first_row_of_guardian_s_information(dataTable);
    }

    @When("user adds the second row of guardian's information:")
    public void user_adds_the_second_row_of_guardian_s_information(DataTable dataTable) {
        StepsImplementation.user_adds_the_second_row_of_guardian_s_information(dataTable);
    }

    @When("user adds information in the {string} block:")
    public void user_adds_information_in_the_block(String headerText, DataTable dataTable) {
        StepsImplementation.user_adds_information_in_the_block(headerText, dataTable);
    }

    @When("user adds information in the first row of the {string} section:")
    public void user_adds_information_in_the_first_row_of_the_section(String headerText, DataTable dataTable) {
        StepsImplementation.user_adds_information_in_the_first_row_of_the_section(headerText, dataTable);
    }

    @When("user adds information in the second row of the {string} section:")
    public void user_adds_information_in_the_second_row_of_the_section(String headerText, DataTable dataTable) {
        StepsImplementation.user_adds_information_in_the_second_row_of_the_section(headerText, dataTable);
    }

    @When("user adds information in the third row of the {string} section:")
    public void user_adds_information_in_the_third_row_of_the_section(String headerText, DataTable dataTable) {
        StepsImplementation.user_adds_information_in_the_third_row_of_the_section(headerText, dataTable);
    }

    @When("fills out all text fields and uploads files in the {string} section:")
    public void fills_out_all_text_fields_and_uploads_files_in_the_section(String sectionName, DataTable dataTable) {
        StepsImplementation.fills_out_all_text_fields_and_uploads_files_in_the_section(sectionName, dataTable);
    }

    @When("saves submission")
    public void saves_submission() {
        CommonMethods.click(studentAdmissionPage.saveButton);
    }

    @Then("user receives a message of success {string}")
    public void user_receives_a_message_of_success(String text) {
        CommonMethods.assertEquals(studentAdmissionPage.textOfSuccess.getText(), text);
    }

    @Then("user receives an error message {string}")
    public void user_receives_an_error_message(String text) {
        CommonMethods.assertEquals(studentAdmissionPage.errorText.getText(), text);
    }

    @When("user is searching for a student record based on parameters:")
    public void user_is_searching_for_a_student_record_based_on_parameters(DataTable dataTable) {
        StepsImplementation.user_is_searching_for_a_student_record_based_on_parameters(dataTable);
    }

    @Then("make sure the entry {string} is in the list and verify data")
    public void student_s_record_is_displayed_and_verify_data(String number, DataTable dataTable) {
        StepsImplementation.make_sure_the_entry_is_in_the_list_and_verify_data(number, dataTable);
    }
}
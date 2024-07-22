package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Admission_Steps {

    LoginPage loginPage = new LoginPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();
    SearchPage searchPage = new SearchPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();


    @Given("a CTSMS user is logged in to the main page {string}")
    public void a_ctsms_user_is_logged_in_to_the_main_page(String url) {
        loginPage.a_ctsms_user_is_logged_in_to_the_main_page(url);
    }

    @When("if a student record already exists, the user deletes it:")
    public void if_a_student_record_already_exists_the_user_deletes_it(DataTable dataTable) {
        bulkDeletePage.if_a_student_record_already_exists_the_user_deletes_it(dataTable);
    }

    @When("user fills in the fields in the {string} section:")
    public void user_fills_in_the_fields_in_the_section(String headerName, DataTable dataTable) {
        studentAdmissionPage.user_fills_in_the_fields_in_the_section(headerName, dataTable);
    }

    @When("user adds a sibling using the {string} button:")
    public void user_adds_a_sibling_using_the_button(String text, DataTable dataTable) {
        studentAdmissionPage.user_adds_a_sibling_using_the_button(text, dataTable);
    }

    @When("user adds father's information:")
    public void user_adds_father_s_information(DataTable dataTable) {
        studentAdmissionPage.user_adds_father_s_information(dataTable);
    }

    @When("user adds mothers's information:")
    public void user_adds_mothers_s_information(DataTable dataTable) {
        studentAdmissionPage.user_adds_mothers_s_information( dataTable);
    }

    @When("user adds guardian's information:")
    public void user_adds_guardian_s_information(DataTable dataTable) {
        studentAdmissionPage.user_adds_guardian_s_information(dataTable);
    }

    @When("user addis information in the {string} block:")
    public void user_addis_information_in_the_block(String headerText, DataTable dataTable) {
        studentAdmissionPage.user_addis_information_in_the_block(headerText, dataTable);
    }

    @When("user addins information in the {string} section:")
    public void user_addins_information_in_the_section(String headerText, DataTable dataTable) {
        studentAdmissionPage.user_addins_information_in_the_section(headerText, dataTable);
    }

    @When("saves submission")
    public void saves_submission() {
        studentAdmissionPage.saves_submission();
    }

    @When("user is searching for a student record based on parameters:")
    public void user_is_searching_for_a_student_record_based_on_parameters(DataTable dataTable) {
        searchPage.user_is_searching_for_a_student_record_based_on_parameters(dataTable);
    }

    @Then("make sure the entry {string} is in the list:")
    public void make_sure_the_entry_is_in_the_list(String admissionNumber, DataTable dataTable) {
        searchPage.make_sure_the_entry_is_in_the_list(admissionNumber, dataTable);
    }

    @When("fills out all text fields and uploads files in the {string} section:")
    public void fills_out_all_text_fields_and_uploads_files_in_the_section(String sectionName, DataTable dataTable) {
        studentAdmissionPage.fills_out_all_text_fields_and_uploads_files_in_the_section(sectionName, dataTable);
    }
}

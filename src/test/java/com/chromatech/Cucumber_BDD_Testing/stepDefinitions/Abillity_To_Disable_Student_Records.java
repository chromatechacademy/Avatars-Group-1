package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Abillity_To_Disable_Student_Records extends PageInitializer {

    @When("make the record {string} enabled if it is in the list")
    public void make_the_record_enabled_if_it_is_in_the_list(String number) {
        StepsImplementation.make_the_record_enabled_if_it_is_in_the_list(number);
    }

    @Then("verifies the information about disabled student in the student name block:")
    public void verifies_the_information_about_disabled_student_in_the_student_name_block(DataTable dataTable) {
        StepsImplementation.verifies_the_information_about_disabled_student_in_the_student_name_block(dataTable);
    }

    @When("user clicks on the {string} button and accept alert with text {string}")
    public void user_clicks_on_the_button_and_accept_alert_with_text(String text, String alertText) {
        StepsImplementation.user_clicks_on_the_button_and_accept_alert_with_text(text, alertText);
    }

    @When("enters data into the {string} modal window")
    public void enters_data_into_the_modal_window(String modalDialogHeaderText, DataTable dataTable) {
        StepsImplementation.enters_data_into_the_modal_window(modalDialogHeaderText, dataTable);
    }

    @Then("the {string} button is not displayed on the screen")
    public void the_button_is_not_displayed_on_the_screen(String buttonText) {
        StepsImplementation.the_button_is_not_displayed_on_the_screen(buttonText);
    }

    @Then("the {string} button is displayed on the screen")
    public void the_button_is_displayed_on_the_screen(String buttonText) {
        StepsImplementation.the_button_is_displayed_on_the_screen(buttonText);
    }


    @Then("information about disabling the student is displayed")
    public void information_about_disabling_the_student_is_displayed(DataTable dataTable) {
        StepsImplementation.information_about_disabling_the_student_is_displayed(dataTable);
    }

    @When("user click on the enable button")
    public void user_click_on_the_enable_button() {
        StepsImplementation.user_click_on_the_enable_button();
    }
}
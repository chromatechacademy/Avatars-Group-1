package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.Edit_Page;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Edit_Student_Records_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    SearchPage searchPage = new SearchPage();
    Edit_Page editPage = new Edit_Page();

    @When("clicks on the student details")
    public void clicks_on_the_student_details() {
        CommonMethods.click(dashboardPage.studentDetailsSubModule);
    }

    @Then("the user navigates to the student search page {string}")
    public void the_user_navigates_to_the_student_search_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("enters the Admission Number {string} in the Search By Keyword field")
    public void enters_the_admission_number_in_the_search_by_keyword_field(String number) {
        CommonMethods.sendKeys(searchPage.searchByKeywordTextBox, number);
    }

    @Then("user is on the Student Details page {string}")
    public void user_is_on_the_student_details_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("the user selects {string} in the Class dropdown")
    public void the_user_selects_in_the_class_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, editPage.classDropDown);
    }

    @When("selects {string} in the Section dropdown")
    public void selects_in_the_section_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.sectionDropDown);
    }

    @When("clicks the search button")
    public void clicks_the_search_button() {
        CommonMethods.click(searchPage.searchButton);
    }

    @Then("make sure the entry {string} is in the list")
    public void student_s_record_is_displayed(String number) {
        CommonMethods.assertTrue(searchPage.tableLocatorByText(number).isDisplayed());
    }

    @When("user clicks on the name of student record with admission number {string}")
    public void user_clicks_on_the_name_of_student_record_with_admission_number(String number) {
        CommonMethods.click(searchPage.dynamicTableLocator(number));
    }

    @When("clicks on edit button located near top right pencil icon")
    public void clicks_on_edit_button_located_near_top_right_pencil_logo() {
        CommonMethods.click(searchPage.editIconButton);
    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String text) {
        CommonMethods.assertEquals(editPage.editStudentHeader.getText(), text);
    }

    @When("user edits admission number field to the {string}")
    public void user_edits_admission_number_field_to_the(String number) {
        CommonMethods.sendKeys(editPage.admissionNoTextBox, number);
    }

    @When("user edits roll number field to {string}")
    public void user_edits_roll_number_field_to(String number) {
        CommonMethods.sendKeys(editPage.rollNumberTextBox, number);
    }

    @When("user edits class drop down to {string}")
    public void user_edits_class_drop_down_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.classDropDown);
        CommonMethods.sleep(2000);
    }

    @When("user edits section drop down to {string}")
    public void user_edit_section_drop_down_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.sectionDropDown);
    }

    @When("user edits first name field to {string}")
    public void user_edits_first_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.firstNameTextBox, text);
        CommonMethods.sleep(2000);
    }

    @When("user edits last name field to {string}")
    public void user_edits_last_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.lastNameTextBox,text);
    }

    @When("user edits gender field drop down to {string}")
    public void user_edits_gender_field_drop_down_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.genderDropDown);
    }

    @When("user edits category field to {string}")
    public void user_edits_category_field_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.categoryDropDown);
    }

    @When("user edits email field to {string}")
    public void user_edits_email_field_to(String text) {
        CommonMethods.sendKeys(editPage.emailTextBox, text);
    }

    @When("user edits Blood Group field to {string}")
    public void user_edits_blood_group_field_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.bloodGroupDropDown);
    }

    @When("user edits Moblie Number field to {string}")
    public void user_edits_moblie_number_field_to(String number) {
        CommonMethods.sendKeys(editPage.mobileNumberTextBox, number);
    }

    @When("user edits Height field to {string}")
    public void user_edits_height_field_to(String number) {
        CommonMethods.sendKeys(editPage.heightTextBox, number);
    }

    @When("user edits Weight field to {string}")
    public void user_edits_weight_field_to(String number) {
        CommonMethods.sendKeys(editPage.weightTextBox, number);
    }

    @When("user edits Father Name field to {string}")
    public void user_edits_father_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.fatherNameTextBox, text);
    }

    @When("user edits Phone No field to {string}")
    public void user_edits_phone_no_field_to(String number) {
        CommonMethods.sendKeys(editPage.phoneNoTextBox, number);
    }

    @When("user edits Father Occupation field to {string}")
    public void user_edits_father_occupation_field_to(String text) {
        CommonMethods.sendKeys(editPage.fatherOccupationTextBox, text);
    }

    @When("user edits Mother Name field to {string}")
    public void user_edits_mother_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.motherNameTextBox, text);
    }

    @When("user edits Mother Phone field to {string}")
    public void user_edits_mother_phone_field_to(String text) {
        CommonMethods.sendKeys(editPage.motherNoTextBox, text);
    }

    @When("user edits Mother Occupation field to {string}")
    public void user_edits_mother_occupation_field_to(String text) {
        CommonMethods.sendKeys(editPage.motherOccupationTextBox, text);
    }

    @When("user edits Guardian Name to {string}")
    public void user_edits_guardian_name_to(String text) {
        CommonMethods.sendKeys(editPage.guardianNameTextBox, text);
    }

    @When("user edits Guardian Relation to {string}")
    public void user_edits_guardian_relation_to(String text) {
        CommonMethods.sendKeys(editPage.guardianRelationTextBox, text);
    }

    @When("user edits Guardian Email to {string}")
    public void user_edits_guardian_email_to(String text) {
        CommonMethods.sendKeys(editPage.guardianEmailTextBox, text);
    }

    @When("user edits Guardian Phone to {string}")
    public void user_edits_guardian_phone_to(String number) {
        CommonMethods.sendKeys(editPage.guardianPhoneTextBox, number);
    }

    @When("user edits Guardian Occupation to {string}")
    public void user_edits_guardian_occupation_to(String text) {
        CommonMethods.sendKeys(editPage.guardianOccupationTextBox, text);
    }

    @When("user edits Guardian Address {string}")
    public void user_edits_guardian_address(String text) {
        CommonMethods.sendKeys(editPage.guardianAddressTextBox, text);
    }

}
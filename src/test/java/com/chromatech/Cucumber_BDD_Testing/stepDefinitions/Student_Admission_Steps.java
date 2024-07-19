package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.BulkDeletePage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Student_Admission_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();
    SearchPage searchPage = new SearchPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Then("within the expanded module, clicks on the {string} submodule")
    public void within_the_expanded_module_clicks_on_the_submodule(String text) {
        CommonMethods.click(dashboardPage.studentAdmission);
    }

    @When("user enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionNumberTextBox, number);
    }

    @When("user enters Roll Number {string}")
    public void user_enters_roll_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.rollNumberTextBox, number);
    }

    @When("selects SDET for class drop down {string}")
    public void selects_sdet_for_class_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.classDropDown);
    }

    @When("selects {string} for section drop down")
    public void selects_for_section_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.sectionDropDown);
    }

    @When("enters first name {string}")
    public void enters_first_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.firstNameTextBox, text);
    }

    @When("enters last name {string}")
    public void enters_last_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.lastNameTextBox, text);
    }

    @When("select {string} from gender drop down")
    public void select_from_gender_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.genderDropDown);
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String date) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.calendarTextBox, date);
    }

    @When("select {string} from category drop down")
    public void select_from_category_drop_down(String value) {
        CommonMethods.selectDropDownValue(value, studentAdmissionPage.categoryDropDown);
    }

    @When("enters email {string}")
    public void enters_email(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.emailTextBox, text);
    }

    @When("enters admission date {string}")
    public void enters_admission_date(String date) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDateTextBox, date);
    }

    @When("select {string} from blood group drop down")
    public void select_from_blood_group_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.bloodGroupDropDown);
    }

    @When("enters As on Date {string}")
    public void enters_as_on_date(String date) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDateTextBox, date);
    }


    @When("enters mobile number {string}")
    public void enters_mobile_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.mobileNumberTextBox, number);
    }

    @When("enters height {string}")
    public void enters_height(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.heightTextBox, text);
    }

    @When("enters weight {string}")
    public void enters_weight(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.weightTextBox, text);
    }

    @When("enter father name {string}")
    public void enter_father_name(String text) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.fatherNameTextBox);
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextBox, text);
    }

    @When("enters father phone {string}")
    public void enters_father_phone(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhoneTextBox, number);
    }

    @When("enter father occupation {string}")
    public void enter_father_occupation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherOccupationTextBox, text);
    }

    @When("enter mother name {string}")
    public void enter_mother_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.motherNameTextBox, text);
    }

    @When("enters mother phone {string}")
    public void enters_mother_phone(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.motherPhoneTextBox, number);
    }

    @When("enter mother occupation {string}")
    public void enter_mother_occupation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.motherOccupationTextBox, text);
    }

    @When("selects Father radio button for If guardian is field")
    public void selects_father_radio_button_for_if_guardian_is_field() {
        CommonMethods.click(studentAdmissionPage.fatherRadioButton);
    }

    @When("enter guardian email {string}")
    public void enter_guardian_email(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianEmailTextBox, text);
    }

    @When("enter guardian phone number {string}")
    public void enter_guardian_phone_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhoneNumberTextBox, number);
    }

    @When("enter guardian address {string}")
    public void enter_guardian_address(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianAddressTextBox, text);
    }

    @When("saves submission")
    public void saves_submission() {
        CommonMethods.click(studentAdmissionPage.saveButton);
    }

    @Then("user sees error message {string}")
    public void user_sees_error_message(String text) {
        CommonMethods.isElementDisplayed(studentAdmissionPage.errorText);
        CommonMethods.assertEquals(studentAdmissionPage.errorText.getText(), text);
    }

    @When("User clicks on the {string} module")
    public void user_clicks_on_the_module(String text) {
        CommonMethods.assertEquals(dashboardPage.studentInformationModule.getText(), text);
        CommonMethods.click(dashboardPage.studentInformationModule);
    }

    @Then("user is on the Student Admission page {string}")
    public void a_user_is_on_the_student_admission_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("user clicks on the {string} submodule")
    public void user_clicks_on_the_submodule(String text) {
        CommonMethods.assertEquals(studentAdmissionPage.studentDetailsSubModule.getText(), text);
        CommonMethods.click(studentAdmissionPage.studentDetailsSubModule);
    }

    @Then("the user navigates to the student search page {string}")
    public void the_user_navigates_to_the_student_search_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @Then("user sees a message about successful card creation {string}")
    public void user_sees_a_message_about_successful_card_creation(String text) {
        CommonMethods.assertEquals(studentAdmissionPage.textOfSuccess.getText(), text);
    }

    @When("enters the Admission Number {string} in the Search By Keyword field")
    public void enters_the_admission_number_in_the_search_by_keyword_field(String number) {
        CommonMethods.sendKeys(searchPage.SearchByKeywordTextBox, number);
    }

    @Then("user is on the Student Details page {string}")
    public void user_is_on_the_student_details_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("the user selects {string} in the Class dropdown")
    public void the_user_selects_in_the_class_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.classDropDown);
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

    @When("user clicks on the submodule {string} to delete a student record")
    public void user_clicks_on_the_submodule_to_delete_a_student_record(String text) {
        CommonMethods.click(searchPage.bulkDeleteSubModule);
    }

    @Then("user is on the page for deleting records {string}")
    public void user_is_on_the_page_for_deleting_records(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("user selects the student's class {string} from the dropdown list")
    public void user_selects_the_student_s_class_from_the_dropdown_list(String text) {
        CommonMethods.selectDropDownValue(text, bulkDeletePage.classDropdown);
    }

    @When("user selects the student's section {string} from the dropdown list")
    public void user_selects_the_student_s_section_from_the_dropdown_list(String text) {
        CommonMethods.selectDropDownValue(text, bulkDeletePage.sectionDropDown);
    }

    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        CommonMethods.click(bulkDeletePage.searchButton);
    }

    @When("user clicks on the checkbox next to the record with the Admission Number {string}")
    public void user_clicks_on_the_checkbox_next_to_the_record_with_the_admission_number(String number) {
        JavascriptMethods.scrollIntoView(bulkDeletePage.dynamicXpathForCheckboxes(number));
        CommonMethods.click(bulkDeletePage.dynamicXpathForCheckboxes(number));
    }

    @When("user clicks on the delete button and accept alert with text {string}")
    public void user_clicks_on_the_delete_button(String text) {
        JavascriptMethods.scrollIntoView(bulkDeletePage.deleteButton);
        CommonMethods.click(bulkDeletePage.deleteButton);
        CommonMethods.assertEquals(CommonMethods.getAlertText(), text);
        CommonMethods.acceptAlert();
    }
}

package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Edit_Student_Records_Steps {

    SearchPage searchPage = new SearchPage();
    EditPage editPage = new EditPage();

    @When("user clicks on Student Admission")
    public void user_clicks_on_student_admission() {
        editPage.studentAdmissionTab.click();
    }

    @When("user enters admission number field to the {string}")
    public void user_enters_admission_number_field_to_the(String text) {
        editPage.admissionNoTextBox.sendKeys(text);
    }

    @When("the user selects {string} in the Class dropdown")
    public void the_user_selects_in_the_class_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.classDropDown);
    }

    @When("selects {string} in the Section dropdown")
    public void selects_in_the_section_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.sectionDropDown);
    }

    @When("user enters first name field to {string}")
    public void user_enters_first_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.firstNameTextBox, text);
    }

    @When("user selects gender field drop down to {string}")
    public void user_selects_gender_field_drop_down_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.genderDropDown);
    }

    @And("user selects date of birth field to {string}")
    public void user_selects_date_of_birth_field_to(String dateOfBirth) {
        JavascriptMethods.selectDateByJS(editPage.dateOfBirthTextBox, dateOfBirth);
    }

    @When("user selects on {string} radio button")
    public void user_selects_on_radio_button(String string) {
        editPage.fatherRadioButton.click();
    }

    @When("And user enters Guardian Name to {string}")
    public void and_user_enters_guardian_name_to(String text) {
        CommonMethods.sendKeys(editPage.guardianNameTextBox, text);
    }
    @When("user user Guardian Phone to {string}")
    public void user_user_guardian_phone_to(String text) {
       editPage.guardianPhoneTextBox.sendKeys(text);
    }

    @Then("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        CommonMethods.click(editPage.saveButton);
    }

    @When("clicks on the student details")
    public void clicks_on_the_student_details() throws InterruptedException {
        Thread.sleep(10000);
        editPage.studentDetailsTab.click();
    }

    @Then("the user navigates to the student search page {string}")
    public void the_user_navigates_to_the_student_search_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("the user selects {string} in the Class dropdown in edit page")
    public void the_user_selects_in_the_class_dropdown_in_edit_page(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.classDropDown);
    }

    @When("selects {string} in the Section dropdown in edit page")
    public void selects_in_the_section_dropdown_in_edit_page(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.sectionDropDown);
    }

    @When("enters the Admission Number {string} in the Search By Keyword field")
    public void enters_the_admission_number_in_the_search_by_keyword_field(String number) {
        CommonMethods.sendKeys(searchPage.searchByKeywordTextBox, number);
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

    @When("user edits roll number field to {string}")
    public void user_edits_roll_number_field_to(String number) {
        CommonMethods.sendKeys(editPage.rollNumberTextBox, number);
    }

    @When("user edits first name field to {string}")
    public void user_edits_first_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.firstNameTextBox, text);
    }

    @When("user edits last name field to {string}")
    public void user_edits_last_name_field_to(String text) {
        CommonMethods.sendKeys(editPage.lastNameTextBox,text);
    }

    @When("user edits gender field drop down to {string}")
    public void user_edits_gender_field_drop_down_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.genderDropDown);
    }

    @And("user edits DOB field to {string}")
    public void user_DOB_field_to(String dateOfBirth) {
        JavascriptMethods.selectDateByJS(editPage.dateOfBirthTextBox, dateOfBirth);
    }

    @When("user edits category field to {string}")
    public void user_edits_category_field_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.categoryDropDown);
    }

    @When("user edits email field to {string}")
    public void user_edits_email_field_to(String text) {
        CommonMethods.sendKeys(editPage.emailTextBox, text);
    }

    @When("user edits Admission Date field to {string}")
    public void user_edits_admission_date_field_to(String text) {
        JavascriptMethods.selectDateByJS(editPage.admissionDateTextBox, text);
    }

    @When("user edits Student Photo field to {string}")
    public void user_edits_student_photo_field_to(String path) {
        CommonMethods.sendKeys(editPage.studentPhoto, CommonMethods.readLocalFile(path));
    }

    @When("user edits Blood Group field to {string}")
    public void user_edits_blood_group_field_to(String value) {
        CommonMethods.selectDropDownValue(value, editPage.bloodGroupDropDown);
    }

    @When("user edits As On Date field to {string}")
    public void user_edits_as_on_date_field_to(String text) {
        JavascriptMethods.selectDateByJS(editPage.asOnDateTextBox, text);
    }

    @When("user edits Mobile Number field to {string}")
    public void user_edits_mobile_number_field_to(String number) {
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

    @When("user edits Father Photo field to {string}")
    public void user_edits_father_photo_field_to(String path) {
        CommonMethods.sendKeys(editPage.fatherPhoto, CommonMethods.readLocalFile(path));
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

    @When("user edits Mother Photo field to {string}")
    public void user_edits_mother_photo_field_to(String path) {
        CommonMethods.sendKeys(editPage.fatherPhoto, CommonMethods.readLocalFile(path));
    }

    @When("user selects on {string} radio button on edit page")
    public void user_selects_on_radio_button_on_edit_page(String string) {
        editPage.fatherRadioButton.click();
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

    @When("user edits Guardian Photo to {string}")
    public void user_edits_guardian_photo_to(String path) {
        CommonMethods.sendKeys(editPage.guardianPhoto, CommonMethods.readLocalFile(path));
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

    @And("user clicks on the save button on edit page")
    public void user_clicks_on_the_save_button_on_edit_page() {
        CommonMethods.click(editPage.saveButton);
    }

    @And("user clicks on the bulk delete button")
    public void user_clicks_on_the_bulk_delete_button() {
       editPage.bulkDeleteTab.click();
    }
    @Then("user selects the class drop down {string}")
    public void user_selects_the_class_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.classDropDown);
    }

    @Then("user selects the section drop down {string}")
    public void user_selects_the_section_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.sectionDropDown);
    }

    @Then("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        Thread.sleep(7000);
        CommonMethods.click(editPage.searchButtonBulkDelete);
    }

    @Then("user selects {string} student admission number and deletes it")
    public void user_selects_student_admission_number_and_deletes_it(String admissionNumber) {
        CommonMethods.sleep(10000);
        CommonMethods.waitForClickability(EditPage.dynamicRecordLocateDeleter(admissionNumber));
        JavascriptMethods.scrollIntoView(EditPage.dynamicRecordLocateDeleter(admissionNumber));
        EditPage.dynamicRecordLocateDeleter(admissionNumber).click();
        CommonMethods.click(editPage.deleteButton);
        CommonMethods.acceptAlert();
        CommonMethods.sleep(5000);
    }
}
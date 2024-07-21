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
        CommonMethods.click(dashboardPage.studentAdmissionSubModule);
    }

    @When("user enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionNumberTextBox, number);
    }

    @When("user enters Roll Number {string}")
    public void user_enters_roll_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.rollNumberTextBox, number);
    }

    @When("selects {string} for class drop down")
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

    @When("selects {string} from gender drop down")
    public void select_from_gender_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.genderDropDown);
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String date) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, date);
    }

    @When("selects {string} from category drop down")
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

    @When("uploads Student Photo {string}")
    public void uploads_student_photo(String filePath) {
        CommonMethods.sendKeys(studentAdmissionPage.studentPhotoUpload, filePath);
    }

    @When("selects {string} from blood group drop down")
    public void select_from_blood_group_drop_down(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.bloodGroupDropDown);
    }

    @When("enters As on Date {string}")
    public void enters_as_on_date(String date) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDateTextBox, date);
    }

    @When("clicks on the Add Sibling button")
    public void clicks_on_the_add_sibling_button() {
        CommonMethods.click(studentAdmissionPage.addSiblingButton);
    }

    @Then("the Sibling modal dialog {string} is displayed")
    public void the_sibling_modal_dialog_is_displayed(String text) {
        CommonMethods.assertTrue(studentAdmissionPage.siblingModalDialog.isDisplayed());
        CommonMethods.assertEquals(studentAdmissionPage.siblingModalDialogHeader.getText(), text);
    }

    @Then("selects {string} for Class drop down in the Sibling modal dialog")
    public void selects_for_class_drop_down_in_the_sibling_modal_dialog(String value) {
        CommonMethods.selectDropDownValue(value, studentAdmissionPage.classDropDownInTheSiblingModalDialog);
    }

    @Then("selects {string} for Section drop down in the Sibling modal dialog")
    public void selects_for_section_drop_down_in_the_sibling_modal_dialog(String value) {
        CommonMethods.selectDropDownValue(value, studentAdmissionPage.sectionDropDownInTheSiblingModalDialog);
    }

    @Then("selects {string} for Student drop down in the Sibling modal dialog")
    public void selects_for_student_drop_down_in_the_sibling_modal_dialog(String text) {
        CommonMethods.selectDropDownValue(text, studentAdmissionPage.studentDropDownInTheSiblingModalDialog);
    }

    @Then("click on the Add button in the Sibling modal dialog")
    public void click_on_the_add_button_in_the_sibling_modal_dialog() {
        CommonMethods.click(studentAdmissionPage.addButtonInTheSiblingModalDialog);
    }

    @Then("{string} text is displayed")
    public void text_is_displayed(String text) {
        CommonMethods.assertTrue(studentAdmissionPage.siblingNameText.isDisplayed());
        CommonMethods.assertEquals(studentAdmissionPage.siblingNameText.getText(), text);
    }

    @Then("selects {string} RTE radio button")
    public void selects_rte_radio_button(String value) {
        CommonMethods.click(studentAdmissionPage.rTERadioButton(value));
    }

    @Then("enters Previous School Details {string}")
    public void enters_previous_school_details(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.previousSchoolDetailsTextBox, text);
    }

    @Then("enters Note {string}")
    public void enters_note(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.noteTextBox, text);
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

    @When("enters father name {string}")
    public void enter_father_name(String text) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.fatherNameTextBox);
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextBox, text);
    }

    @When("enters father phone {string}")
    public void enters_father_phone(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhoneTextBox, number);
    }

    @When("enters father occupation {string}")
    public void enter_father_occupation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherOccupationTextBox, text);
    }

    @When("uploads Father Photo {string}")
    public void uploads_father_photo(String filePath) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhotoUpload, filePath);
    }

    @When("uploads Mother Photo {string}")
    public void uploads_mother_photo(String filePath) {
        CommonMethods.sendKeys(studentAdmissionPage.motherPhotoUpload, filePath);
    }

    @When("uploads Guardian Photo {string}")
    public void uploads_guardian_photo(String filePath) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhotoUpload, filePath);
    }

    @When("enters mother name {string}")
    public void enter_mother_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.motherNameTextBox, text);
    }

    @When("enters mother phone {string}")
    public void enters_mother_phone(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.motherPhoneTextBox, number);
    }

    @When("enters mother occupation {string}")
    public void enter_mother_occupation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.motherOccupationTextBox, text);
    }

    @When("selects {string} radio button for If guardian is field")
    public void selects_radio_button_for_if_guardian_is_field(String text) {
        CommonMethods.click(studentAdmissionPage.dynamicIfGuardianRadioButton(text));
    }

    @When("enters guardian name {string}")
    public void enter_guardian_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianNameTextBox, text);
    }

    @When("enters guardian relation {string}")
    public void enter_guardian_relation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianRelationTextBox, text);
    }

    @When("enters guardian phone {string}")
    public void enters_guardian_phone(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhoneTextBox, text);
    }

    @When("enters guardian occupation {string}")
    public void enters_guardian_occupation(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianOccupationTextBox, text);
    }

    @When("enters guardian email {string}")
    public void enter_guardian_email(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianEmailTextBox, text);
    }

    @When("enters guardian phone number {string}")
    public void enter_guardian_phone_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhoneNumberTextBox, number);
    }

    @When("enters guardian address {string}")
    public void enter_guardian_address(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianAddressTextBox, text);
    }

    @When("clicks on the Add More Details boxplus button")
    public void clicks_add_more_details_boxplus_button() {
        CommonMethods.click(studentAdmissionPage.addMoreBoxPlusButton);
    }



    @When("clicks on the If Guardian Address is Current Address checkbox")
    public void clicks_on_the_if_guardian_address_is_current_address_checkbox() {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.addMoreBoxPlusButton);
        CommonMethods.click(studentAdmissionPage.ifGuardianAddressIsCurrentAddressCheckbox);
    }

    @When("enters Current Address {string}")
    public void enters_current_address(String address) {
        CommonMethods.sendKeys(studentAdmissionPage.currentAddressTextBox, address);
    }

    @When("clicks on the If Permanent Address is Current Address checkbox")
    public void clicks_on_the_if_permanent_address_is_current_address_checkbox() {
        CommonMethods.click(studentAdmissionPage.ifPermanentAddressIsCurrentAddressCheckBox);
    }

    @When("enters Permanent Address {string}")
    public void enters_permanent_address(String address) {
        CommonMethods.sendKeys(studentAdmissionPage.permanentAddressTextBox, address);
    }

    @When("enters Bank Account Number {string}")
    public void enters_bank_account_number(String number) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.miscellaneousDetailsHeader);
        CommonMethods.sendKeys(studentAdmissionPage.bankAccountNumberTextBox, number);
    }

    @When("enters Bank Name {string}")
    public void enters_bank_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.bankNameTextBox, text);
    }

    @When("enters IFSC Code {string}")
    public void enters_ifsc_code(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.iFSCCodetextBox, number);
    }

    @When("enters National Identification Number {string}")
    public void enters_national_identification_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.nationalIdentificationNumberTextBox, number);
    }

    @When("enters Local Identification Number {string}")
    public void enters_local_identification_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.localIdentificationNumberTextBox, number);
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

    @When("user clicks on the {string} module")
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

    @When("user clicks on the search button")
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

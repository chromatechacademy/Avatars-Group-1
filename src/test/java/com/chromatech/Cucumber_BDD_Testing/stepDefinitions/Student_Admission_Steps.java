package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Student_Admission_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();
    SearchPage searchPage = new SearchPage();

    @Given("CTSMS user is logged in to the Student Admission page {string}")
    public void a_ctsms_user_is_logged_in_to_the_student_admission_page(String url) {
        CommonMethods.click(dashboardPage.studentInformationModule);
        CommonMethods.click(dashboardPage.studentAdmissionSubModule);
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("user enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionNumberTextBox, number);
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
        CommonMethods.sendKeys(studentAdmissionPage.calendarTextBox, date);
    }

    @When("enter father name {string}")
    public void enter_father_name(String text) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.fatherNameTextBox);
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextBox, text);
    }

    @When("selects Father radio button for If guardian is field")
    public void selects_father_radio_button_for_if_guardian_is_field() {
        CommonMethods.click(studentAdmissionPage.fatherRadioButton);
    }

    @When("enter guardian name {string}")
    public void enter_guardian_name(String text) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianNameTextBox, text);
    }

    @When("enter guardian phone number {string}")
    public void enter_guardian_phone_number(String number) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhoneNumberTextBox, number);
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

    @When("within the expanded module, clicks on the {string} submodule")
    public void and_within_the_expanded_module_clicks_on_the_submodule(String text) {
        CommonMethods.assertEquals(dashboardPage.studentAdmissionSubModule.getText(), text);
        CommonMethods.click(dashboardPage.studentAdmissionSubModule);
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

    @When("clicks the search button")
    public void clicks_the_search_button() {
        CommonMethods.click(searchPage.searchButton);
    }

    @Then("make sure the entry {string} is in the list")
    public void student_s_record_is_displayed(String number) {
        CommonMethods.assertTrue(searchPage.tableLocatorByText(number).isDisplayed());
        CommonMethods.sleep(2000);
    }
}

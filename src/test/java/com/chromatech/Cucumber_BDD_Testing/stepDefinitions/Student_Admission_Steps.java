package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Student_Admission_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("a CTSMS user is logged in to the Student Admission page {string}")
    public void a_ctsms_user_is_logged_in_to_the_student_admission_page(String url) {
        CommonMethods.click(dashboardPage.studentInformationModule);
        CommonMethods.click(dashboardPage.studentAdmissionSubModule);
        CommonMethods.assertEquals(driver.getWindowHandle(), url);
    }

    @When("enters Unique Admission Number {string}")
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
        CommonMethods.scrollIntoView(studentAdmissionPage.fatherNameTextBox);
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
        CommonMethods.sleep(3000);
    }
}

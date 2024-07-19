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
        CommonMethods.click(dashboardPage.studentDetails);
    }

    @Then("the user navigates to the student search page {string}")
    public void the_user_navigates_to_the_student_search_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
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

    @When("user clicks on the name of student record with admission number {string}")
    public void user_clicks_on_the_name_of_student_record_with_admission_number(String number) {
    CommonMethods.click(searchPage.dynamicTableLocator(number));
    }

    @When("clicks on edit button located near top right pencil icon")
    public void clicks_on_edit_button_located_near_top_right_pencil_logo() {
    CommonMethods.click(searchPage.editIconButton);
    CommonMethods.sleep(2000);
    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String text) {
    CommonMethods.assertEquals(editPage.editStudentHeader.getText(), text);
    }

}
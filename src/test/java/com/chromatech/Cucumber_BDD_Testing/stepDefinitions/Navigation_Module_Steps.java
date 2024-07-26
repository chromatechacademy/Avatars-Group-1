package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Navigation_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("a Chroma Tech user is on the dashboard page")
    public void a_chroma_tech_user_is_on_the_dashboard_page() {
    }

    @Then("the Student Information {string} module is displayed")
    public void the_student_information_module_is_displayed(String expectedStudentInformation) {
        CommonMethods.assertTrue(dashboardPage.studentInformationModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentInformationModule.getText(), expectedStudentInformation);
    }

    @Then("the Fees Collection {string} module is displayed")
    public void the_fees_collection_module_is_displayed(String expectedFeesCollection) {
        CommonMethods.assertTrue(dashboardPage.feesCollectionModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesCollectionModule.getText(), expectedFeesCollection);
    }

    @Then("the Income {string} module is displayed")
    public void the_income_module_is_displayed(String expectedIncome) {
        CommonMethods.assertTrue(dashboardPage.incomeModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.incomeModule.getText(), expectedIncome);
    }

    @Then("the Expenses {string} module is displayed")
    public void the_expenses_module_is_displayed(String expectedExpense) {
        CommonMethods.assertTrue(dashboardPage.expensesModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.expensesModule.getText(), expectedExpense);
    }

    @Then("the Academics {string} module is displayed")
    public void the_academics_module_is_displayed(String expectedAcademics) {
        CommonMethods.assertTrue(dashboardPage.academicsModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.academicsModule.getText(), expectedAcademics);
    }

    @Then("the Human Resource {string} module is displayed")
    public void the_human_resource_module_is_displayed(String expectedHumanResource) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModule.getText(), expectedHumanResource);
    }

    @Then("the Homework {string} module is displayed")
    public void the_homework_module_is_displayed(String expectedHomework) {
        CommonMethods.assertTrue(dashboardPage.homeworkModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.homeworkModule.getText(), expectedHomework);
    }

    @Then("the Reports {string} module is displayed")
    public void the_reports_module_is_displayed(String expectedReports) {
        CommonMethods.assertTrue(dashboardPage.reportsModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.reportsModule.getText(), expectedReports);
    }
}

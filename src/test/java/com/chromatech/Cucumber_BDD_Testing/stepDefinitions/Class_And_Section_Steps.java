package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassAndSectionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Class_And_Section_Steps {

    ClassAndSectionPage classAndSectionPage = new ClassAndSectionPage();

    @Given("a Chroma Tech user is on the dashboard page")
    public void a_chroma_tech_user_is_on_the_dashboard_page() {
        CommonMethods.assertTrue(classAndSectionPage.dashBoardPageHeader.isDisplayed());
        CommonMethods.assertEquals(classAndSectionPage.dashBoardPageHeader.getText(), classAndSectionPage.dashBoardPageHeader.getText());
    }

    @When("the user navigates to the Class submodule")
    public void the_user_navigates_to_the_class_submodule() {
        classAndSectionPage.academicsModuleTab.click();
        classAndSectionPage.classSubmodule.click();
        CommonMethods.sleep(5000);
    }

    @Then("there are two classes, SDET and Cyber Security displayed with the following sections:")
    public void there_are_two_classes_sdet_and_cyber_security_displayed_with_the_following_sections() {
        CommonMethods.assertTrue(classAndSectionPage.sdetClass.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.cyberSecurityClass.isDisplayed());
        CommonMethods.assertTrue(SearchPage.tableLocatorByText());

    }

}
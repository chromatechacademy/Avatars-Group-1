package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassAndSectionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;

public class StepsImplementation extends PageInitializer {

    /**
     * Deletes a student's admission number as selected by the user.
     *
     * @param admissionNumber the admission number of the student to be deleted
     */
    public static void user_selects_student_admission_number_and_deletes_it(String admissionNumber) {
        CommonMethods.waitForClickability(EditPage.dynamicRecordLocateDelete(admissionNumber));
        JavascriptMethods.scrollIntoView(EditPage.dynamicRecordLocateDelete(admissionNumber));
        Assert.assertEquals(editPage.admissionNumber.getText(), editPage.admissionNumber.getText());
        EditPage.dynamicRecordLocateDelete(admissionNumber).click();
        CommonMethods.click(editPage.deleteButton);
        CommonMethods.acceptAlert();
    }

    public static void the_user_clicks_on_the_x_button_to_delete() {
        JavascriptMethods.scrollIntoView(expenseHeadPage.expenseHeadBill);
        expenseHeadPage.expenseHeadXBtn.click();
        CommonMethods.acceptAlert();
    }


    public static void a_chroma_tech_user_is_on_the_dashboard_page() {
        CommonMethods.assertTrue(classAndSectionPage.dashBoardPageHeader.isDisplayed());
        CommonMethods.assertEquals(classAndSectionPage.dashBoardPageHeader.getText(), classAndSectionPage.dashBoardPageHeader.getText());
    }

    public static void the_user_navigates_to_the_class_submodule() {
        classAndSectionPage.academicsModuleTab.click();
        classAndSectionPage.classSubmodule.click();
    }

    public static void there_are_two_classes_sdet_and_cyber_security_displayed_with_the_following_sections(String class1, String section1, DataTable dataTable) {
        CommonMethods.assertTrue(classAndSectionPage.sdetClass.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.cyberSecurityClass.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.testingFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.sdlcMethodogies.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.seleniumTestAutomation.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.cucumberFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.apiTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.gitgithub.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.java11ForCoolPeople.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.mobileTestAutomation.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.accessiblityTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.databaseTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.networkingFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.linuxFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.ciaTriad.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.penetrationTestingEthicalHacking.isDisplayed());
    }
}

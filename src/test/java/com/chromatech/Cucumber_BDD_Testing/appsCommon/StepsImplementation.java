package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.*;
import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StepsImplementation extends PageInitializer {

    /**
     * Logs in a user to the main page of the CT SMS application.
     *
     * @param url The expected URL of the main page after logging in
     */
    public static void a_ctsms_user_is_logged_in_to_the_main_page(String url) {
        driver.get("https://mexil.it/chroma/admin/admin/dashboard");
        CommonMethods.sendKeys(loginPage.usernameTextBox, "general@teacher.com");
        CommonMethods.sendKeys(loginPage.passwordTextBox, "123456");
        CommonMethods.click(loginPage.signInButton);
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    /**
     * Navigates the user to the specified page by clicking on the submodule link.
     *
     * @param subModuleName The name of the submodule to navigate to.
     * @param dataTable     The DataTable object containing the page details.
     */
    public static void user_goes_to_the_page(String subModuleName, DataTable dataTable) {
        if (!(DashboardPage.findSubModuleByText(subModuleName).isDisplayed())) {
            CommonMethods.click(DashboardPage.findModuleByText(dataTable.cell(1, 0))); // Module
        }
        CommonMethods.click(DashboardPage.findSubModuleByText(dataTable.cell(1, 1))); // SubModule
        CommonMethods.assertEquals(driver.getCurrentUrl(), (dataTable.cell(1, 2))); // URL
    }

    /**
     * If a student record already exists, the user deletes it.
     *
     * @param dataTable The data table containing the record details to be deleted.
     */
    public static void if_a_student_record_already_exists_the_user_deletes_it(DataTable dataTable) {
        CommonMethods.selectDropDownValue((dataTable.cell(1, 0)), bulkDeletePage.classDropdown); //Class
        CommonMethods.selectDropDownValue((dataTable.cell(1, 1)), bulkDeletePage.sectionDropDown); // Section
        CommonMethods.click(bulkDeletePage.searchButton);
        try {
            if(BulkDeletePage.dynamicXpathFindByAdmissionNumber(dataTable.cell(1, 2)).isDisplayed()){
                JavascriptMethods.scrollIntoView(BulkDeletePage.dynamicXpathForCheckboxes((dataTable.cell(1, 2)))); // Admission Number
                CommonMethods.click(BulkDeletePage.dynamicXpathForCheckboxes((dataTable.cell(1, 2)))); // Admission Number
                JavascriptMethods.scrollIntoView(bulkDeletePage.deleteButton);
                CommonMethods.click(bulkDeletePage.deleteButton);
                CommonMethods.assertEquals(CommonMethods.getAlertText(), ((dataTable.cell(1, 3)))); // Alert Text
                CommonMethods.acceptAlert();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Record number " + (dataTable.cell(1, 2)) + " does not exist");
        }
    }

    /**
     * Fills the first row of data in the user interface.
     *
     * @param dataTable The DataTable containing the data to be filled in the first row.
     */
    public static void user_fills_the_first_row(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionNumberTextBox, (dataTable.cell(1, 0))); // Admission Number
        CommonMethods.sendKeys(studentAdmissionPage.rollNumberTextBox, (dataTable.cell(1, 1))); // Roll Number
        CommonMethods.selectDropDownValue((dataTable.cell(1, 2)), studentAdmissionPage.classDropDown); // Class
        CommonMethods.selectDropDownValue((dataTable.cell(1, 3)), studentAdmissionPage.sectionDropDown); // Section
    }

    /**
     * Fills the second row of data in the user interface.
     *
     * @param dataTable The DataTable containing the data to be filled in the second row.
     */
    public static void user_fills_the_second_row(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.firstNameTextBox, (dataTable.cell(1, 0))); // First Name
        CommonMethods.sendKeys(studentAdmissionPage.lastNameTextBox, (dataTable.cell(1, 1))); // Last Name
        CommonMethods.selectDropDownValue((dataTable.cell(1, 2)), studentAdmissionPage.genderDropDown); // Gender
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, (dataTable.cell(1, 3))); // Date of Birth
    }

    /**
     * Fills the third row of data in the user interface.
     *
     * @param dataTable The DataTable containing the data to be filled in the third row.
     */
    public static void user_fills_the_third_row(DataTable dataTable) {
        CommonMethods.selectDropDownValue((dataTable.cell(1, 0)), studentAdmissionPage.categoryDropDown); // Category
        CommonMethods.sendKeys(studentAdmissionPage.emailTextBox, (dataTable.cell(1, 1))); // Email
    }

    /**
     * Fills the fourth row of data in the user interface.
     *
     * @param dataTable The DataTable containing the data to be filled in the fourth row.
     */
    public static void user_fills_the_fourth_row(DataTable dataTable) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDateTextBox, (dataTable.cell(1, 0))); // Admission Date
        CommonMethods.sendKeys(studentAdmissionPage.studentPhotoUpload, Constants.STUDENT_PHOTO); // Student Photo
        CommonMethods.selectDropDownValue((dataTable.cell(1, 1)), studentAdmissionPage.bloodGroupDropDown); // Blood Group
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDateTextBox, (dataTable.cell(1, 2))); // As on Date
    }

    /**
     * Fills the fifth row of data in the user interface.
     *
     * @param dataTable The DataTable containing the data to be filled in the fifth row.
     */
    public static void user_fills_the_fifth_row(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.mobileNumberTextBox, (dataTable.cell(1, 0))); // Mobile Number
        CommonMethods.sendKeys(studentAdmissionPage.heightTextBox, (dataTable.cell(1, 1))); // Height
        CommonMethods.sendKeys(studentAdmissionPage.weightTextBox, (dataTable.cell(1, 2))); // Weight
    }

    /**
     * User adds a sibling using the button.
     *
     * @param text      The expected text on the add sibling button.
     * @param dataTable The DataTable object containing the sibling details.
     */
    public static void user_adds_a_sibling_using_the_button(String text, DataTable dataTable) {
        CommonMethods.assertEquals(studentAdmissionPage.addSiblingButton.getText(), text); // Add Sibling text
        CommonMethods.click(studentAdmissionPage.addSiblingButton); // Add Sibling button
        CommonMethods.waitForClickability(studentAdmissionPage.classDropDownInTheSiblingModalDialog);
        CommonMethods.selectDropDownValue(dataTable.cell(1, 0), studentAdmissionPage.classDropDownInTheSiblingModalDialog); // Class
        CommonMethods.selectDropDownValue(dataTable.cell(1, 1), studentAdmissionPage.sectionDropDownInTheSiblingModalDialog); // Section
        String siblingStudent = dataTable.cell(1, 2) + " " + dataTable.cell(1, 3) + " (" + (dataTable.cell(1, 4)) + ") "; // First Name + Last Name + (Roll Number)
        CommonMethods.selectDropDownValue(siblingStudent, studentAdmissionPage.studentDropDownInTheSiblingModalDialog);
        CommonMethods.click(studentAdmissionPage.addButtonInTheSiblingModalDialog);
        CommonMethods.waitForVisibility(studentAdmissionPage.siblingNameText);
        JavascriptMethods.scrollIntoView(studentAdmissionPage.siblingNameText);
        CommonMethods.assertEquals(studentAdmissionPage.siblingNameText.getText(), "Sibling: " + dataTable.cell(1, 2) + " " + dataTable.cell(1, 3)); // Sibling firtName + lastName
    }

    /**
     * Adds father's information to the user interface.
     *
     * @param dataTable The DataTable containing the father's information.
     */
    public static void user_adds_father_s_information(DataTable dataTable) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.fatherNameTextBox);
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextBox, dataTable.cell(1, 0)); // Father Name
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhoneTextBox, dataTable.cell(1, 1)); // Father Phone
        CommonMethods.sendKeys(studentAdmissionPage.fatherOccupationTextBox, dataTable.cell(1, 2)); // Father Occupation
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhotoUpload, Constants.FATHER_PHOTO);
    }

    /**
     * Adds mother's information to the user interface.
     *
     * @param dataTable The DataTable containing the mother's information.
     */
    public static void user_adds_mothers_s_information(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.motherNameTextBox, dataTable.cell(1, 0)); // Mother Name
        CommonMethods.sendKeys(studentAdmissionPage.motherPhoneTextBox, dataTable.cell(1, 1)); // Mother Phone
        CommonMethods.sendKeys(studentAdmissionPage.motherOccupationTextBox, dataTable.cell(1, 2)); // Mother Occupation
        CommonMethods.sendKeys(studentAdmissionPage.motherPhotoUpload, Constants.MOTHER_PHOTO);
    }

    /**
     * User selects the specified value in the "If Guardian is" radio buttons.
     *
     * @param value The value to be selected in the radio buttons.
     */
    public static void user_selects_in_the_if_guardian_is_radiobuttons(String value) {
        CommonMethods.click(StudentAdmissionPage.dynamicIfGuardianRadioButton(value));
    }

    /**
     * Sets the first row of guardian's information in the user interface.
     *
     * @param dataTable The DataTable containing the guardian's information.
     */
    public static void user_adds_the_first_row_of_guardian_s_information(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianNameTextBox, dataTable.cell(1, 0)); // Guardian Name
        CommonMethods.sendKeys(studentAdmissionPage.guardianRelationTextBox, dataTable.cell(1, 1)); // Guardian Relation
        CommonMethods.sendKeys(studentAdmissionPage.guardianEmailTextBox, dataTable.cell(1, 2)); // Guardian Email
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhotoUpload, Constants.GUARDIAN_PHOTO); // Guardian Photo
    }

    /**
     * Adds the second row of guardian's information to the user interface.
     *
     * @param dataTable The DataTable containing the guardian's information.
     */
    public static void user_adds_the_second_row_of_guardian_s_information(DataTable dataTable) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianPhoneTextBox, (dataTable.cell(1, 0))); // Guardian Phone
        CommonMethods.sendKeys(studentAdmissionPage.guardianOccupationTextBox, (dataTable.cell(1, 1))); // Guardian Occupation
        CommonMethods.sendKeys(studentAdmissionPage.guardianAddressTextBox, (dataTable.cell(1, 2))); // Guardian Address
    }

    /**
     * Adds information in the first row of the section.
     *
     * @param headerText The header text of the section.
     * @param dataTable  The DataTable containing the information to be added.
     */
    public static void user_adds_information_in_the_first_row_of_the_section(String headerText, DataTable dataTable) {
        CommonMethods.assertEquals(studentAdmissionPage.miscellaneousDetailsHeader.getText(), headerText);
        JavascriptMethods.scrollIntoView(studentAdmissionPage.miscellaneousDetailsHeader);
        CommonMethods.sendKeys(studentAdmissionPage.bankAccountNumberTextBox, dataTable.cell(1, 0)); // Bank Account Number
        CommonMethods.sendKeys(studentAdmissionPage.bankNameTextBox, dataTable.cell(1, 1)); // Bank Name
        CommonMethods.sendKeys(studentAdmissionPage.iFSCCodetextBox, dataTable.cell(1, 2)); // IFSC Code
    }

    /**
     * Adds information in the second row of the section.
     *
     * @param headerText The header text of the section.
     * @param dataTable  The DataTable containing the information to be added.
     */
    public static void user_adds_information_in_the_second_row_of_the_section(String headerText, DataTable dataTable) {
        CommonMethods.assertEquals(studentAdmissionPage.miscellaneousDetailsHeader.getText(), headerText);
        CommonMethods.sendKeys(studentAdmissionPage.nationalIdentificationNumberTextBox, dataTable.cell(1, 0)); // National Identification Number
        CommonMethods.sendKeys(studentAdmissionPage.localIdentificationNumberTextBox, dataTable.cell(1, 1)); // Local Identification Number
        CommonMethods.click(studentAdmissionPage.rteRadioButton(dataTable.cell(1, 2))); // RTE
    }

    /**
     * Adds information in the block.
     *
     * @param headerText The header text of the block.
     * @param dataTable  The DataTable containing the information to be added.
     */
    public static void user_adds_information_in_the_block(String headerText, DataTable dataTable) {
        CommonMethods.click(studentAdmissionPage.addMoreBoxPlusButton);
        JavascriptMethods.scrollIntoView(studentAdmissionPage.addMoreBoxPlusButton);
        CommonMethods.assertTrue(studentAdmissionPage.studentAdmissionHeader.isDisplayed());
        CommonMethods.assertEquals(studentAdmissionPage.studentAddressDetailsHeader.getText(), headerText);
        if (dataTable.cell(0, 1).contains("true")) { // If Guardian Address is Current Address
            CommonMethods.click(studentAdmissionPage.ifGuardianAddressIsCurrentAddressCheckbox);
        }
        CommonMethods.sendKeys(studentAdmissionPage.currentAddressTextBox, dataTable.cell(1, 1)); // Current Address
        if (dataTable.cell(2, 1).contains("true")) { // If Permanent Address is Current Address
            CommonMethods.click(studentAdmissionPage.ifPermanentAddressIsCurrentAddressCheckBox);
        }
        CommonMethods.sendKeys(studentAdmissionPage.permanentAddressTextBox, dataTable.cell(3, 1)); // Permanent Address
    }

    /**
     * Adds information in the third row of the section.
     *
     * @param headerText The header text of the section.
     * @param dataTable  The DataTable containing the information to be added.
     */
    public static void user_adds_information_in_the_third_row_of_the_section(String headerText, DataTable dataTable) {
        CommonMethods.assertEquals(studentAdmissionPage.miscellaneousDetailsHeader.getText(), headerText);
        CommonMethods.sendKeys(studentAdmissionPage.previousSchoolDetailsTextBox, dataTable.cell(1, 0)); // Previous School Details
        CommonMethods.sendKeys(studentAdmissionPage.noteTextBox, dataTable.cell(1, 1)); // Note
    }

    /**
     * Fills out all text fields and uploads files in the specified section.
     *
     * @param sectionName The name of the section to fill out.
     * @param dataTable   The DataTable containing the data to be filled in the section.
     */
    public static void fills_out_all_text_fields_and_uploads_files_in_the_section(String sectionName, DataTable dataTable) {
        CommonMethods.assertTrue(studentAdmissionPage.uploadDocumentsHeaderText.isDisplayed());
        CommonMethods.assertEquals(studentAdmissionPage.uploadDocumentsHeaderText.getText(), sectionName);
        CommonMethods.sendKeys(studentAdmissionPage.titleOneTextBox, (dataTable.cell(1, 0))); // Title #1
        CommonMethods.sendKeys(studentAdmissionPage.documentOneTextBox, Constants.VANDER_PHOTO); // Document #1
        CommonMethods.sendKeys(studentAdmissionPage.titleTwoTextBox, (dataTable.cell(1, 1))); // Title #2
        CommonMethods.sendKeys(studentAdmissionPage.documentTwoTextBox, Constants.MEDARDA_PHOTO); // Document #2
        CommonMethods.sendKeys(studentAdmissionPage.titleThreeTextBox, (dataTable.cell(1, 2))); // Title #3
        CommonMethods.sendKeys(studentAdmissionPage.documentThreeTextBox, Constants.VICTOR_PHOTO); // Document #3
        CommonMethods.sendKeys(studentAdmissionPage.titleFourTextBox, (dataTable.cell(1, 3))); // Title #4
        CommonMethods.sendKeys(studentAdmissionPage.documentFourTextBox, Constants.JAYCE_PHOTO); // Document #4
    }

    /**
     * User is searching for a student record based on parameters.
     *
     * @param dataTable The data table containing the parameters for the search.
     */
    public static void user_is_searching_for_a_student_record_based_on_parameters(DataTable dataTable) {
        CommonMethods.selectDropDownValue((dataTable.cell(0, 1)), searchPage.classDropDown); // Class
        CommonMethods.selectDropDownValue(dataTable.cell(1, 1), searchPage.sectionDropDown); // Section
        CommonMethods.sendKeys(searchPage.searchByKeywordTextBox, dataTable.cell(2, 1)); // Admission Number
        CommonMethods.click(searchPage.searchButton);
    }

    /**
     * Makes sure that the entry corresponding to the provided admission number is present in the list.
     *
     * @param admissionNumber The admission number of the entry to be checked.
     * @param dataTable       A DataTable object containing the entry details in the form of key-value pairs.
     */
    public static void make_sure_the_entry_is_in_the_list(String admissionNumber, DataTable dataTable) {
        CommonMethods.assertTrue(SearchPage.tableLocatorByText(admissionNumber).isDisplayed());
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));

        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        for (int i = 1; i <= dataTable.height(); i++) {
            WebElement element = SearchPage.informationAboutTheStudentOnTheSearchPage(admissionNumber, i);
            actualData.add(element.getText().trim());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Verifies the information in the student name block.
     *
     * @param dataTable The data table containing the expected student name data.
     */
    public static void verifies_the_information_in_the_student_name_block(DataTable dataTable) {
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        actualData.add(StudentDetailsPage.studentNametext.getText());
        for (int i = 0; i < (dataTable.height() - 1); i++) {
            actualData.add(StudentDetailsPage.dynamicXpathForTheStudentNameBlock(expectedData.get(0), i).getText());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Verifies the data from the displayed block.
     *
     * @param expectedSiblingBlockName The expected name of the sibling block.
     * @param dataTable                The DataTable object containing the expected data.
     */
    public static void if_the_block_is_displayed_verifies_the_data_from_that_block(String expectedSiblingBlockName, DataTable dataTable) {
        try {
            if (studentDetailsPage.siblingHeaderText.isDisplayed()) {
                CommonMethods.assertEquals(studentDetailsPage.siblingHeaderText.getText(), expectedSiblingBlockName);
                // Expected Data
                ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
                // Actual Data
                ArrayList<String> actualData = new ArrayList<>();
                actualData.add(StudentDetailsPage.siblungNameText.getText());
                for (int i = 0; i < (dataTable.height() - 1); i++) {
                    actualData.add(StudentDetailsPage.dynamicXpathForTheSiblingBlock(i).getText());
                }
                Assert.assertEquals(actualData, expectedData);
            }
        } catch (NoSuchElementException e) {
            System.out.println("expectedSiblingBlockName not found");
        }
    }

    /**
     * Checks the data from the first block under the tab.
     *
     * @param expectedText The expected text of the profile tab.
     * @param dataTable    The DataTable containing the expected data of the first block.
     */
    public static void checks_the_data_from_the_first_block_under_the_tab(String expectedText, DataTable dataTable) {
        CommonMethods.assertEquals(StudentDetailsPage.profileTab.getText(), expectedText);
        CommonMethods.click(StudentDetailsPage.profileTab);
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        for (int i = 0; i < dataTable.height(); i++) {
            actualData.add(studentDetailsPage.dynamicXpathFirstBlockProfile(i).getText());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Checks the data from the seconds block.
     *
     * @param expectedBlockName The expected header text of the block.
     * @param dataTable          The DataTable containing the expected data.
     */
    public static void checks_the_data_from_the_seconds_block(String expectedBlockName, DataTable dataTable) {
        CommonMethods.assertEquals(StudentDetailsPage.addressBlockHeader.getText(), expectedBlockName);
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        for (int i = 1; i <= dataTable.height(); i++) {
            actualData.add(StudentDetailsPage.dynamicXpathSecondBlockProfile(expectedBlockName, i).getText());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Checks the data from the third block.
     *
     * @param expectedBlockName The expected header text of the block.
     * @param dataTable          The DataTable containing the expected data.
     */
    public static void checks_the_data_from_the_third_block(String expectedBlockName, DataTable dataTable) {
        CommonMethods.assertEquals(StudentDetailsPage.parentOrGuardianBlockHeader.getText(), expectedBlockName);
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        for (int i = 1; i <= dataTable.height(); i++) {
            actualData.add(StudentDetailsPage.dynamicXpathThirdBlockProfile(expectedBlockName, i).getText());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Checks the data from the fourth block.
     *
     * @param expectedBlockName The expected header text of the block.
     * @param dataTable          The DataTable containing the expected data.
     */
    public static void checks_the_data_from_the_fourth_block(String expectedBlockName, DataTable dataTable) {
        CommonMethods.assertEquals(StudentDetailsPage.miscallaneousDetailsBlockHeafer.getText(), expectedBlockName);
        // Expected Data
        ArrayList<String> expectedData = new ArrayList<>(dataTable.column(1));
        // Actual Data
        ArrayList<String> actualData = new ArrayList<>();
        for (int i = 1; i <= dataTable.height(); i++) {
            actualData.add(studentDetailsPage.dynamicXpathFourthBlockProfile(expectedBlockName, i).getText());
        }
        Assert.assertEquals(actualData, expectedData);
    }

    /**
     * Navigates the user to the detailed student information page based on the provided admission number.
     *
     * @param adminssionNumber The admission number of the student.
     */
    public static void the_user_navigates_to_the_detailed_student_information_page(String adminssionNumber, String url) {
        CommonMethods.click(SearchPage.studentNameByAdmissionNumber(adminssionNumber));
        CommonMethods.assertTrue(driver.getCurrentUrl().contains(url));
    }

    /**
     * Deletes a student record based on the provided admission number.
     *
     * @param admissionNumber The admission number of the student record to be deleted.
     */
    public static void user_selects_student_admission_number_and_deletes_it(String admissionNumber) {
        CommonMethods.waitForClickability(EditPage.dynamicRecordLocateDelete(admissionNumber));
        JavascriptMethods.scrollIntoView(EditPage.dynamicRecordLocateDelete(admissionNumber));
        Assert.assertEquals(editPage.admissionNumber.getText(), editPage.admissionNumber.getText());
        EditPage.dynamicRecordLocateDelete(admissionNumber).click();
        CommonMethods.click(editPage.deleteButton);
        CommonMethods.acceptAlert();
    }
}


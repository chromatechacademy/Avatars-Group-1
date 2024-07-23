package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Map;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentAdmissionPage {

    DashboardPage dashboardPage = new DashboardPage();

    public StudentAdmissionPage() {
        PageFactory.initElements(driver, this);
    }

    // Student Admission hearder
    @FindBy(xpath = "//h4[contains(text(), 'Student Admission')]")
    public WebElement studentAdmissionHeader;

    // Admission Number textBox
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    // Class dropDown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Section dropDown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // FirstName textBox
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    // LastName textBox
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    // Gender dropDown
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    // Date of Birth textBox
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    // Father Name textBox
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    // Dynamic If Guardian Is radioButton
    public static WebElement dynamicIfGuardianRadioButton(String text) {
        return driver.findElement(By.xpath("//input[@value='" + text.toLowerCase() + "']"));
    }

    // Guardian Name textBox
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    // Guardian Relation textBox
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    // Guardian Phone textBox
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    // Guardian Occupation textBox
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    // Save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    // "The Admission No field must contain a unique value" errorText
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement errorText;

    // "Record Saved Successfully" text
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement textOfSuccess;

    // Roll Number textBox
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    // Category dropDown
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    // Email textBox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    // Bloog Group dropDown
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    // Mobile Number textBox
    @FindBy(xpath = "//div[5]//div[1]//div[1]//input[1]")
    public WebElement mobileNumberTextBox;

    // Height textBox
    @FindBy(xpath = "//div[5]//div[2]//div[1]//input[1]")
    public WebElement heightTextBox;

    // Weight textBox
    @FindBy(xpath = "//div[5]//div[3]//div[1]//input[1]")
    public WebElement weightTextBox;

    // Father Phone textBox
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    // Father Occupation textBox
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    // Mother Name textBox
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    // Mother Phone textBox
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    // Mother Occupation textBox
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    // Admission Date textBox
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    // Student Photo uplaodFileButton
    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement studentPhotoUpload;

    // Father Photo uploadFileButton
    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement fatherPhotoUpload;

    // Mother Photo uploadFile button
    @FindBy(xpath = "(//input[@type='file'])[3]")
    public WebElement motherPhotoUpload;

    // Guardian Photo uploadFile button
    @FindBy(xpath = "(//input[@type='file'])[4]")
    public WebElement guardianPhotoUpload;

    // As on Date textBox
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    // Add Sibling button
    @FindBy(xpath = "//button[normalize-space()='Add Sibling']")
    public WebElement addSiblingButton;

    // Class dropDown In The Sibling modal dialog
    @FindBy(xpath = "//select[@id='sibiling_class_id']")
    public WebElement classDropDownInTheSiblingModalDialog;

    // Section dropDown In The Sibling modal dialog
    @FindBy(xpath = "//select[@id='sibiling_section_id']")
    public WebElement sectionDropDownInTheSiblingModalDialog;

    // Student dropDown In The Sibling modal dialog
    @FindBy(xpath = "//select[@id='sibiling_student_id']")
    public WebElement studentDropDownInTheSiblingModalDialog;

    // Add button In The Siblings modal dialog
    @FindBy(xpath = "//button[@id='load']")
    public WebElement addButtonInTheSiblingModalDialog;

    // Sibling Name text
    @FindBy(xpath = "//span[@id='sibling_name']")
    public WebElement siblingNameText;

    // Previous School Details textBox
    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolDetailsTextBox;

    // Note textBox
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    // Guardian Email textBox
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    // Guardian Address textBox
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    // Add More Details box plus button
    @FindBy(xpath = "//a[@class='collapsed btn boxplus']")
    public WebElement addMoreBoxPlusButton;

    // Student Address Details header
    @FindBy(xpath = "//h4[contains(text(), 'Student Address Details')]")
    public WebElement studentAddressDetailsHeader;

    // If Guardian Address is Current Address checkBox
    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement ifGuardianAddressIsCurrentAddressCheckbox;

    // Current Address textBox
    @FindBy(xpath = "//textarea[@id='current_address']")
    public WebElement currentAddressTextBox;

    // If Permanent Address is Current Address checkBox;
    @FindBy(xpath = "//input[@id='autofill_address']")
    public WebElement ifPermanentAddressIsCurrentAddressCheckBox;

    // Permanent Address textBox
    @FindBy(xpath = "//textarea[@id='permanent_address']")
    public WebElement permanentAddressTextBox;

    // Miscellaneous Details header
    @FindBy(xpath = "//h4[normalize-space()='Miscellaneous Details']")
    public WebElement miscellaneousDetailsHeader;

    // Bank Account Number textBox
    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountNumberTextBox;

    // Bank Name textBox
    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameTextBox;

    // IFSC Code textBox
    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement iFSCCodetextBox;

    // National Identification Number textBox
    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIdentificationNumberTextBox;

    // Local Identification Number textBox
    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIdentificationNumberTextBox;

    // Dynamic RTE radioButtons
    public static WebElement rteRadioButton(String text) {
        return driver.findElement(By.xpath("//input[@value='" + text + "']"));
    }

    // Upload Documents Header textElement
    @FindBy(xpath = "//h4[text()='Upload Documents']")
    public WebElement uploadDocumentsHeaderText;

    // Title #1 textBox
    @FindBy(xpath = "(//input[contains(@name,'title')])[1]")
    public WebElement titleOneTextBox;

    // Title #2 textBox
    @FindBy(xpath = "(//input[contains(@name,'title')])[2]")
    public WebElement titleTwoTextBox;

    // Title #3 textBox
    @FindBy(xpath = "(//input[contains(@name,'title')])[3]")
    public WebElement titleThreeTextBox;

    // Title #4 textBox
    @FindBy(xpath = "(//input[contains(@name,'title')])[4]")
    public WebElement titleFourTextBox;

    // Doc #1 upload textBox
    @FindBy(xpath = "(//input[contains(@name,'doc')])[1]")
    public WebElement documentOneTextBox;

    // Doc #2 upload textBox
    @FindBy(xpath = "(//input[contains(@name,'doc')])[2]")
    public WebElement documentTwoTextBox;

    // Doc #3 upload textBox
    @FindBy(xpath = "(//input[contains(@name,'doc')])[3]")
    public WebElement documentThreeTextBox;

    // Doc #4 upload textBox
    @FindBy(xpath = "(//input[contains(@name,'doc')])[4]")
    public WebElement documentFourTextBox;

    /**
     * Concatenates the first name and last name with the roll number to create a sibling name.
     *
     * @param firstName  the first name of the sibling
     * @param lastName   the last name of the sibling
     * @param rollNumber the roll number of the sibling
     * @return the sibling name in the format: firstName + lastName + "(" + rollNumber + ")"
     */
    public static String creatingSiblingName(String firstName, String lastName, String rollNumber) {
        return firstName + " " + lastName + " (" + rollNumber + ") ";
    }

    /**
     * Fills in the fields in a specific section of the user interface.
     *
     * @param headerName the name of the header in the section
     * @param dataTable  the data table containing the values for the fields
     */
    public void user_fills_in_the_fields_in_the_section(String headerName, DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            if (!(dashboardPage.findSubModuleByText((data.get("SubModule"))).isDisplayed())) {
                CommonMethods.click(dashboardPage.findModuleByText(data.get("Module")));
            }
            CommonMethods.click(dashboardPage.findSubModuleByText((data.get("SubModule"))));
            CommonMethods.assertEquals(driver.getCurrentUrl(), (data.get("URL")));
            CommonMethods.assertEquals(studentAdmissionHeader.getText(), headerName);
            CommonMethods.sendKeys(admissionNumberTextBox, data.get("Admission No"));
            CommonMethods.sendKeys(rollNumberTextBox, data.get("Roll Number"));
            CommonMethods.selectDropDownValue(data.get("Class"), classDropDown);
            CommonMethods.selectDropDownValue(data.get("Section"), sectionDropDown);
            CommonMethods.sendKeys(firstNameTextBox, data.get("First Name"));
            CommonMethods.sendKeys(lastNameTextBox, data.get("Last Name"));
            CommonMethods.selectDropDownValue(data.get("Gender"), genderDropDown);
            JavascriptMethods.selectDateByJS(dateOfBirthTextBox, data.get("Date of Birth"));
            CommonMethods.selectDropDownValue(data.get("Category"), categoryDropDown);
            CommonMethods.sendKeys(emailTextBox, data.get("Email"));
            JavascriptMethods.selectDateByJS(admissionDateTextBox, data.get("Admission Date"));
            CommonMethods.sendKeys(studentPhotoUpload, CommonMethods.findFile(data.get("Student Photo")));
            CommonMethods.selectDropDownValue(data.get("Blood Group"), bloodGroupDropDown);
            JavascriptMethods.selectDateByJS(asOnDateTextBox, data.get("As on Date"));
            CommonMethods.sendKeys(mobileNumberTextBox, data.get("Mobile Number"));
            CommonMethods.sendKeys(heightTextBox, data.get("Height"));
            CommonMethods.sendKeys(weightTextBox, data.get("Weight"));
        }
    }

    /**
     * Adds a sibling using the add sibling button.
     *
     * @param text      the text that should be displayed on the add sibling button
     * @param dataTable the data table containing the sibling information
     */
    public void user_adds_a_sibling_using_the_button(String text, DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.assertEquals(addSiblingButton.getText(), text);
            CommonMethods.click(addSiblingButton);
            CommonMethods.selectDropDownValue(data.get("Sibling Class"), classDropDownInTheSiblingModalDialog);
            CommonMethods.selectDropDownValue(data.get("Sibling Section"), sectionDropDownInTheSiblingModalDialog);
            CommonMethods.selectDropDownValue(creatingSiblingName(data.get("Sibling First Name"), data.get("Sibling Last Name"), data.get("Sibling Roll Number")), studentDropDownInTheSiblingModalDialog);
            CommonMethods.click(addButtonInTheSiblingModalDialog);
            CommonMethods.waitForVisibility(siblingNameText);
            JavascriptMethods.scrollIntoView(siblingNameText);
            System.out.println(siblingNameText.getText());
            CommonMethods.assertEquals(siblingNameText.getText(), "Sibling: " + data.get("Sibling First Name") + " " + data.get("Sibling Last Name"));
        }
    }

    /**
     * Adds father's information to the user interface.
     *
     * @param dataTable The data table containing the father's information.
     */
    public void user_adds_father_s_information(DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            JavascriptMethods.scrollIntoView(fatherNameTextBox);
            CommonMethods.sendKeys(fatherNameTextBox, data.get("Father Name"));
            CommonMethods.sendKeys(fatherPhoneTextBox, data.get("Father Phone"));
            CommonMethods.sendKeys(fatherOccupationTextBox, data.get("Father Occupation"));
            CommonMethods.sendKeys(fatherPhotoUpload, CommonMethods.findFile((data.get("Father Photo"))));
        }
    }

    /**
     * Adds mother's information to the user interface.
     *
     * @param dataTable The DataTable containing the mother's information.
     */
    public void user_adds_mothers_s_information(DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.sendKeys(motherNameTextBox, data.get("Mother Name"));
            CommonMethods.sendKeys(motherPhoneTextBox, data.get("Mother Phone"));
            CommonMethods.sendKeys(motherOccupationTextBox, data.get("Mother Occupation"));
            CommonMethods.sendKeys(motherPhotoUpload, CommonMethods.findFile((data.get("Mother Photo"))));
        }
    }

    /**
     * Adds guardian's information to the user interface.
     *
     * @param dataTable The DataTable containing the guardian's information.
     */
    public void user_adds_guardian_s_information(DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.click(dynamicIfGuardianRadioButton((data.get("If Guardian Is"))));
            CommonMethods.sendKeys(guardianNameTextBox, data.get("Guardian Name"));
            CommonMethods.sendKeys(guardianRelationTextBox, data.get("Guardian Relation"));
            CommonMethods.sendKeys(guardianEmailTextBox, data.get("Guardian Email"));
            CommonMethods.sendKeys(guardianPhotoUpload, CommonMethods.findFile((data.get("Guardian Photo"))));
            CommonMethods.sendKeys(guardianPhoneTextBox, data.get("Guardian Phone"));
            CommonMethods.sendKeys(guardianOccupationTextBox, data.get("Guardian Occupation"));
            CommonMethods.sendKeys(guardianAddressTextBox, data.get("Guardian Address"));
        }
    }

    /**
     * Adds information in the specific block of the user interface.
     *
     * @param headerText the text of the header in the block
     * @param dataTable  the data table containing the information to be added
     */
    public void user_addis_information_in_the_block(String headerText, DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.click(addMoreBoxPlusButton);
            JavascriptMethods.scrollIntoView(addMoreBoxPlusButton);
            CommonMethods.assertTrue(studentAdmissionHeader.isDisplayed());
            CommonMethods.assertEquals(studentAddressDetailsHeader.getText(), headerText);
            if (data.get("If Guardian Address is Current Address").contains("true")) {
                CommonMethods.click(ifGuardianAddressIsCurrentAddressCheckbox);
            }
            CommonMethods.sendKeys(currentAddressTextBox, data.get("Current Address"));
            if (data.get("If Permanent Address is Current Address").contains("true")) {
                CommonMethods.click(ifPermanentAddressIsCurrentAddressCheckBox);
            }
            CommonMethods.sendKeys(permanentAddressTextBox, data.get("Permanent Address"));
        }
    }

    /**
     * Adds information in the specific section of the user interface.
     *
     * @param headerText the text of the header in the section
     * @param dataTable  the data table containing the information to be added
     */
    public void user_addins_information_in_the_section(String headerText, DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.assertEquals(miscellaneousDetailsHeader.getText(), headerText);
            JavascriptMethods.scrollIntoView(miscellaneousDetailsHeader);
            CommonMethods.sendKeys(bankAccountNumberTextBox, data.get("Bank Account Number"));
            CommonMethods.sendKeys(bankNameTextBox, data.get("Bank Name"));
            CommonMethods.sendKeys(iFSCCodetextBox, data.get("IFSC Code"));
            CommonMethods.sendKeys(nationalIdentificationNumberTextBox, data.get("National Identification Number"));
            CommonMethods.sendKeys(localIdentificationNumberTextBox, data.get("Local Identification Number"));
            CommonMethods.click(rteRadioButton(data.get("RTE")));
            CommonMethods.sendKeys(previousSchoolDetailsTextBox, data.get("Previous School Details"));
            CommonMethods.sendKeys(noteTextBox, data.get("Note"));
        }
    }

    /**
     * Fills out all text fields and uploads files in the specified section.
     *
     * @param sectionName the name of the section in which to fill out the fields
     * @param dataTable   the DataTable containing the values for the fields to be filled out
     */
    public void fills_out_all_text_fields_and_uploads_files_in_the_section(String sectionName, DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.assertTrue(uploadDocumentsHeaderText.isDisplayed());
            CommonMethods.assertEquals(uploadDocumentsHeaderText.getText(), sectionName);
            CommonMethods.sendKeys(titleOneTextBox, (data.get("Title #1")));
            CommonMethods.sendKeys(documentOneTextBox, CommonMethods.findFile((data.get("Document #1"))));
            CommonMethods.sendKeys(titleTwoTextBox, (data.get("Title #2")));
            CommonMethods.sendKeys(documentTwoTextBox, CommonMethods.findFile((data.get("Document #2"))));
            CommonMethods.sendKeys(titleThreeTextBox, (data.get("Title #3")));
            CommonMethods.sendKeys(documentThreeTextBox, CommonMethods.findFile((data.get("Document #3"))));
            CommonMethods.sendKeys(titleFourTextBox, (data.get("Title #4")));
            CommonMethods.sendKeys(documentFourTextBox, CommonMethods.findFile((data.get("Document #4"))));
        }
    }

    /**
     * Saves the submission and verifies the success message or error message displayed.
     */
    public void saves_submission() {
        CommonMethods.click(saveButton);
        if (CommonMethods.isElementDisplayed(textOfSuccess)) {
            CommonMethods.assertEquals(textOfSuccess.getText(), "Record Saved Successfully");

        } else if (CommonMethods.isElementDisplayed(errorText)) {
            CommonMethods.assertEquals(errorText.getText(), "The Admission No field must contain a unique value.");
        }
    }
}
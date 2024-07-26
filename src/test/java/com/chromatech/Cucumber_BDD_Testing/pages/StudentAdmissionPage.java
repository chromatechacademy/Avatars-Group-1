package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentAdmissionPage {

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
}
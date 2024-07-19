package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    // Admission Number TextBox
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    // Class dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Section dropdown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // FirstName TextBox
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    // LastName TextBox
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    // Gender DropDown
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    // Date of Birth textbox
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement calendarTextBox;

    // Father Name TextBox
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    // Father RadioButton
    @FindBy(xpath = "//div[@class='bozero']//label[2]")
    public WebElement fatherRadioButton;

    // Guardian Phone Number TextBox
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;

    // Save Button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    // Error text
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement errorText;

    // Student Details SubModule
    @FindBy(xpath = "(//a[@href=\"https://mexil.it/chroma/student/search\"])[2]")
    public WebElement studentDetailsSubModule;

    // "Record Saved Successfully" text
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement textOfSuccess;

    // Roll Number textbox
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    // Category dropdown
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    // Email textBox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    // Bloog Group dropdown
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    // Mobile Number textBox
    @FindBy(xpath = "//div[5]//div[1]//div[1]//input[1]")
    public WebElement mobileNumberTextBox;

    // Height textbox
    @FindBy(xpath = "//div[5]//div[2]//div[1]//input[1]")
    public WebElement heightTextBox;

    // Weight textbox
    @FindBy(xpath = "//div[5]//div[3]//div[1]//input[1]")
    public WebElement weightTextBox;

    // Father Phone TextBox
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    // Father Occupation textbox
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    // Mother Name textbox
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    // Mother Phone textbox
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    // Mother Occupation textbox
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    // Admisson Date textbox
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    // As on Date textbox
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    // Guardian Email textbox
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    // Guardian Address textbox
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;


}

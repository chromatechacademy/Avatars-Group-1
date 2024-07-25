package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentAdmissionPage {

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
        return driver.findElement(By.xpath("//input[@value='" + text + "']"));
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

    // Guardian Phone Number textBox
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;

    // Save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    // "The Admission No field must contain a unique value" errorText
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement errorText;

    // Student Details subModule
    @FindBy(xpath = "(//a[@href=\"https://mexil.it/chroma/student/search\"])[2]")
    public WebElement studentDetailsSubModule;

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

    // As on Date textBox
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    // Guardian Email textBox
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    // Guardian Address textBox
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;


    public StudentAdmissionPage() {
        PageFactory.initElements(driver, this);
    }
}

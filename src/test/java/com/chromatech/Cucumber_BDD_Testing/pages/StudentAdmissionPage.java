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

    // Calendar TextBox
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement calendarTextBox;

    // Father Name TextBox
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    // Father RadioButton
    @FindBy(xpath = "//div[@class='bozero']//label[2]")
    public WebElement fatherRadioButton;

    // Guardian Name TextBox
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

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

}

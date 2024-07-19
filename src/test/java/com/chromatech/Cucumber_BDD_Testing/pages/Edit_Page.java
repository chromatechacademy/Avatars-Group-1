package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Edit_Page {

    public Edit_Page() {
        PageFactory.initElements(driver, this);
    }

    //Edit Student Header
    @FindBy(xpath = "//h3[normalize-space()='Edit Student']")
    public WebElement editStudentHeader;

    //Admission No Text Box
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    //Roll Number Text Box
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    //Class Drop Down
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    //Section Drop Down
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    //First Name Text Box
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    //Last Name Text Box
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    //Gender Drop Down
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    //DOB
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dob;

    //Category Drop Down
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    //Email Text Box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    //Admission Date
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDate;

    //Student Photo
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhoto;

    //Blood Group Drop Down
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    //As On Date
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement AsOnDate;

    //Mobile Number Text Box
    @FindBy(css = "input[id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    //Height Text Box
    @FindBy(css = "input[id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    //Father Name Text Box
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    //Phone No Text Box
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement phoneNoTextBox;

    //Father Occupation Text Box
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    //Father Photo
    @FindBy(xpath = "//input[@name='father_pic']")
    public WebElement fatherPhoto;

    //Mother Name Text Box
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    //Mother Phone Text Box
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherNoTextBox;

    //Mother Occupation Text Box
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement MotherOccupationTextBox;

    //Mother Photo
    @FindBy(xpath = "//input[@name='mother_pic']")
    public WebElement MotherPhoto;

    //If Guardian Is
    @FindBy(xpath = "//input[@value='father']")
    public WebElement IfGuardianIs;

    //Guardian Name Text Box
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement GaurdianNameTextBox;

    //Guardian Relation Text Box
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement GuardianRelationTextBox;

    //Guardian Email Text Box
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement GuardianEmailTextBox;

    //Guardian Photo
    @FindBy(xpath = "//input[@name='guardian_pic']")
    public WebElement GuardianPhoto;

    //Guardian Phone Text Box
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public  WebElement GuardianPhoneTextBox;

    //Guardian Occupation Text Box
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement GuardianOccupationTextBox;

    //Guardian Address Text Box
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement GuardianAddressTextBox;



}

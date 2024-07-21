package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
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

    //Date of Birth Text Box
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    //Category Drop Down
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    //Email Text Box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    //Admission Date Text Box
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    //Student Photo
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhoto;

    //Blood Group Drop Down
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    //As On Date Text Box
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    //Mobile Number Text Box
    @FindBy(css = "input[id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    //Height Text Box
    @FindBy(css = "input[id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    //Weight Text Box
    @FindBy(xpath = "//div[5]//div[3]//div[1]//input[1]")
    public WebElement weightTextBox;

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
    public WebElement motherOccupationTextBox;

    //Mother Photo
    @FindBy(xpath = "//input[@name='mother_pic']")
    public WebElement MotherPhoto;

    // Dynamic If Guardian Is radioButton
    public static WebElement dynamicIfGuardianRadioButton(String text) {
        return driver.findElement(By.xpath("//input[@value='" + text + "']"));
    }

    //Guardian Name Text Box
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    //Guardian Relation Text Box
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    //Guardian Email Text Box
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    //Guardian Photo
    @FindBy(xpath = "//input[@name='guardian_pic']")
    public WebElement guardianPhoto;

    //Guardian Phone Text Box
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public  WebElement guardianPhoneTextBox;

    //Guardian Occupation Text Box
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    //Guardian Address Text Box
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;



}

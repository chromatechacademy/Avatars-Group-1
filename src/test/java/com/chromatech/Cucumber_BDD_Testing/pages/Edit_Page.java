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

    //Admission No
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNo;

    //Roll Number
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumber;

    //First Name
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    //Last Name
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    //Email
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    //Mobile Number
    @FindBy(css = "input[id='custom_fields[students][1]']")
    public WebElement mobileNumber;

    //Height
    @FindBy(css = "input[id='custom_fields[students][2]']")
    public WebElement height;

    //Father Name
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherName;

    //Phone No
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement phoneNo;

    //Father Occupation
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupation;

    //Mother Name
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherName;

    //Mother Phone
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherNo;

    //Mother Occupation
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement MotherOccupation;

    //Guardian Name
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement GaurdianName;

    //Guardian Relation
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement GuardianRelation;

    //Guardian Email
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement GuardianEmail;

    //Guardian Phone
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public  WebElement GuardianPhone;

    //Guardian Occupation
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement GuardianOccupation;

    //Guardian Address
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement GaurdianAddress;



}

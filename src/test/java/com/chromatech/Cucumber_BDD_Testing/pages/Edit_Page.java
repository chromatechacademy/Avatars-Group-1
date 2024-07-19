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

    //

}

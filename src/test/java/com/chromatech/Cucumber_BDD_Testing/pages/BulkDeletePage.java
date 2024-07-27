package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class BulkDeletePage {

    public BulkDeletePage() {
        PageFactory.initElements(driver, this);
    }

    // Class dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropdown;

    // Section dropdown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // Search button
    @FindBy(xpath = "//button[normalize-space()='Search']//i[@class='fa fa-search']")
    public WebElement searchButton;

    // Dynamic XPATH for checkBoxes
    public static WebElement dynamicXpathForCheckboxes(String admissionNumber) {
        return driver.findElement(By.xpath("//td[text()='" + admissionNumber + "']//parent::tr/td[1]/input[@type='checkbox']"));
    }

    // Delete button
    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    // Dynamic xpath to find a record by Admission Number
    public static WebElement dynamicXpathFindByAdmissionNumber(String number) {
        return driver.findElement(By.xpath("//td[text()='" + number + "']"));
    }

}
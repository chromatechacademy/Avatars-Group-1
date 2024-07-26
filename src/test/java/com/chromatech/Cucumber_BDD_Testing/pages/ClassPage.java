package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class ClassPage {

    public ClassPage() {
        PageFactory.initElements(driver, this);
    }

    //Class Text Box
    @FindBy(xpath = "//input[@id='class']")
    public WebElement classTextBox;

    //Selects Sections Check Box
    @FindBy(xpath = "//label[normalize-space()='Selenium Test Automation']")
    public WebElement sectionsCheckBox;

    //Click on Save Button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

}


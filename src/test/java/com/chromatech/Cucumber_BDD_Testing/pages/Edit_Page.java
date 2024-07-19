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



}

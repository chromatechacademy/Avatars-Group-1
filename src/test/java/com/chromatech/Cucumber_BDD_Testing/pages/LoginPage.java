package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    // UserName TextBox
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement userNameTextBox;

    // Password TextBox
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextBox;

    // Sign In button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

}

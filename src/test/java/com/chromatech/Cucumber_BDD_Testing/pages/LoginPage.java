package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    // Username textBox
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;

    // Password textBox
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    // SignIn button
    @FindBy(xpath = " //button[normalize-space()='Sign In']")
    public WebElement signInButton;

    // Error message text
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;
}
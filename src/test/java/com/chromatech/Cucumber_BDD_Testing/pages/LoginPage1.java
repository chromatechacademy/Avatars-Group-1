package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

    /* USERNAME TEXT BOX*/

    @FindBy(xpath = "//input[@placeholder='Username']")
    public static WebElement usernameTextBox;

    /* PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement passwordTextBox;

    /* SIGN IN BUTTON*/
    @FindBy(xpath = " //button[normalize-space()='Sign In']")
    public static WebElement signInButton;



    public LoginPage1() {PageFactory.initElements(WebDriverUtils.driver, this);}

}


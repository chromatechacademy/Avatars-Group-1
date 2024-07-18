package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /* USERNAME TEXT BOX*/
    @FindBy(xpath = "//input[@placeholder='Username']")
    public  WebElement usernameTextBox;

    /* PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* SIGN IN BUTTON*/
    @FindBy(xpath = " //button[normalize-space()='Sign In']")
    public  WebElement signInButton;

    public LoginPage() {PageFactory.initElements(WebDriverUtils.driver, this);}
//
//    @FindBy(xpath = "//li[contains(@class,'active')]//a[contains(@href,'#')]")
//    public WebElement Howorkbutton;
//
//    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
//    public WebElement AddHomeworkButton;

}
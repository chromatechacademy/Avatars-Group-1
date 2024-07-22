package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class LoginPage {

    public LoginPage() {PageFactory.initElements(WebDriverUtils.driver, this);}

    /* USERNAME TEXT BOX*/
    @FindBy(xpath = "//input[@placeholder='Username']")
    public  WebElement usernameTextBox;

    /* PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* SIGN IN BUTTON*/
    @FindBy(xpath = " //button[normalize-space()='Sign In']")
    public  WebElement signInButton;

    /*ERROR MESSAGE*/
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;

    /**
     * Logs in a user to the main page of the CT SMS application.
     *
     * @param url The expected URL of the main page after logging in
     */
    public void a_ctsms_user_is_logged_in_to_the_main_page(String url) {
        driver.get("https://mexil.it/chroma/admin/admin/dashboard");
        CommonMethods.sendKeys(usernameTextBox, "general@teacher.com");
        CommonMethods.sendKeys(passwordTextBox, "123456");
        CommonMethods.click(signInButton);
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }


}
package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage1;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class My_First_Group_Project_steps {
    LoginPage1 loginPage1 = new LoginPage1();


    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    @When("the user enters username {string} in username text box")
    public void the_user_enters_username_in_username_text_box(String username) {
        LoginPage1.usernameTextBox.sendKeys(username);
    }

    @When("the user enters password {string} in password text box")
    public void the_user_enters_password_in_password_text_box(String password) {
        LoginPage1.passwordTextBox.sendKeys(password);
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        LoginPage1.signInButton.click();
    }

    @Then("the user is successfully directed to the dashboard page {string}")
    public void the_user_is_successfully_directed_to_the_dashboard_page(String expectedUrl) {
        String actualUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }






}

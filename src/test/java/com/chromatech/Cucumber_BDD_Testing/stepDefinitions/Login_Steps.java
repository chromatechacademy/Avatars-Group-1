package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;


public class Login_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_vlad_or_admin_is_on_the_login_page(String url) {
        driver.get(url);
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("user enters {string} in the login field")
    public void vlad_enters_in_the_login_field(String login) {
        CommonMethods.sendKeys(loginPage.userNameTextBox, login);
    }

    @When("enters {string} in the password field")
    public void enters_in_the_password_field(String password) {
        CommonMethods.sendKeys(loginPage.passwordTextBox, password);
    }

    @When("clicks on the Sing In button")
    public void clicks_on_the_sing_in_button() {
        CommonMethods.click(loginPage.signInButton);
    }

    @Then("the user is successfully directed to the dashboard page {string}")
    public void the_user_is_successfully_directed_to_the_dashboard_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }
}

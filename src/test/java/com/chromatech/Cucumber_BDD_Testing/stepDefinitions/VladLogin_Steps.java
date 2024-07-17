package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.chromatech.utils.WebDriverUtils.driver;

public class VladLogin_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(String url) {
        driver.get(url);
    }

    @When("the user logs in with valid credentials {string} and {string}")
    public void the_user_logs_in_with_valid_credentials_and(String login, String password) {
        CommonMethods.sendKeys(loginPage.userNameTextBox, login);
        CommonMethods.sendKeys(loginPage.passwordTextBox, password);
        loginPage.signInButton.click();
    }

    @Then("the user is successfully directed to the dashboard page {string}")
    public void the_user_is_successfully_directed_to_the_dashboard_page(String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        CommonMethods.sleep(1000);
    }
}

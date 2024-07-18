package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import org.testng.Assert;


import static com.chromatech.utils.WebDriverUtils.driver;

public class Security_Mechanism_ForInvalid_Credentials_Login_steps {

    LoginPage loginPage = new LoginPage();

    @Then("the user remains on the login page {string}")
    public void the_user_remains_on_the_login_page(String expectedUrl) {
        CommonMethods.assertEquals(CommonMethods.driver.getCurrentUrl(),expectedUrl);
    }

    @Then("an error message is displayed")
    public void an_error_message_is_displayed() {
      CommonMethods.assertTrue(loginPage.errorMessage.isDisplayed());
    }
    }




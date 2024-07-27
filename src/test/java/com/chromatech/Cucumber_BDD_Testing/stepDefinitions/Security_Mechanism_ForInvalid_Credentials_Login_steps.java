package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class Security_Mechanism_ForInvalid_Credentials_Login_steps extends PageInitializer {

    @Then("the user remains on the login page {string}")
    public void the_user_remains_on_the_login_page(String expectedUrl) {
        CommonMethods.assertEquals(CommonMethods.driver.getCurrentUrl(), expectedUrl);
    }

    @Then("an error message is displayed {string}")
    public void an_error_message_is_displayed(String expectedErrorText) {
        CommonMethods.assertTrue(loginPage.errorMessage.isDisplayed());
        CommonMethods.assertEquals(loginPage.errorMessage.getText(), expectedErrorText);
    }
}
package com.chromatech.Cucumber_BDD_Testing.steps;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Homework_Module_Page_steps {

   DashboardPage dashboardPage = new DashboardPage();


        @When("the user clicks on the Homework module")
        public void the_user_clicks_on_the_Homework_module() {
            CommonMethods.click(dashboardPage.homeworkModule);
            CommonMethods.sleep(2000);
    }

}

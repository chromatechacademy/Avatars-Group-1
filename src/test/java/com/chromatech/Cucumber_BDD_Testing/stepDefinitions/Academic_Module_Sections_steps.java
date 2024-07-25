package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;

public class Academic_Module_Sections_steps {

    DashboardPage DashboardPage = new DashboardPage();

    @Given("a Chroma Tech faculty member clicks the {string} module")
    public void a_chroma_tech_faculty_member_clicks_the_module(String Academics)  {
        CommonMethods.assertTrue(DashboardPage.academicModuleSections.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.academicModuleSections.getText(), "Academics");
        CommonMethods.click(DashboardPage.academicModuleSections);
        CommonMethods.sleep(4000);


    }
}

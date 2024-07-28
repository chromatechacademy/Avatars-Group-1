package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.CategoryPage;
import com.chromatech.utils.CommonMethods;

public class StepImplementation extends PageInitializer {

    public void user_click_on_delete_button_to_remove_name_and_confirm(String Oksana) {
        CommonMethods.waitForClickability(CategoryPage.dynamicDeleteRecordLocator(Oksana));
        categoryPage.deleteButton.isDisplayed();
        CategoryPage.dynamicDeleteRecordLocator(Oksana).click();
        CommonMethods.acceptAlert();
    }

    public void the_module_is_displays(String expectedHomeworkModuleText) {
        CommonMethods.assertTrue(dashboardPage.studentHomeworkModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentHomeworkModule.getText(), expectedHomeworkModuleText);
    }

    public void the_user_clicks_on_the_Homework_module() {
        CommonMethods.assertTrue(dashboardPage.studentHomeworkModule.isDisplayed());
        CommonMethods.click(dashboardPage.studentInformationModule);
    }

    public void the_submodule_is_displays(String expectedAddHomeworkSubmoduleText) {
       CommonMethods.assertTrue(dashboardPage.addHomework.isDisplayed());
       CommonMethods.assertEquals(dashboardPage.addHomework.getText().trim(), expectedAddHomeworkSubmoduleText);
          }
}
package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.CategoryPage;
import com.chromatech.utils.CommonMethods;

public class StepImplementation {

  CategoryPage categoryPage = new CategoryPage();

    public void user_click_on_delete_button_to_remove_name_and_confirm(String Oksana) {
        CommonMethods.waitForClickability(CategoryPage.dynamicDeleteRecordLocator(Oksana));
        categoryPage.deleteButton.isDisplayed();
        CategoryPage.dynamicDeleteRecordLocator(Oksana).click();
        CommonMethods.acceptAlert();
    }
}

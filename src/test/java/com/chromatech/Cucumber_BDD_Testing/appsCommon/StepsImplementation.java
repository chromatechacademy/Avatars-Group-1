package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.CategoryPage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import org.testng.Assert;

public class StepsImplementation extends PageInitializer {

    /**
     * Deletes a student's admission number as selected by the user.
     *
     * @param admissionNumber the admission number of the student to be deleted
     */
    public static void user_selects_student_admission_number_and_deletes_it(String admissionNumber) {
        CommonMethods.waitForClickability(EditPage.dynamicRecordLocateDelete(admissionNumber));
        JavascriptMethods.scrollIntoView(EditPage.dynamicRecordLocateDelete(admissionNumber));
        Assert.assertEquals(editPage.admissionNumber.getText(), editPage.admissionNumber.getText());
        EditPage.dynamicRecordLocateDelete(admissionNumber).click();
        CommonMethods.click(editPage.deleteButton);
        CommonMethods.acceptAlert();
    }
}
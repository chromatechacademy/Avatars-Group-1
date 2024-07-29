package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StepsImplementation extends PageInitializer {

    /**
     * This method selects a section by entering text in the corresponding input field and clicking on the checkbox.
     *
     * @param text the text to be entered in the input field
     */
    public static void selects_section(String text) {
        List<WebElement> textBoxes = driver.findElements(By.cssSelector("input[value='298']"));
        WebElement textBox = textBoxes.get(0);
        textBox.sendKeys(text);
        CommonMethods.click(classPage.sectionsCheckBox);
    }

    /**
     * Removes a class by clicking on the delete button and confirming the deletion.
     *
     * @param classText the text of the class to be deleted
     */
    public static void user_clicks_on_delete_button_to_remove_class_and_confirms(String classText) {
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement row : rows) {
            WebElement classTitle = row.findElement(By.tagName("td"));
            if (classTitle.getText().equals(classText)) {
                WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(), '" + classText + "')]//parent::tr/td[3]/a[2]/i"));
                CommonMethods.click(deleteButton);
                CommonMethods.acceptAlert();
                break;
            }
        }
    }

    /**
     * Removes a class if it exists by clicking on the delete button and confirming the deletion.
     *
     * @param classText the text of the class to be removed
     */
    public static void make_sure_does_not_exist_if_yes_remove_it(String classText) {
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
        for (WebElement row : rows) {
            WebElement classTitle = row.findElement(By.tagName("td"));
            if (classTitle.getText().equals(classText)) {
                WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(), '" + classText + "')]//parent::tr/td[3]/a[2]/i"));
                CommonMethods.click(deleteButton);
                CommonMethods.acceptAlert();
                break;
            }
        }
    }
    /**
     * Deletes a student's admission number as selected by the user.
     *
     * @param admissionNumber the admission number of the student to be deleted
     */
    public static void user_selects_student_admission_number_and_deletes_it(String admissionNumber) {
        CommonMethods.waitForClickability(EditPage.dynamicRecordLocateDelete(admissionNumber));
        JavascriptMethods.scrollIntoView(EditPage.dynamicRecordLocateDelete(admissionNumber));
        Assert.assertEquals(editPage.admissionNumber.getText(), admissionNumber);
        EditPage.dynamicRecordLocateDelete(admissionNumber).click();
        CommonMethods.click(editPage.deleteButton);
        CommonMethods.acceptAlert();
    }

    public static void the_user_clicks_on_the_x_button_to_delete() {
        JavascriptMethods.scrollIntoView(expenseHeadPage.expenseHeadBill);
        expenseHeadPage.expenseHeadXBtn.click();
        CommonMethods.acceptAlert();
    }

    public static void a_chroma_tech_user_is_on_the_dashboard_page() {
        CommonMethods.assertTrue(classAndSectionPage.dashBoardPageHeader.isDisplayed());
        CommonMethods.assertEquals(classAndSectionPage.dashBoardPageHeader.getText(), classAndSectionPage.dashBoardPageHeader.getText());
    }

    public static void the_user_navigates_to_the_class_submodule() {
        classAndSectionPage.academicsModuleTab.click();
        classAndSectionPage.classSubmodule.click();
    }

    public static void there_are_two_classes_sdet_and_cyber_security_displayed_with_the_following_sections(String class1, String section1, DataTable dataTable) {
        CommonMethods.assertTrue(classAndSectionPage.sdetClass.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.cyberSecurityClass.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.testingFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.sdlcMethodogies.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.seleniumTestAutomation.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.cucumberFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.apiTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.gitgithub.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.java11ForCoolPeople.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.mobileTestAutomation.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.accessiblityTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.databaseTesting.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.networkingFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.linuxFundamentals.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.ciaTriad.isDisplayed());
        CommonMethods.assertTrue(classAndSectionPage.penetrationTestingEthicalHacking.isDisplayed());
    }
}
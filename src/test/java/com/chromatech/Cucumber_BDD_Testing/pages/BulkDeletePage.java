package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Map;
import static com.chromatech.utils.WebDriverUtils.driver;

public class BulkDeletePage {

    DashboardPage dashboardPage = new DashboardPage();

    public BulkDeletePage() {
        PageFactory.initElements(driver, this);
    }

    // Class dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropdown;

    // Section dropdown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // Search button
    @FindBy(xpath = "//button[normalize-space()='Search']//i[@class='fa fa-search']")
    public WebElement searchButton;

    // Dynamic XPATH for checkBoxes
    public static WebElement dynamicXpathForCheckboxes(String admissionNumber) {
        return driver.findElement(By.xpath("//td[text()='" + admissionNumber + "']//parent::tr/td[1]/input[@type='checkbox']"));
    }

    // Delete button
    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    /**
     * If a student record already exists, the user deletes it.
     *
     * @param dataTable The data table containing the record details to be deleted.
     */
    public void if_a_student_record_already_exists_the_user_deletes_it(DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            CommonMethods.assertEquals(dashboardPage.findModuleByText(data.get("Module")).getText(), data.get("Module"));
            if (!(dashboardPage.findSubModuleByText((data.get("SubModule"))).isDisplayed())) {
                CommonMethods.click(dashboardPage.findModuleByText(data.get("Module")));
            }
            CommonMethods.click(dashboardPage.findSubModuleByText(data.get("SubModule")));
            CommonMethods.assertEquals(driver.getCurrentUrl(), (data.get("URL")));
            CommonMethods.selectDropDownValue((data.get("Class")), classDropdown);
            CommonMethods.selectDropDownValue((data.get("Section")), sectionDropDown);
            CommonMethods.click(searchButton);

            List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("td"));
                for (WebElement col : cols) {
                    if (col.getText().equals((data.get("Admission Number")))) {
                        JavascriptMethods.scrollIntoView(dynamicXpathForCheckboxes((data.get("Admission Number"))));
                        CommonMethods.click(dynamicXpathForCheckboxes((data.get("Admission Number"))));
                        JavascriptMethods.scrollIntoView(deleteButton);
                        CommonMethods.click(deleteButton);
                        CommonMethods.assertEquals(CommonMethods.getAlertText(), (data.get("Alert Text")));
                        CommonMethods.acceptAlert();
                        return;
                    }
                }
            }
            System.out.println("Record number " + (data.get("Admission Number")) + " does not exist");
        }
    }
}
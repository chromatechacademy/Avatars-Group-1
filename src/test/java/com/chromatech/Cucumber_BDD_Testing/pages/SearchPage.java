package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD

=======
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
>>>>>>> 694cc312f526189e1ccfdf79122f337c6a54918a
import static com.chromatech.utils.WebDriverUtils.driver;

public class SearchPage {

    DashboardPage dashboardPage = new DashboardPage();

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    // Search by Keyword textbox
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    // Search button
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    // Class dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Section Drop Down
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    // Table Locator by Text
    public static WebElement tableLocatorByText(String text) {
        return driver.findElement(By.xpath("//td[text()='" + text + "']"));
    }

<<<<<<< HEAD
    // Edit Icon Button
    @FindBy(xpath="//i[@class='fa fa-pencil']")
    public WebElement editIconButton;

    // Dynamic Table Locator
    public static WebElement dynamicTableLocator(String text) {
        return driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]//parent::tr/td[2]"));
    }

    // Bulk Delete subModule
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;
=======
    /**
     * Searches for a student record based on the provided parameters.
     *
     * @param dataTable A DataTable object containing the search parameters in the form of key-value pairs.
     */
    public void user_is_searching_for_a_student_record_based_on_parameters(DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : dataList) {
            if (!(dashboardPage.findSubModuleByText((data.get("SubModule"))).isDisplayed())) {
                CommonMethods.click(dashboardPage.findModuleByText(data.get("Module")));
            }
            CommonMethods.click(dashboardPage.findSubModuleByText((data.get("SubModule"))));
            CommonMethods.assertEquals(driver.getCurrentUrl(), (data.get("URL")));
            CommonMethods.selectDropDownValue(data.get("Class"), classDropDown);
            CommonMethods.selectDropDownValue(data.get("Section"), sectionDropDown);
            CommonMethods.sendKeys(searchByKeywordTextBox, data.get("Admission Number"));
            CommonMethods.click(searchButton);
        }
    }
>>>>>>> 694cc312f526189e1ccfdf79122f337c6a54918a

    /**
     * Makes sure that the entry corresponding to the provided admission number is present in the list.
     *
     * @param admissionNumber The admission number of the entry to be checked.
     * @param dataTable       A DataTable object containing the entry details in the form of key-value pairs.
     */
    public void make_sure_the_entry_is_in_the_list(String admissionNumber, DataTable dataTable) {
        CommonMethods.assertTrue(tableLocatorByText(admissionNumber).isDisplayed());
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        ArrayList<String> studentDataFromTable = new ArrayList<>();
        for (Map<String, String> data : dataList) {
            studentDataFromTable.add(data.get("Admission Number"));
            studentDataFromTable.add(data.get("Student Name"));
            studentDataFromTable.add(data.get("Class(Section)"));
            studentDataFromTable.add(data.get("Father Name"));
            studentDataFromTable.add(data.get("Date of Birth"));
            studentDataFromTable.add(data.get("Gender"));
            studentDataFromTable.add(data.get("Category"));
            studentDataFromTable.add(data.get("Mobile Number"));
            studentDataFromTable.add(data.get("Height"));
            studentDataFromTable.add(data.get("Weight"));
            studentDataFromTable.add(data.get("Add Fees"));
        }
        String rowXPath = "//td[text()='" + admissionNumber + "']//parent::tr";
        List<WebElement> rows = driver.findElements(By.xpath(rowXPath));

        ArrayList<String> studentDataFromList = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                studentDataFromList.add(cell.getText());
            }
        }
        Assert.assertEquals(studentDataFromTable, studentDataFromList);
    }
}

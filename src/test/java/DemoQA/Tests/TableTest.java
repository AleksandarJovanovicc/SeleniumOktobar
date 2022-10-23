package DemoQA.Tests;

import DemoQA.BaseTest.DemoQABaseTest;
import DemoQA.Pages.TablePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest extends DemoQABaseTest {

    TablePage tablePage;

    @BeforeMethod
    public void pageSetUp(){
        tablePage = new TablePage();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
    }

    @AfterMethod
    public void pageCleanup(){
        driver.manage().deleteAllCookies();
    }

    @Test
    public void addEmployee(){
        tablePage.clickAdd();
        tablePage.insertName("Aleksandar");
        tablePage.insertLastName("Jovanovic");
        tablePage.insertEmail("coa@gmail.com");
        tablePage.insertAge("27");
        tablePage.insertSalary("777");
        tablePage.insertDepartment("QA");
        tablePage.clickSubmit();
        tablePage.insertInSearch("Aleksandar");
        Assert.assertEquals(tablePage.tableRow.getText(), "Aleksandar\n" +
                "Jovanovic\n" +
                "27\n" +
                "coa@gmail.com\n" +
                "777\n" +
                "QA");
    }

}

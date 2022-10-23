package DemoQA.Pages;

import DemoQA.BaseTest.DemoQABaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage extends DemoQABaseTest {
    public TablePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "addNewRecordButton")
    public WebElement add;

    @FindBy (id = "firstName")
    public WebElement firstName;

    @FindBy (id = "lastName")
    public WebElement lastName;

    @FindBy (id = "userEmail")
    public WebElement userMail;

    @FindBy (id = "age")
    public WebElement age;

    @FindBy (id = "salary")
    public WebElement salary;

    @FindBy (id = "department")
    public WebElement department;

    @FindBy (id = "submit")
    public WebElement submit;

    @FindBy (id = "searchBox")
    public WebElement searchBox;

    @FindBy (css = ".rt-tr.-odd")
    public WebElement tableRow;

    public void insertInSearch(String searchStrig){
        searchBox.clear();
        searchBox.sendKeys(searchStrig);
    }
    public void clickAdd(){
        add.click();
    }

    public void insertName(String name){
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void insertLastName(String lastname){
        lastName.clear();
        lastName.sendKeys(lastname);
    }

    public void insertEmail(String email){
        userMail.clear();
        userMail.sendKeys(email);
    }

    public void insertAge(String userAge){
        age.clear();
        age.sendKeys(userAge);
    }

    public void insertSalary(String userSalary){
        salary.clear();
        salary.sendKeys(userSalary);
    }

    public void insertDepartment(String userDepartment){
        department.clear();
        department.sendKeys(userDepartment);
    }

    public void clickSubmit(){
        submit.click();
    }
}

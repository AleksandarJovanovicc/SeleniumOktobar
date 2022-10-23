package MemePages;

import MemeBase.MemeBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MemeMainPage extends MemeBaseTest {

    public MemeMainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mm-show-upload")
    public WebElement uploadNewTemplate;

    @FindBy(id = "mm-upload-file")
    public WebElement uploadNewImage;

    @FindBy(id = "mm-upload-btn")
    public WebElement uploadButton;

    @FindBy(className = "mm-text")
    public List<WebElement> textbox;

    @FindBy(css = ".mm-generate.b.but")
    public WebElement generateMeme;

    @FindBy(id = "done-img")
    public WebElement finalImage;

    //-----------------------------

    public void clickOnUploadNewTemplate() {
        uploadNewTemplate.click();
    }

    public void uploadImage(String location) {
        uploadNewImage.sendKeys(location);
    }

    public void clickOnUpload() {
        uploadButton.click();
    }

    public void insertTextIntoTopBox(String text) {
        textbox.get(0).clear();
        textbox.get(0).sendKeys(text);
    }

    public void insertTextIntoBottomBox(String text) {
        textbox.get(1).clear();
        textbox.get(1).sendKeys(text);
    }

    public void clickOnGenerateMeme() {
        generateMeme.click();
    }

    public String getMemeSrc() {
        return finalImage.getAttribute("src");
    }

}
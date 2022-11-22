package MemeTests;

import MemeBase.MemeBaseTest;
import MemePages.MemeMainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MemeTest extends MemeBaseTest {

    MemeMainPage memeMainPage;

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://imgflip.com/memegenerator");
        memeMainPage = new MemeMainPage();

    }

    @Test
    public void makeMeme() throws IOException {
        memeMainPage.clickOnUploadNewTemplate();
        memeMainPage.uploadImage("C:\\Users\\Aleksandar\\Desktop\\years.jpg");
        memeMainPage.clickOnUpload();
        memeMainPage.insertTextIntoTopBox("Saljiva recenica");
        memeMainPage.clickOnGenerateMeme();
        waitForElementVisibility(memeMainPage.finalImage);
        saveImage(memeMainPage.getMemeSrc());

    }

}
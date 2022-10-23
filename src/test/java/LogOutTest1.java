import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogOutTest1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        //Prvo sam setovao chrome driver, zatim sam napravio objekat od njega
        //Povecao sam prozor pa sam otisao na zeljeni URL

        WebElement username = driver.findElement(By.id("username"));
        //Preko selektora sam nasao web element koji ima id - username
        username.clear();
        //Prvo sam ocistio polje za slucaj da je neki string ostao upisan u polju
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
        loginButton.click();

        WebElement logOutButton = driver.findElement(By.cssSelector(".icon-2x.icon-signout"));

        logOutButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/login");

        WebElement notificationMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(notificationMessage.isDisplayed());

        Assert.assertTrue(loginButton.isDisplayed());


        driver.close();
    }
}

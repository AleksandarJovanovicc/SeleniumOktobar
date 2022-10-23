import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPageVezba {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        WebElement usernameBox = webDriver.findElement(By.id("username"));
        usernameBox.sendKeys("tomsmith");
        WebElement passwordBox = webDriver.findElement(By.id("password"));
        passwordBox.sendKeys("SuperSecretPassword!");
        WebElement logInButton = webDriver.findElement(By.className("fa.fa-2x.fa-sign-in"));
        logInButton.click();
    }


}

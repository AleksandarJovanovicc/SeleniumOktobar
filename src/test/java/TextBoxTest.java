import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TextBoxTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com");

        List<WebElement> cards = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals("Elements")) {
                js.executeScript("arguments[0].scrollIntoView(true);",cards.get(i));
                cards.get(i).click();
                break;
            }
        }

        List<WebElement> textBoxButton = driver.findElements(By.id("item-0"));

        for (int i = 0; i < textBoxButton.size(); i++) {
            if (textBoxButton.get(i).getText().equals("Text Box")) {
                textBoxButton.get(i).click();
                break;
            }
        }




    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOsnove1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        //driver.get("www.google.com"); -netacan nacin unosa URL-a
        //driver.get("https://www.google.com/"); //prvi nacin
        webDriver.navigate().to("https://www.google.com"); //drugi nacin
        webDriver.navigate().to("https://www.youtube.com");
        webDriver.navigate().refresh();
        webDriver.navigate().back();
        Thread.sleep(3000);
        webDriver.navigate().forward();
    }
}

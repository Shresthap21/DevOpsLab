package Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LogoPresence {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the Real Estate PHP about page
        driver.get("http://localhost/Real-Estate-Php/about.php");

        // Wait for the logo to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div/nav/a[2]/img")));

        // Check if the logo is present
        if (logo.isDisplayed()) {
            System.out.println("Yes, logo is present.");
        } else {
            System.out.println("No, logo is not present.");
        }

        // Close the browser
        driver.quit();
    }
}

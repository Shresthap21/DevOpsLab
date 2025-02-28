package Property;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ElementClickInterceptedException;

public class SubmitTesting {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the Chrome browser
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the URL you want to test
            driver.get("http://localhost/Real-Estate-Php/login.php");

            // Find the button using XPath
            WebElement button = driver.findElement(By.xpath("/html/body/div/div/header/div[2]/div/div/div/nav/div/a"));
            
            // Check if the button is displayed and enabled
            if (button.isDisplayed() && button.isEnabled()) {
                // Click the button
                button.click();
                System.out.println("Button was found and clicked.");
            } else {
                System.out.println("Button is present but not clickable.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Button is not present.");
        } catch (ElementClickInterceptedException e) {
            System.out.println("Button is present but could not be clicked.");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

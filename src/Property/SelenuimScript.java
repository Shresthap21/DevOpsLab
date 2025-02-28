package Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimScript {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Open Google
        driver.get("http://www.google.com");
        Thread.sleep(2000);

        // Navigate to Gmail
        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(2000);

        // Navigate back to Google
        driver.navigate().back();
        Thread.sleep(2000);

        // Navigate forward to Gmail
        driver.navigate().forward();
        Thread.sleep(2000);

        // Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}

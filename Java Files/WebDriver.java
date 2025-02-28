package tester;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static void main(String[] args) {
        // Set up the ChromeDriver path
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pande\\OneDrive\\Desktop\\devopps1\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        try { 
            // Navigate to the website
            driver.get("http://localhost/Real-estate-php");

            // TEST CASE 1: Validate Page Title
            String expectedTitle = "Your Real Estate Website Title";  // Update with actual title
            String actualTitle = driver.getTitle();
            System.out.println("Page Title: " + actualTitle);
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("✅ Test Case 1 Passed: Page title is correct.");
            } else {
                System.out.println("❌ Test Case 1 Failed: Page title is incorrect.");
            }

            // TEST CASE 2: Validate Logo Presence
            try {
                WebElement logoElement = driver.findElement(By.xpath("//*[@id='header']"));
                if (logoElement.isDisplayed()) {
                    System.out.println("✅ Test Case 2 Passed: Logo is present.");
                } else {
                    System.out.println("❌ Test Case 2 Failed: Logo is not displayed.");
                }
            } catch (Exception e) {
                System.out.println("❌ Test Case 2 Failed: Logo element not found.");
            }
            // TEST CASE 3: Property Search Functionality
            try {
                WebElement searchBox = driver.findElement(By.name("search")); // Update with actual name
                WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));

                searchBox.sendKeys("Apartment");
                searchButton.click();
                System.out.println("✅ Test Case 4 Passed: Property search executed.");
            } catch (Exception e) {
                System.out.println("❌ Test Case 4 Failed: Search functionality issue.");
            }


            // TEST CASE 4: Footer Section Validation
            try {
                WebElement footer = driver.findElement(By.tagName("footer"));
                if (footer.isDisplayed()) {
                    System.out.println("✅ Test Case 8 Passed: Footer is displayed.");
                } else {
                    System.out.println("❌ Test Case 8 Failed: Footer is missing.");
                }
            } catch (Exception e) {
                System.out.println("❌ Test Case 8 Failed: Footer not found.");
            }
            

            // Wait before closing the browser (for demonstration)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
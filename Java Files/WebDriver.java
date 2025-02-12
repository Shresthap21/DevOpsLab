//package testing1;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WebDriver {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	      System.setProperty("webdriver.chrome.driver", "D:\\sem 6\\chromedriver-win64\\chromedriver.exe");
//
//	        // Create an instance of ChromeDriver (launch the Chrome browser)
//	        ChromeDriver Driver = new ChromeDriver();
//
//	        try {
//	            // Navigate to the desired website (GeeksforGeeks in this example)
//	            Driver.get("http://localhost/Real-Estate-Php/index.php#");
//
//	            // Get and print the page title
//	            String pageTitle = Driver.getTitle();
//	            System.out.println("Page Title: " + pageTitle);
//
//	            // Wait for a few seconds (for demonstration purposes only)
//	            Thread.sleep(3000);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        } finally {
//	            // Close the browser
//	            Driver.quit();
//	        }
//
//	}
//
//}


package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

    public static void main(String[] args) {
        // Set up the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "D:\\sem 6\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeDriver (launch the Chrome browser)
        ChromeDriver driver = new ChromeDriver();

        try {
            // Navigate to the desired website
            driver.get("http://localhost/Real-Estate-Php/index.php#");

            // Get and print the page title
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // Check if the logo element is present using XPath //*[@id="header"]
            WebElement logoElement = driver.findElement(By.xpath("//*[@id='header']"));

            // Validate if the logo element is displayed
            if (logoElement.isDisplayed()) {
                System.out.println("Logo is present on the webpage.");
            } else {
                System.out.println("Logo is not present on the webpage.");
            }

            // Wait for a few seconds (for demonstration purposes only)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Logo element not found: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

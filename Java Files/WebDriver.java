package tester;
//PACKAGE NAME TESTER
//packages import
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

            //KARAN TEST CASE 1: Validate Page Title
            String expectedTitle = "Your Real Estate Website Title";  // Update with actual title
            String actualTitle = driver.getTitle();
            System.out.println("Page Title: " + actualTitle);
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("✅ Test Case 1 Passed: Page title is correct.");
            } else {
                System.out.println("❌ Test Case 1 Failed: Page title is incorrect.");
            }

            //KARAN TEST CASE 2: Validate Logo Presence
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
            //SHRESTHA TEST CASE 3: Property Search Functionality
            try {
                WebElement searchBox = driver.findElement(By.name("search")); // Update with actual name
                WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));

                searchBox.sendKeys("Apartment");
                searchButton.click();
                System.out.println("✅ Test Case 3 Passed: Property search executed.");
            } catch (Exception e) {
                System.out.println("❌ Test Case 3 Failed: Search functionality issue.");
            }


            //SHRESTHA TEST CASE 4: Footer Section Validation
            try {
                WebElement footer = driver.findElement(By.tagName("footer"));
                if (footer.isDisplayed()) {
                    System.out.println("✅ Test Case 4 Passed: Footer is displayed.");
                } else {
                    System.out.println("❌ Test Case 4 Failed: Footer is missing.");
                }
            } catch (Exception e) {
                System.out.println("❌ Test Case 4 Failed: Footer not found.");
            }
            
            //AKASH TEST CASE 5: Validate Navigation Links
            String[] navLinks = {"Home", "About Us", "Services", "Contact Us"}; // Update if necessary
            for (String linkText : navLinks) {
                try {
                    WebElement navLink = driver.findElement(By.xpath("//a[text()='" + linkText + "']"));
                    if (navLink.isDisplayed()) {
                        System.out.println("✅ Test Case 5 Passed: '" + linkText + "' link is visible.");
                    } else {
                        System.out.println("❌ Test Case 5 Failed: '" + linkText + "' link is not visible.");
                    }
                } catch (Exception e) {
                    System.out.println("❌ Test Case 5 Failed: '" + linkText + "' link not found.");
                }
            }

      

            //AKASH TEST CASE 6: Sign-Up Functionality
            try {
                driver.findElement(By.name("signup_username")).sendKeys("newuser"); // Update field names
                driver.findElement(By.name("signup_email")).sendKeys("newuser@example.com");
                driver.findElement(By.name("signup_password")).sendKeys("newpassword");
                driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

                System.out.println("✅ Test Case 6 Passed: Sign-up attempted.");
            } catch (Exception e) {
                System.out.println("❌ Test Case 6 Failed: Sign-up elements not found.");
            }

         //ABDULLAH TEST CASE 7: Contact Form Submission
            try {
                WebElement nameField = driver.findElement(By.name("name"));
                WebElement emailField = driver.findElement(By.name("email"));
                WebElement messageField = driver.findElement(By.name("message"));
                WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

                nameField.sendKeys("John Doe");
                emailField.sendKeys("john.doe@example.com");
                messageField.sendKeys("I am interested in your properties.");
                submitButton.click();

                System.out.println("✅ Test Case 7 Passed: Contact form submitted.");
            } catch (Exception e) {
                System.out.println("❌ Test Case 7 Failed: Contact form elements not found.");
            }

            //ABDULLAH TEST CASE 8: User Login Functionality
            try {
                driver.findElement(By.name("username")).sendKeys("testuser"); // Update field names
                driver.findElement(By.name("password")).sendKeys("testpassword");
                driver.findElement(By.xpath("//button[text()='Login']")).click();

                System.out.println("✅ Test Case 8 Passed: Login attempted.");
            } catch (Exception e) {
                System.out.println("❌ Test Case 8 Failed: Login elements not found.");
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

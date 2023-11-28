package org.gaurav;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisitFlipkart {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().clearDriverCache();
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", WebDriverManager.chromedriver().getDownloadedDriverPath());

        // Create an instance of ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testExample() {
        // Navigate to a website
        driver.get("https://www.example.com");

        // Perform some actions
        // ...

        // Add your test assertions here
        // For example, you might use TestNG assertions
        // Assert.assertEquals(driver.getTitle(), "Expected Title");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
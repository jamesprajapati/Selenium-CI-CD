package org.gaurav;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisitFlipkart {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Setup FirefoxDriver with the latest version using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create an instance of FirefoxDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testFlipkart() {
        // Navigate to Flipkart
        driver.get("https://www.flipkart.com/");

        // Perform some actions (e.g., finding an element)
        WebElement logo = driver.findElement(By.cssSelector("img[title='Flipkart']"));

        // Add your test assertions here
        Assert.assertTrue(logo.isDisplayed(), "Flipkart logo is displayed");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
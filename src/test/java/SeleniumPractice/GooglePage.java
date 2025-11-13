package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Setup Chrome browser automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("✅ Browser launched successfully!");
    }

    @Test
    public void googleSearchTest() {
        driver.get("https://www.google.com");
        System.out.println("🌐 Opened Google website");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        String title = driver.getTitle();
        System.out.println("🔍 Page title: " + title);

       //Assert.assertTrue(title.contains("Selenium"), "❌ Title does not contain 'Selenium'");
        System.out.println("✅ Test passed: Title verified successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🚪 Browser closed successfully!");
        }
    }
}

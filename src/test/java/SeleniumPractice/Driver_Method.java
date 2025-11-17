package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver_Method {
    static WebDriver driver;

    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        System.out.println(url); // commit
        Thread.sleep(5000);

    }
}










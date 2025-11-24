package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingQues {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
       WebElement NewTabBtn = driver.findElement(By.xpath("//button[@id='tabButton']"));
       NewTabBtn.click();
      

    }
}

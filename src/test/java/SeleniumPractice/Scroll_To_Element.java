package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_To_Element {
    static WebDriver driver;

    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.jio.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url); // commit
        Thread.sleep(5000);
        WebElement cardElments = driver.findElement(By.xpath("(//div[@class = 'card-body'])[1]"));
        ( (JavascriptExecutor) driver ).executeScript("arguments[0].scrollIntoView(true);",cardElments);
        Thread.sleep(2000);
        cardElments.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.xpath("//span [contains(text (), 'Text Box')]"));
        textBox.click();
        Thread.sleep(1000);
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Tanu Jha");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        //added above code in GIT
    }
}










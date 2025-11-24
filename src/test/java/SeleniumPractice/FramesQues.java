package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesQues {
    static WebDriver driver;

    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
        driver.manage().window().maximize();

       /* WebElement AlertFramesElements = driver.findElement(By.xpath("(//div[@class = 'card-body'])[3]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AlertFramesElements);
        Thread.sleep(2000);
        AlertFramesElements.click();
        Thread.sleep(2000);

        WebElement FrameText = driver.findElement(By.xpath("(//span[contains(text(),\'Frames\')][1])"));
        FrameText.click();
        Thread.sleep(1000);*/

        driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.id("sampleHeading"));
       /* frame1.click();
        Thread.sleep(1000);*/
        System.out.println(frame1.getText());

    }
}

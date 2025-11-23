package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertQues {
    static WebDriver driver;

    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        WebElement AlertFramesElements = driver.findElement(By.xpath("(//div[@class = 'card-body'])[3]"));
        ((JavascriptExecutor) driver ).executeScript("arguments[0].scrollIntoView(true);",AlertFramesElements);
        Thread.sleep(2000);
        AlertFramesElements.click();
        Thread.sleep(2000);

        WebElement AlertsText = driver.findElement(By.xpath("//span[contains(text(),'Alerts')]"));
        AlertsText.click();
        Thread.sleep(1000);

        WebElement clickMeBtn1 = driver.findElement(By.xpath("//button[@id = \"alertButton\"]"));
        clickMeBtn1.click();
        Thread.sleep(1000);

        //How do you handle JavaScript alerts in Selenium?

        Alert alert = driver.switchTo().alert();
        String getText=  alert.getText();
        System.out.println(getText);
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);// this method is used for Click OK
        System.out.println("accept alertBtn.");
        WebElement clickMeBtn3 = driver.findElement(By.xpath("//button[@id = \"confirmButton\"]"));
        clickMeBtn3.click();
        Thread.sleep(1000);
        alert.dismiss(); // dismiss() → Clicks Cancel on the alert (or closes it).
        System.out.println("Dismiss alertBtn.");
        Thread.sleep(1000);
        clickMeBtn3.click();
        Thread.sleep(1000);
        alert.accept();
        System.out.println("Clicked on ok btn.");
        WebElement clickMeBtn4 = driver.findElement(By.xpath("//button[@id = \"promtButton\"]"));
        clickMeBtn4.click();
        Thread.sleep(1000);
        alert.sendKeys("Hi ALERT message..");
        System.out.println("Message sent to Alertpop-up");
        alert.accept();
        System.out.println("Accept the promptmsg");

    }
}

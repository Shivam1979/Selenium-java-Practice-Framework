package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Form_SubmitTextBoxClass {
    static WebDriver driver;
    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        System.out.println(url); // commit
        //
        WebElement cardElments = driver.findElement(By.xpath("(//div[@class = 'card-body'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cardElments);
        //
        Thread.sleep(1000);
        cardElments.click();
        Thread.sleep(1000);
        WebElement textBox = driver.findElement(By.xpath("//span [contains(text (), 'Text Box')]"));
        textBox.click();
        Thread.sleep(1000);
        WebElement title_Text_Box = driver.findElement(By.className("text-center"));
        if (title_Text_Box.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title_Text_Box);
            System.out.println("TextBox page displayed");
            WebElement fullName = driver.findElement(By.id("userName"));
            fullName.click();
            fullName.sendKeys("Tanu Jha");
            WebElement email = driver.findElement(By.id("userEmail"));
            email.click();
            email.sendKeys("Shivam423@gmail.com");
            Thread.sleep(4000);
            WebElement current_Adress = driver.findElement(By.xpath("//label[text()='Current Address']/parent::div/following-sibling::div/textarea"));
            current_Adress.click();
            current_Adress.sendKeys("3K near navi mumbai 466445");
//label[text()='Permanent Address']/parent::div/following-sibling::div/textarea
            Thread.sleep(4000);
            WebElement permanent_Address = driver.findElement(By.xpath("//label[text()='Permanent Address']/parent::div/following-sibling::div/textarea"));
            permanent_Address.click();
            permanent_Address.sendKeys("Near Ram mandir 54L NAVI MUMBAI THANE MAHARASTRA");
            Thread.sleep(4000);
            WebElement submit_Button = driver.findElement(By.xpath("//button[text()='Submit']"));
            submit_Button.click();
            Thread.sleep(4000);
            WebElement validate_inputData = driver.findElement(By.xpath("//div[@id='output']/div"));
            Boolean b = validate_inputData.isDisplayed();
            if (b) {
                System.out.println("Passed");
            } else System.out.println("Failed");
        } else {
            System.out.println("TextBox page not displayed");
        }


    }
}










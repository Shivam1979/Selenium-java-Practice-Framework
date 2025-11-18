package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown_Select_Q1 {
    static WebDriver driver;

    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        Thread.sleep(8000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement ddn = driver.findElement(By.xpath("//select[@name= 'input_8']"));
        Select select = new Select(ddn);
//select.getAllSelectedOptions();  // print Company Size*
        List<WebElement> selectedOption = select.getAllSelectedOptions();
        selectedOption.size();
        System.out.println( selectedOption.get(0).getText());

        List<WebElement> allElements = select.getOptions();
        int indexSize = allElements.size();
        for (int i = 0; i <= indexSize-1; i++) {
            System.out.println(allElements.get(i).getText());
        }
        int lastIndex = indexSize-1;
        select.selectByIndex(lastIndex);

    }
}

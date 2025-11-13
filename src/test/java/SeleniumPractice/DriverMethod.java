package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverMethod {
  static WebDriver driver ;

   public static void main(String arg[]) throws InterruptedException {
      WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();
         driver.get("https://demoqa.com");
         Thread.sleep(5000);
       driver.manage().window().fullscreen();

       String url = driver.getCurrentUrl();
       System.out.println(url); // commit
   }
}










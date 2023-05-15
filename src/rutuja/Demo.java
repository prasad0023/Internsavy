package rutuja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
      ///  driver.get("https://www.google.com/");

        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.google.com/");
       // driver1.manage().window().maximize();
        Thread.sleep(10000);
        driver1.close();

    }
}

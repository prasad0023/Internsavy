package mahesh.Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInterface {
    public static void main(String[] args) {
       /* Car obj = new Alto();
        //System.out.println(obj.price());
        float temp;
        temp=obj.price();
        System.out.println(temp);
        obj.color();
        Car obj2 = new Fortuner();
        obj2.color();*/
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.javatpoint.com/");

    }
}

package mahesh.method.overriding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public  void show(){

    }

    public static void main(String[] args) {
        Super obj = new Sub();
        obj.display();
        obj.demo1111();

    }
}

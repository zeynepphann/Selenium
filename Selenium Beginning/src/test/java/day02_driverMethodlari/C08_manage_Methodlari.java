package day02_driverMethodlari;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manage_Methodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // maximize iken boyutlari ve konumu alalim
        System.out.println("maximize konum :"+driver.manage().window().getPosition());
        System.out.println("maximize boyut :"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();

        System.out.println("fullscreen konum :"+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut :"+driver.manage().window().getSize());

    }
}

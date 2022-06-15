package deneme;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String arananKelime="window";
        String arananinOldKaynakKodu=driver.getPageSource();

        if (arananinOldKaynakKodu.contains(arananKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println(arananKelime+" kaynak kodunda bulunmuyor ");


    }
}

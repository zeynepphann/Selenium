package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari = driver.getPageSource(); //Kaynak kodlarini bize getirir
        String arananKelime= "Amazon";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("KAYNAK KODU PASSED");
        }else
            System.out.println("KAYNAK KODU " +arananKelime+ " YOK FAILED ");
        driver.close();
    }
}

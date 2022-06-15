package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /* 1- https://www.amazon.com url'ine gidin
           2- Basligin Amazon kelimesini icerdigini test edin
           3- url'in "https://www.amazon.com" esit old. test edin
           4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// tam ekran yapar pencereyi

       // 1- https://www.amazon.com url'ine gidin

        driver.get("https://www.amazon.com");

       // 2- Basligin Amazon kelimesini icerdigini test edin
        String actualTitle =driver.getTitle();
        String arananKelime ="Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title"+arananKelime +"'yi icermiyor,title testi FAILED");
        }
       // 3- url'in "https://www.amazon.com" esit old. test edin

       String actuelUrl= driver.getCurrentUrl();
       String expectedUrl="https://www.amazon.com";
       if (actuelUrl.equals(expectedUrl)){
           System.out.println("Title testi PASSED");
       }else{
           System.out.println("actual Url:" +actuelUrl+ " beklenen Urlden farkli, test FAILED");
       }
       // 4- sayfayi kapatin

    }
}

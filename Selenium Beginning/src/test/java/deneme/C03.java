package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandom;

public class C03 {
    /* 1- https://www.amazon.com url'ine gidin
           2- Basligin Amazon kelimesini icerdigini test edin
           3- url'in "https://www.amazon.com" esit old. test edin
           4- sayfayi kapatin
         */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //1-https://www.amazon.com url'ine gidin
          driver.get("https://www.amazon.com");

        //2-Basligin Amazon kelimesini icerdigini test edin

        String arananKelime="Amazon";
        String actuelTitle=driver.getTitle();

        if (actuelTitle.contains(arananKelime)){// contains olmali ki iceriyor mu ona baksin
            System.out.println("TITLE TEST PASSED");
        }else{
            System.out.println("TITLE TEST FAILED");
        }

        //3- url'in "https://www.amazon.com" esit old. test edin

        String arananUrl= "https://www.amazon.com";
        String actuelUrl = driver.getCurrentUrl();

        if (actuelUrl.equals(arananUrl)){
            System.out.println("URL TEST PASSED");
        }else{
            System.out.println("URL TEST FAILED");
        }

        //4- sayfayi kapatin
        Thread.sleep(2000);
        driver.close();




    }
}

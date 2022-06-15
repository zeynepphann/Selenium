package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTestiOdev {

    @Test
        public void method1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        WebElement resim=driver.findElement(By.xpath("//img[@alt='Google']"));

        if (resim.isDisplayed()){
            System.out.println("Test PASSED");
        }else  System.out.println("Test FAILED");

        WebElement aramacubugu= driver.findElement(By.xpath("//input[@name='q']"));
        aramacubugu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement sonucSayisi1=driver.findElement(By.xpath("//div[@id='result-stats']"));
        String sonucArr [] =sonucSayisi1.getText().split(" ");

        String sonucSayisi=sonucArr[1];
        int beklenenSayi=1000000;
        sonucSayisi=sonucSayisi.replaceAll("\\D","");

        if (Integer.parseInt(sonucSayisi)>beklenenSayi){
            System.out.println("Sonuc sayisi beklenen sayidan buyuk");
        }
        else System.out.println("Sonuc sayisi beklenen sayidan kucuk ");


        driver.close();























    }


}

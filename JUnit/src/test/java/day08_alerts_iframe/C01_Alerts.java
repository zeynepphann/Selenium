package day08_alerts_iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Alerts {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
       // driver.quit();
    }

    @Test
    public void test01(){
        /*
        herhangi bir wep sitesine gidince veya
        bir web sitesinde herhangi bir islem yaptigimizda ortaya cikan
        uyarilara alert diyoruz

        Egerbir alert inspect yapilabiliyorsa, o alert otomasyon ile kullanilabilir,
        bu tur alertler'lere HTML denir ve bunlar icin ekstra bir islem yapmaya gerek yoktur
        tum webelemntler gibi locate edip istedigimiz islemleri yapabiliriz
        driver.get("https://www.facebook.com"); da cikan alert (bende cikmadi )
          */
        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept(); //okay tiklar
        // switchTo() degistir gecis yap demek

        // result kisminda "You successfully clicked an alert" yazdigini test edin

        String expectedResult="You successfully clicked an alert";
        WebElement sonucYazisi=driver.findElement(By.xpath("//p[@id='result']"));
        String actualResult=sonucYazisi.getText();
        Assert.assertEquals(expectedResult,actualResult);


    }
}

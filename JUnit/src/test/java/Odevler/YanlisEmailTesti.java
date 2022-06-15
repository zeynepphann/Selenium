package Odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class YanlisEmailTesti {
     /*
    1. Bir Class olusturalim YanlisEmailTesti
    2. http://automationpractice.com/index.php sayfasina gidelim
    3. Sign in butonuna basalim
    4. Email kutusuna @isareti olmayan bir mail yazip enter’a
       bastigimizda “Invalid email address” uyarisi ciktigini test edelim
     */
    WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
        // driver.close();
    }

    @Test
    public void test01(){
        //  2. http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");

       // 3. Sign in butonuna basalim
        driver.findElement(By.xpath("//a[@class='login']")).click();

       // 4. Email kutusuna @isareti olmayan bir mail yazip enter’a
       WebElement emailKutusu= driver.findElement(By.xpath("//input[@id='email_create']"));
       emailKutusu.sendKeys("emailadresi.com"+ Keys.ENTER);
        //bastigimizda “Invalid email address” uyarisi ciktigini test edelim*/
       WebElement uyari = driver.findElement(By.xpath("//*[text()='Invalid email address.']"));
       Assert.assertTrue(uyari.isDisplayed());





    }
}

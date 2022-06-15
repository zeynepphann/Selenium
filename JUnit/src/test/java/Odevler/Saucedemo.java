package Odevler;

import com.beust.jcommander.StringKey;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.invoke.VarHandle;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Saucedemo {
    //1. “https://www.saucedemo.com” Adresine gidin
    //2. Username kutusuna “standard_user” yazdirin
    //3. Password kutusuna “secret_sauce” yazdirin
    //4. Login tusuna basin
    //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    //6. Add to Cart butonuna basin
    //7. Alisveris sepetine tiklayin
    //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
    //9. Sayfayi kapatin


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
      driver.close();
    }


    @Test
    public void test01() throws InterruptedException {
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        Thread.sleep(3000);

        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);


        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(3000);

        //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        List<WebElement> urunlerListesi=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        String ilkUrun=urunlerListesi.get(0).getText();
        urunlerListesi.get(0).click();
        Thread.sleep(3000);

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(3000);

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        String varMi=driver.findElement(By.xpath("//div[@class='cart_item']//div/a/div")).getText();
        Thread.sleep(3000);


        if (ilkUrun.equals(varMi)){
            System.out.println("Test PASSED");
        }else    System.out.println("Test FAILED");


        //9. Sayfayi kapatin




    }

}

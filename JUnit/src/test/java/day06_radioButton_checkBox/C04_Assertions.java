package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Assertions {

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
    public void test01(){
        // Eger methodunuzda hicbir test yoksa , test calistiktan sonra
        //hic bir problemle karsilasilmadiginni raporlamak icin tests passed yazisi cikar

        // eger testleri if ile yaparsak test failed olsa bile kodlar problemsiz calistigi icin
        // ekranin sol alt kisminda test passed yazacaktir
        driver.get("https://www.amazon.com");

        //url'in https://www.facebook.com oldugunu test edin

       //if (driver.getCurrentUrl().equals("https://www.facebook.com")){
       //    System.out.println("test passed");
       //}else System.out.println("test failed");

        String exceptedUrl="https://www.facebook.com";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals("Url beklenenden farkli "+ exceptedUrl,actualUrl);

       /*
       Assert ile yaptigimiz testlerde assertion failed olursa java kodlari
       calismasini durdurur ve Assert class'i bizi hata konusunda bildgilendirir

       org.junit.ComparisonFailure:
     Expected :https://www.facebook.com
     Actual   :https://www.amazon.com/
     <Click to see difference>
         Boylece hatanin ne oldugunu arastirmamiza gerek kalmadan junit bize raporlamis olacak
 */
    }

}

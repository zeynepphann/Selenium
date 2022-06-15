package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BestBuyAssertions {
    /*
    https://www.bestbuy.com/
    farkli test method'lari olusturarak asagidaki testleri yapin
    sayfa url;sinin https://www.bestbuy.com/ oldugunu test edin
    titleTest= sayfa basliginin "rest" icermedigini test edin
    logoTest=BestBuy logosunun goruntulendigini test edin
    FrancaisLinkTest= Fransizca linkin goruntulendigini test edin

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
    public void test01() {
        //  1- https://www.bestbuy.com/
        driver.get("https://www.bestbuy.com/");
    }

    @Test
    public void test02() {
            //  2- farkli test method'lari olusturarak asagidaki testleri yapin
            //  3- sayfa url;sinin https://www.bestbuy.com/ oldugunu test edin
            String expectedUrl = "https://www.bestbuy.com/";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl);
        }
    @Test
    public void test03() {
        //  4- titleTest= sayfa basliginin "rest" icermedigini test edin
        String istenenKelime = "rest";
        String titleIcerigi = driver.getTitle();
        System.out.println(titleIcerigi);
        Assert.assertFalse(titleIcerigi.contains("rest"));
    }

    @Test
    public void test04() {
        //  5- logoTest=BestBuy logosunun goruntulendigini test edin
        WebElement logoElementi = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }


    @Test
    public void test05() {
    //  6- FrancaisLinkTest= Fransizca linkin goruntulendigini test edi
        WebElement fransizcaElementi=driver.findElement(By.xpath("//*[text()='Français']"));
        Assert.assertTrue(fransizcaElementi.isDisplayed());
    }


}

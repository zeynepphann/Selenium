package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_handleWindows {
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
        //1- amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        // git gel olacak yerler farkli sayfalar acilmasi gerektigi icin handle degerini kaydetmek
        // faydali olur driver.getWindowHandle(); yap
        String ilkSayfaWindowHandle=driver.getWindowHandle();

        //2- Url'in amazon icerdigini test edelim
        String arananKelime="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));

        //3- yeni bir pencere acip bestbay ana sayfaya gidelim
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://www.bestbuy.com");
       String ikinciSayfaWindowHandle=driver.getWindowHandle();


        //4- title'in Best Buy icerdigini test edelim
        String actualtitle= driver.getTitle();
        String arananKelime2= "Best Buy";
        Assert.assertTrue(actualtitle.contains(arananKelime2));

        //5- ilk sayfaya donup sayfada java aratalim
        driver.switchTo().window(ilkSayfaWindowHandle);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+ Keys.ENTER);

        //6- arama sonuclarinin java icerdigini test edelim
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String sonucYazisiStr=sonucYaziElementi.getText();
        String aradigimizKelime="Java";
        Assert.assertTrue(sonucYazisiStr.contains(aradigimizKelime));

        //7- yeniden bestbuy'in acik oldugu sayfaya gidelim
        driver.switchTo().window(ikinciSayfaWindowHandle);
        //8- logonun gorundugunu test edelim

        WebElement logoelementi= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logoelementi.isDisplayed());

    }
}

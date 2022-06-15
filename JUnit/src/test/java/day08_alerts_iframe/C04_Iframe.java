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

public class C04_Iframe {

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
        driver.close();

    }
    @Test
    public void test01() throws InterruptedException {
        //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        //   ● Bir metod olusturun: iframeTest
        //      ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin
        //      ve  konsolda    yazdirin.

        driver.get("https://the-internet.herokuapp.com/iframe");
        System.out.println(driver.findElement(By.xpath("//*[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")).isEnabled()); // enabe erisilebilir demek
        /*
        Web elementiyle yapilmis hali

        WebElement baslikElementi=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(baslikElementi.isEnabled());
        System.out.println(baslikElementi.getText());
         */

        // 2- Text Box’a “Merhaba Dunya!” yazin.
        // textbox'i dogru olarak locate etmemize ragmen driver bulamadi
        // bunun uzerine HTML kodlari inceleyince
        // textbox'in aslinda bir IFrame icerisinde oldugunu gorduk
        // bu durumda once iframe'i locate edip
        // switchTo() ile o iFrame'e gecmeliyiz

        WebElement iframeElementi=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElementi);
        WebElement textKutusu=driver.findElement(By.xpath("//body[@id='tinymce']"));
        textKutusu.clear();
        textKutusu.sendKeys("Merhaba Dunya");

        Thread.sleep(3000);

        //TextBox’in altinda bulunan “Elemental Selenium”
        // linkinin textinin gorunur oldugunu  dogrulayin ve  konsolda yazdirin.
        // link yazi elementini dogru locate etmemize ragmen yazdirmadi
        // cunku yukarida iFrame'e gecis yapmistik
        // once oradan cikmamiz lazim
        driver.switchTo().defaultContent();

        WebElement linkYaziElementi = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(linkYaziElementi.isDisplayed());
        System.out.println(linkYaziElementi.getText());



    }
}

package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_handleWindows {
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
        //amazon ana sayfaya gidin
        //
        driver.get("https://www.amazon.com");
        String ilkSayfaHandleDegeri= driver.getWindowHandle();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);

       /*
       driver.getWindowHandle() = CDwindow-71B94FF4D96BE4E1F81932C354864D7D
       bu kod acilan sayfanin unique hash kodudur
       selenium sayfalar arasi geciste bu window handle degerini kullanir

       eger sayfalar arasinda driver'imizi gezdiriyorsak ve herhangi bir
       sayfadan suanda bulundugumuz sayfaya gecmek istiyorsak
       driver.switchTo().window("CDwindow-71B94FF4D96BE4E1F81932C354864D7D");
       bu sayfanin window handle degerini girerek bu sayfaya gecisi saglayabiliriz
        */

        //3- ilk urunun resmini tiklayarak farkli bir tab olarak acin
        WebElement ilkUrunResmi=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect'][1]"));
        driver.switchTo().newWindow(WindowType.TAB);
        /*
        Bu komutu kullandigimizda driver otomatik olarak olusturulmus olan new tab'a gecer
        yeni tab'da gorevi gerceklestirmek icin adimlari bastan almamiz gerekir

         */
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();


        //4- yeni tab da acilan urunun adini yazdirin
        WebElement urununTitleElementi=driver.findElement(By.xpath("//span[@id='productTitle']"));
        System.out.println(urununTitleElementi.getText());

        //ilk sayfaya gecip url'i yazdiralim
        driver.switchTo().window(ilkSayfaHandleDegeri);
        System.out.println(driver.getCurrentUrl());

    }

 }

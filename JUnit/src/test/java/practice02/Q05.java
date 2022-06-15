package practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05  {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01() {

        // ...Exercise5...
        //@BeforeClass ın icerisinde driver i kuralim
        //maximize edip tum web elementler yuklenene kadar 10 sn bekletelim
        //Google 'a gidelim ve sayfa basliginin Google icerdigini dogrulayalim

        driver.get("https://www.google.com");
        String expectedYazi ="Google";
        WebElement actualYaziElementi = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        String actualYazi = actualYaziElementi.getText();

        Assert.assertTrue(expectedYazi.contains(actualYazi));


    }
        @Test
        public void test02() throws InterruptedException {
            //Amazon'a gidelim ve url in www.amazon.com icerip icermedigini dogrulayalim
            //@AfterClass ta driver ı kapatalim
            driver.get("https://www.amazon.com");
            String  amazonUrl=driver.getCurrentUrl();
            String  expectedUrl="www.amazon.com";

            Assert.assertEquals( expectedUrl,amazonUrl);
            Thread.sleep(3000);


        }


    }




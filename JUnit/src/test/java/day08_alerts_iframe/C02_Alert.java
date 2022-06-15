package day08_alerts_iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Alert {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");

    }

    @AfterClass
    public static void tearDown(){
     driver.close();
    }

    @Test
    public void acceptAlert(){
        //● Bir metod olusturun: acceptAlert
        //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //      “You successfully clicked an alert” oldugunu test edin.
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept(); //okey'e basmak icin
        String expectedYazi="You successfully clicked an alert";
        WebElement sonucYazisi=driver.findElement(By.xpath("//*[text()='You successfully clicked an alert']"));
        String actualYazi=sonucYazisi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);


    }
    @Test
    public void  dismissAlert(){
        //● Bir metod olusturun: dismissAlert
        //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //      “successfuly” icermedigini test edin.

        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();// cansela basmak icin
        String istenmeyenKelime="successfuly";
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//*[text()='You clicked: Cancel']"));
        String actualYazi=sonucYazisiElementi.getText();
        Assert.assertFalse(actualYazi.contains(istenmeyenKelime));

    }
    @Test
    public void sendKeysAlert (){
        //● Bir metod olusturun: sendKeysAlert
        //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        //      OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
      driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
      driver.switchTo().alert().sendKeys("Zeynep Han");
      driver.switchTo().alert().accept();
      WebElement sonucYazisi=driver.findElement(By.xpath("//p[@id='result']"));
      String sonucYazsiStr=sonucYazisi.getText();
      String girilenKelime="Zeynep Han";

      Assert.assertTrue(sonucYazsiStr.contains(girilenKelime));

    }



}

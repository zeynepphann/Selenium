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
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class C05_DropDownOptions {
     /*
        Amazon anasayfaya gidip
        dropdown menuden books'u secelim
        sectigimiz option'i yazdiralim
        dropdown'daki opsiyonlarin toplam sayisinin
        28 oldugunu test edin
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
        driver.quit();
    }

    @Test
    public void test01(){
      driver.get("https://www.amazon.com");
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");


        /*
        bir dropdown ile calisiyorken son secilen optiona ulasmak isterseniz
        select.getFirstSelectedOption() methodunu kullanmalisiniz
        bu method bize wep element dondurur,
        uzerindeki yaziyi yazdirmak icin getText()
        unutulmamalidir
        */
        System.out.println(select.getFirstSelectedOption().getText());


        // dropdown'daki opsiyonlarin toplam sayisinin
        //        28 oldugunu test edin

        List<WebElement > optionsList=select.getOptions();
        int actualoptionSayisi=optionsList.size();
        int expectedOptionSayisi=28;

        Assert.assertEquals(expectedOptionSayisi,actualoptionSayisi);


    }

}

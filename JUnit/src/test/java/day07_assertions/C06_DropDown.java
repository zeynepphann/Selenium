package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class C06_DropDown {
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
        // driver.quit();
    }

    @Test
    public void test01(){
        // ● https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //  1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement ddm=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //  2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
         select.selectByValue("2");
         System.out.println(select.getFirstSelectedOption().getText());

         //  3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
          select.selectByVisibleText("Option 1");
         System.out.println(select.getFirstSelectedOption().getText());


        //  4.Tüm dropdown options'i yazdırın
        List<WebElement> tumOptionlar=select.getOptions();
        for (WebElement each : tumOptionlar
             ) {
            System.out.println(each.getText());
        }

        int dropDownBoyut=tumOptionlar.size();
        if (dropDownBoyut==4){
            System.out.println("true");
        }else System.out.println("false");
    }
}

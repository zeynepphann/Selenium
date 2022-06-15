package day15_writeExcel_sceenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C03_IstenenWebElements extends TestBase {
    @Test
    public void name() throws IOException {

        // amazona gidip Nutella aratalim
        // ve sonuc sayisinin oldugu web elementin fotografini cekelim
         driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement sonucYaziElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        File sonucYaziElementiSS=new File("target/erkanGoruntuleri/sonucYazisiSS.jpeg");
        File temp=sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,sonucYaziElementiSS);


    }

}

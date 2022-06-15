package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {
    //1. Tests packagenin altina bir class oluşturalim


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        //3. code.txt dosyasını indirelim
        WebElement dummyLinki=driver.findElement(By.xpath("//*[text()='dummy.txt']"));
        dummyLinki.click();
        Thread.sleep(5000);
         //4. dosyanın başarıyla indirilip indirilmediğini test edelim
        //dosya downloads'a indirilecektir, bize downloads'un dosya yolu lazim

        String farkliKisim=System.getProperty("user.home");
        String ortakKisim= "\\Downloads\\dummy.txt";

        String arananDosyaYolu= farkliKisim+ortakKisim;

        // geriye o dosya yolundaki dosyanin var oldugunu assert edelim

        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYolu)));

    }

}

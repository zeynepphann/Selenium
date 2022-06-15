package day11_faker_file;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_FileUpload extends TestBase {
    @Test
    public void test01() throws InterruptedException {
      // 1.Tests packagenin altina bir class oluşturun : C05_UploadFile
      // 2.https://the-internet.herokuapp.com/upload adresine gidelim
       driver.get("https://the-internet.herokuapp.com/upload");
       // 3.chooseFile butonuna basalim
      // 4.Yuklemek istediginiz dosyayi secelim.
        /*
        bu islemi selenium ile yapma imkanimiz yok cunku web tabanli bir uygulama degil
        bu durumda sendKeys() imdadimiza yetisir
        eger chooseFile butonuna var olan bir dosyanin dosya yolunu yollarsaniz
        secme islemi otomatik olarak yapilmis olacaktir.
        */

        // 1. adim choose file butonunu locate edelim
        WebElement dosyaSecButonu=driver.findElement(By.id("file-upload"));

        //2. adim yuklenecek dosyanin dosya yolunu olusturalim
        // biz masa ustundeki text.txt dosyasini yukleyelim
        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="\\Desktop\\text.txt";
        String yuklenecekKisim=farkliKisim+ortakKisim;

        //3. adim sent Keys ile dosya yolunu secme butonunu yollayalim
        dosyaSecButonu.sendKeys(yuklenecekKisim);
        Thread.sleep(3000);

      // 5.Upload butonuna basalim.
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
      // 6.“File Uploaded!” textinin goruntulendigini test edelim.
        System.out.println(driver.findElement(By.xpath("//*[text()='File Uploaded!']")).isDisplayed());

    }
}

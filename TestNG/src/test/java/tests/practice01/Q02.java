package tests.practice01;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.N11Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Q02 {
    @Test
    public void testName() throws IOException {
        N11Page n11Page=new N11Page();

        //n11 sitesine giris yapin
        Driver.getDriver().get(ConfigReader.getProperty("n11Url"));

        //Sayfada cikan cookies 'leri kapatin
        Driver.getDriver().findElement(By.xpath("(//*[text()='Daha Sonra'])[1]")).click();

        // Mağazalar yazısının üzerine gelin.
        //Açılan menü-de Mağazaları gör butonuna tiklayin.
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(n11Page.magazaYaziElementi).click().perform();

        //Açılan sayfada Tüm Mağazalar tıklandı
        n11Page.magazaGorYazisi.click();

        //M harfi ile başlayan mağazalara tiklayin.
        n11Page.mIleBaslayanMagaza.click();

        //Cikan magazalari excel dosyasina atin
        List<WebElement> mHarfliMagazaListesi=Driver.getDriver().findElements(By.xpath("//div[@class='tabPanel allSellers']//div//ul//li"));

        Actions actions1=new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();

         String dosyaYolu="src/test/resources/N11sayfasi.xlsx";
         FileInputStream n11Dosyasi=new FileInputStream(dosyaYolu);
         Workbook workbook= WorkbookFactory.create(n11Dosyasi);

        for(int i=0; i<mHarfliMagazaListesi.size(); i++){

            workbook.getSheet("Sayfa1").
                    createRow(i).
                    createCell(0).
                    setCellValue(mHarfliMagazaListesi.get(i).getText());
        }



        //Satir sayisini yazdirin

        int satir=workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println("satir sayisi = " + satir);

        //excel dosyasini kaydedin
        FileOutputStream n11=new FileOutputStream(dosyaYolu);
        workbook.write(n11);


        // n11 sayfasini kapatin
        Driver.closeDriver();

    }



    }


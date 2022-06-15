package tests.practice01;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemogaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.WatchEvent;

public class Q01 {
    @Test
    public void testName() throws InterruptedException, IOException {
        DemogaPage demogaPage = new DemogaPage();

        // 1.  https://demoqa.com/  adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));

        // 2.  'Elements' i tiklayin
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        demogaPage.elementBasligi.click();


        // 3.  Sol tarafta 'Elements' cubugunun goruntulendigini dogrulayin
        demogaPage.ikinciSaydaElementGorunurlugu.isDisplayed();

        // 4.  'Web Tables' kısmını tiklayin
        actions.sendKeys(Keys.ARROW_LEFT).perform();
        demogaPage.webTableButonu.click();

        // 5.  Web Tables sayfasinin acildigini ve table body'sinin gorunur oldugunu dogrulayin
        Assert.assertTrue(demogaPage.webTableButonu.isDisplayed());
        Assert.assertTrue(demogaPage.webTableBody.isDisplayed());

        // 6.  Table'da kac data (cell) oldugunu konsolda yazdırın.

        System.out.println("Cell size : "+demogaPage.satirBilgisi.size());
        System.out.println(" ");

        // 7.  Table’daki başlıkları konsolda yazdırın.

        System.out.println("Table basliklari ;");
        for (WebElement each : demogaPage.tableBasliklariList
        ) {
            System.out.println( each.getText());

        // 8.  Table'da kac satir oldugunu  konsolda yazdırın.
        System.out.println("Satir sayisi: "+ demogaPage.satirBilgisi.size());
        System.out.println(" ");

        // 9.  Table'da bulunan satirlari konsolda yazdırın.

        System.out.println("Satir konsolu: ");
        for (WebElement each2: demogaPage.sutunBilgisi
             ) {
            System.out.println(each2.getText());
        }

        // 10. Table'da kac sutun oldugunu  konsolda yazdırın.
            System.out.println("Sutun uzunlugu = " + demogaPage.sutunBilgisi.size());

        // 11. Ikinci sutundaki tum elementleri konsolda yazdırın.

        System.out.println("2.Sutunda ki bilgiler :");
        for (WebElement each3: demogaPage.ikinciSutun
             ) {
            System.out.println(each3.getText());
        }

        // 12. Department basligindaki tum elementleri(sutun) konsolda yazdırın.


        // 13. Tabloda "Age" i 45 olan kisinin First Name'ini yazdirin
        Driver.closeDriver();


        }
    }
}

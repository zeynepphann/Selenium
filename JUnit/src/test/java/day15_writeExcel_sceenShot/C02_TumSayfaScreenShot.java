package day15_writeExcel_sceenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C02_TumSayfaScreenShot extends TestBase {

        @Test
        public void tumSayfa() throws IOException {
            // amazon sayfasina gidip tum sayfanin fotografini cekelim
            driver.get("https://www.bestbuy.com");
            TakesScreenshot ts = (TakesScreenshot) driver;
            LocalDateTime date=LocalDateTime.now();
            DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYMMddHHmmss");
            String tarih = date.format(dtf);

            File tumSayfaResim= new File("target/ekranGoruntuleri/tumSayfa"+tarih+".jpeg");   // intelijdeki target package'ina dosya olusturduk
                                                                                                       // jpeg yerine img,jpg olabilit tum uzantilari kabul eder
            File geciciDosya= ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(geciciDosya,tumSayfaResim);


    }
}

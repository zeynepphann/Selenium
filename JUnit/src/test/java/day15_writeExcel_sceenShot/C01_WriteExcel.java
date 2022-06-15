package day15_writeExcel_sceenShot;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {
    @Test
    public void writeExcelTest() throws IOException {

       // 1) Yeni bir Class olusturalim WriteExcel
       // 2) Yeni bir test method olusturalim writeExcelTest()
       // 3) Adimlari takip ederek 1.satira kadar gidelim

        String dosyaYolu="src/main/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

       // 4) 5.hucreye yeni bir cell olusturalim // 5. satir eklendi
        workbook.getSheet("Sayfa1")
                .getRow(0)// index
                .createCell(4)
                .setCellValue("Nufus");

       // 5) Olusturdugumuz hucreye “Nufus” yazdiralim
       // 6) 2.satir nufus kolonuna 1500000 yazdiralim  2.satir = 1 index

        workbook.getSheet("Sayfa1")
                .getRow(1)// index
                .createCell(4)
                .setCellValue("1500000"); // bu da olur

       // 7) 10.satir nufus kolonuna 250000 yazdiralim
        workbook.getSheet("Sayfa1")
                .getRow(9)// index
                .createCell(4)
                .setCellValue(2500000);

        // 8) 15.satir nufus kolonuna 54000 yazdiralim
        workbook.getSheet("Sayfa1")
                .getRow(14)// index
                .createCell(4)
                .setCellValue(54000);

       // 9) Dosyayi kaydedelim
        FileOutputStream fos= new FileOutputStream(dosyaYolu);
        workbook.write(fos);

       // 10)Dosyayi kapatalim
        fis.close();
        fos.close();
    }
}

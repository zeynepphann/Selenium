package day14_excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
      // 7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/resources/ulkeler.xlsx";

      // 8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        // dosya yolunsa kayitli olsan dosya baglantisina gider ve onu okur ve kodu buraya getir
        FileInputStream fis=new FileInputStream(dosyaYolu);

      // 9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fis); // Workbook =excel sayfasinin kopyasini buraya olusturduk

      // 10. WorkbookFactory.create(fileInputStream)
      // 11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("Sayfa1"); // sheet= acik olan excel sayfasi
      // 12. Row objesi olusturun sheet.getRow(index)

        Row row=sheet.getRow(3); //row= satiri getirir index kullanir
      // 13. Cell objesi olusturun row.getCell(index)

        Cell cell=row.getCell(3); // 3. sutun dakini getirir

        System.out.println(cell);

        //3. indexdeki satirin 3.indexindeki datanin Cezayir oldugunu test edin
        String expectedData="Cezayir";
          String actualData=cell.toString();

        Assert.assertEquals(expectedData,actualData); // cellin obje turu cell






    }
}

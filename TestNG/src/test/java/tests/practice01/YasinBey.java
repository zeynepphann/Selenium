package tests.practice01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemogaPage;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YasinBey {

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        DemoqaPage demoqaPage = new DemoqaPage();
        // 2.  'Elements' i tiklayin
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        demoqaPage.elements.click();
        // 3.  Sol tarafta 'Elements' cubugunun goruntulendigini dogrulayin
        demoqaPage.elementsMenu.isDisplayed();
        // 4.  'Web Tables' kısmını tiklayin
        demoqaPage.webTables.click();

        // 5.  Web Tables sayfasinin acildigini ve table body'sinin gorunur oldugunu dogrulayin
        demoqaPage.webTablesPageUrl.contains("webtables");
        demoqaPage.tableBody.isDisplayed();
        // 6.  Table'da kac data (cell) oldugunu konsolda yazdırın.
        System.out.println("number of cells: " + demoqaPage.cellList.size());
        // 7.  Table’daki başlıkları konsolda yazdırın.
        System.out.println("=================================");
        for (WebElement each : demoqaPage.headerList) {
            System.out.println(each.getText());
            System.out.println("=================================");
        }
        System.out.println("=================================");
        // 8.  Table'da kac satir oldugunu  konsolda yazdırın.
        System.out.println("number of lines: " + demoqaPage.rowList.size());
        // 9.  Table'da bulunan satirlari konsolda yazdırın.
        System.out.println("=================================");
        for (WebElement each : demoqaPage.rowList) {
            System.out.println(each.getText());
            System.out.println("=================================");
        }
        System.out.println("=================================");
        // 10. Table'da kac sutun oldugunu  konsolda yazdırın.
        System.out.println("number of columns: " + demoqaPage.headerList.size());
        // 11. Ikinci sutundaki tum elementleri konsolda yazdırın.
        for (WebElement each : demoqaPage.secondColumnList) {
            System.out.println(each.getText());
        }
        // 12. Department basligindaki tum elementleri(sutun) konsolda yazdırın.
        for (WebElement each : demoqaPage.departmentColumnList) {
            System.out.println(each.getText());
        }
        // 13. Tabloda "Age" i 45 olan kisinin First Name'ini yazdirin
        for (int i = 0; i < demoqaPage.rowList.size(); i++) {
            if (demoqaPage.rowList.get(i).toString().contains("45")) {
                System.out.println(demoqaPage.rowList.get(i).toString());
            }
        }


    }
}

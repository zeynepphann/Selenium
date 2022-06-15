package day12_senkronizasyon.day13_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Webtables extends TestBase {
    @Test
    public void dinamikYazici(){
        //oncelo class'daki adrese gidip
        // girisYap methodunu kullanarak sayfaya giris yapin
        // input olarak verilen satir sayisi ve sutun sayisi'na sahip
        //celldeki text'
        //        i yazdirin

        int satir=3;
        int sutun=5;
        C02_Webtables obj =new C02_Webtables();
        obj.girisYap();

        WebElement arananCell=driver.findElement(By.id("//tbody//tr[3]//td[5]"));
        System.out.println(arananCell.getText());


    }public void girisYap() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.linkText("Log in")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();
}
}

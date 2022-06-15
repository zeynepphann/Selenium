package tests.practice01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q03 {
    @Test
    public void testName() {

        // 1-Amazon sayfasina gidin
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // 2-sol ust taraftaki all secenegine tiklayiniz
        amazonPage.allButonu.click();

        // 3-Digital Content & Devices yazisinin gorunur oldugundan emin olunuz
        amazonPage.digitalContentYazisi.isDisplayed();

        // 4-Kindle E-readers & Books secenegine tiklayiniz
        amazonPage.kindleButonu.click();

        // 5-Kindle Kids secegini tiklayiniz
         amazonPage.kindleKidsButonu.click();

        // 6-sol taraftaki 3. resmin gorunurlugunu dogrulayiniz
        amazonPage.kindleKidsucuncuResim.isDisplayed();

        // 7-Registry uzerine gelip iki kere tiklayiniz
        Actions actions=new Actions(Driver.getDriver());
        actions.click(amazonPage.registryButonu).perform();

        // 8-Registrant name kismina telephone yaziniz
        amazonPage.registrantKutusu.sendKeys("telephone");

        // 9-Select a registry or gift list type Birthday Gift List'i seciniz ve search butonuna tiklayiniz
        Select select=new Select(amazonPage.selectButonu);
        select.selectByVisibleText("Birthday Gift List");
        amazonPage.searchButonu.click();

        //10- "Sorry, no Gift Lists match your search." yazsinin ciktigini dogrulayiniz
        amazonPage.sorryYazisi.isDisplayed();

        //11-amazonu kapatin
        Driver.closeDriver();


    }


}








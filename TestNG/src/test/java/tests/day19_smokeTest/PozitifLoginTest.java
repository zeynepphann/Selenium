package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class PozitifLoginTest extends TestBaseRapor {

    BrcPage brcPage=new BrcPage();

    @Test
    public void positiveLoginTest() {
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilir");

        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //		login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("Ilk login butonuna tiklandi ");

        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Gecerli email yazildi");
        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Gecerli password yazildi");
        // login butonuna tiklayin

        brcPage.ikinciLoginButonu.click();
        extentTest.info("ikinci login butonuna tiklandi ");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
          extentTest.info("Kullamici basarili sekilde giris yapti");

        Driver.closeDriver();




    }
}

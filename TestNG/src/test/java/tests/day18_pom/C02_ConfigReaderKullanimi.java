package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void testName() {
        FacebookPage facebookPage=new FacebookPage();

        //facebook ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // kullanici mail yanlis bir kullanici adi yazdirin
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUserName"));

        // kullanici sifre kutusuna yanlis bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongUserPassword"));

        // login butonuna basin
        facebookPage.loginTusu.click();

        // giris yepilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());

        //driveri kapatin
        Driver.closeDriver();

    }
}

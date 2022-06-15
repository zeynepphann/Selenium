package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.Driver;

public class BrcStepDefinitions {

    BrcPage brcPage=new BrcPage();


    @Then("kullanici createNewUser butonunu tiklar")
    public void kullanici_create_new_user_butonunu_tiklar() {
        brcPage.createNewUser.click();
    }


    @And("isim bolumune firstname yazar")
    public void isimBolumuneFirstnameYazar() {
        brcPage.firstname.sendKeys("blabla");
    }

    @And("soyisim bolumune soyisim yazar")
    public void soyisimBolumuneSoyisimYazar() {
        brcPage.lastname.sendKeys("bla");
    }


    @Then("kullanici telefon numarasi yazar")
    public void kullanici_telefon_numarasi_yazar() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys("05004756372").perform();
    }


    @And("kullanici adress yazar")
    public void kullaniciAdressYazar() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys("Canada").perform();
    }


    @Then("zip code bolumune zip code yazar")
    public void zip_code_bolumune_zip_code_yazar() {
        brcPage.zipCode.sendKeys("30484");
    }


    @Then("email bolumune email yazar")
    public void email_bolumune_email_yazar() {
    brcPage.email.sendKeys("blabla4@gmail.com");
    }

    @And("gecerli bir password girer")
    public void gecerliBirPasswordGirer() {
        brcPage.password.sendKeys("12345");
    }

    @And("gecerli sifreyi tekrar password girer")
    public void gecerliSifreyiTekrarPasswordGirer() {
        brcPage.ikinciPassword.sendKeys("12345");
    }

    @Then("register butonuna basar")
    public void register_butonuna_basar() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
    }


    @And("kullanici giris kismina firstname yazar")
    public void kullaniciGirisKisminaFirstnameYazar() {
        brcPage.girisEmail.sendKeys("blabla1@gmail.com");
    }


    @And("kullanici giris kismina password girer")
    public void kullaniciGirisKisminaPasswordGirer() {
        brcPage.girisPassword.sendKeys("12345");
    }

    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        brcPage.loginButonu.click();
    }


    @And("kullanici login olur")
    public void kullaniciLoginOlur() {
        brcPage.girisLoginButonu.click();
    }

    @And("kullanici {string} i secip reservasyon yapar")
    public void kullaniciISecipReservasyonYapar(String eklenenAraba) {
     brcPage.secimButonu.click();
     brcPage.secimButonu.click();
     brcPage.audiSecim.click();
    }

}

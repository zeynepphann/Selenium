package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import pages.GittiGidiyorPage;
import utilities.Driver;

public class GittiGidiyorStepDefinitions {

    GittiGidiyorPage gGpage=new GittiGidiyorPage();

    @Given("kullanici gGde {string} icin arama yapar")
    public void kullanici_g_gde_icin_arama_yapar(String istenenKelime) {
       gGpage.gGaramaButonu.sendKeys("Bilgisayar");
       gGpage.bulButonu.click();
    }


    @And("kullanici {int}.sayfaya gider")
    public void kullaniciSayfayaGider(int sayfaNumarasi) {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.END)
                .sendKeys(Keys.DOWN);

        gGpage.cerezButonu.click();
        gGpage.ikinciSayfa.click();
    }

    @And("kullanicinin {int}.sayfada oldugu dogrulanir")
    public void kullanicininSayfadaOlduguDogrulanir(int bulunulanSayfa) {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.END)
                .sendKeys(Keys.DOWN);
        gGpage.ikinciSayfa.isSelected();
        gGpage.ikinciSayfaGorunurlugu.isDisplayed();
    }


    @And("kullanici urune tiklar")
    public void kullaniciUruneTiklar() {
        gGpage.urun.sendKeys(Keys.ENTER);


    }
}

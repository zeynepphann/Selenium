package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinations {
    DataTablesPage dataTablesPage=new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
      dataTablesPage.firstName.sendKeys(firstname);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
    dataTablesPage.lastName.sendKeys(lastname);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
    dataTablesPage.position.sendKeys(position);
    }

    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
    dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
    dataTablesPage.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {

        dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }
    @When("kullanici {string} isim ile arama yapar")
    public void kullaniciIsimIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    } 



    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}

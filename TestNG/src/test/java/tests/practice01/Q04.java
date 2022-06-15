package tests.practice01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemogaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.Set;

public class Q04 {
    @Test
    public void test(){
        //1. "https://demoqa.com/" adresine gidiniz.
        DemogaPage demogaPage = new DemogaPage();
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        String ilkSayfaHandle=Driver.getDriver().getWindowHandle();


        //2. Alerts, Frame & windows elementini tiklayiniz.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demogaPage.alertButonu.click();


        // 3. Sirasiyla 'Browser window' ve 'New tab' butonlarini secerek
        demogaPage.browserButonu.click();
        demogaPage.newTabButonu.click();

        // 4.'This is a sample page'yazisinin ciktigini dogrulayiniz.

        Set<String> windowsHandleSet=Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle="";

        for (String each :windowsHandleSet
             ) {
            if (!each.contains(ilkSayfaHandle)){
                ikinciSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        System.out.println("(Driver.getDriver().getTitle()) = " + (Driver.getDriver().getTitle()));

        String expected="This is a sample page";
        String actualTitle=demogaPage.newTabYazisi.getText();
        Assert.assertEquals(actualTitle,expected);

        // 5.'New window' u secerek acilan sayfayi tam ekran yapiniz.
        demogaPage.newWindowButonu.click();
        Driver.getDriver().manage().window().maximize();

        //6. 'New window message' u seçerek acilan sayfadaki yaziyi silip 'Başardım!' yaziniz.
        demogaPage.newWindowMessageButonu.click();
        demogaPage.newWindowMessageButonu.sendKeys("I win!");
    }
}

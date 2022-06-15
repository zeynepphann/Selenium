package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.Set;

public class C01_WindowHandleReausableMethods {
    @Test
    public void test01(){
        //  ● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        String  ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();

        //  ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
       Set<String > windowHanleSeti=Driver.getDriver().getWindowHandles();

       String ikinciSayfaWh="";
        for (String each :windowHanleSeti
             ) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaWh=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWh); // ikinci sayfaya gectik
        System.out.println(Driver.getDriver().getTitle());
        //acilan yeni tab'in titlenin "New Window oldugunu test edin

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        
    }


    @Test
    public void test02() {
        //  ● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        String  ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();

        //  ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        //acilan yeni tab'in titlenin "New Window oldugunu test edin
        ReusableMethod.switchToWindow("New Window");

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();


        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }
}

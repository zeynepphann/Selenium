package tests.day16_notations;

import utilities.TestBase;
import org.testng.annotations.Test;

public class C03_Priority extends TestBase {
    /*
    TestNG test methodlarini isim sirasina gore calistirir
    eger isim siralamasinin disinda bir siralamayla calismasini isterseniz
    o zaman test methodlarina oncelik (priority) tanimlayabilirsiniz

    priority kucukten buyuge gore calisir
    eger bir test methoduna priority degeri atanmamissa
    default olarak priority=0 olarak kabul edilir

     */
    @Test(priority = -5)
    public void amazon() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority =-2)
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test(groups = "grup1")
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }

}

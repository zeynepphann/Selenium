package tests.day16_notations;

import utilities.TestBase;
import org.testng.annotations.Test;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    //@BeforeMethod ve @AfterMethod notasyonlari
    //JUnit'deki @Befor ve @After gibidir her test methodundan once ve sonra
    //calisirlar

    @Test
    public void amazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test2() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
    }
}

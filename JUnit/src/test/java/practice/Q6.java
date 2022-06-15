package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q6 extends TestBase {
    @Test
    public void name() throws InterruptedException {

    // ...Exercise6...
    // 1.  https://id.heroku.com/login sayfasina gidin
    driver.get("https://id.heroku.com/login");

    // 2.  Bir mail adersi giriniz
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kskksksks@gmail.com");

    // 3.  Bir password giriniz
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kskk");

    // 4.  Login butonuna tiklayiniz
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    // 5.  "There was a problem with your login." texti gorunur ise
    driver.findElement(By.xpath("//*[text()='There was a problem with your login.']")).isDisplayed();

    Thread.sleep(4000);

    // 6.  "kayit yapilamadi" yazdiriniz

    // 8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz

        WebElement gorunenText=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        if (gorunenText.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }else{
            System.out.println("kayit yapildi");
        }

    // 9.  Tum sayfalari kapatiniz

        driver.close();

    }

}

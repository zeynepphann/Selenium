package day05_jUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.Date;

public class C02_MavenTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");

        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)


        driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.navigate().back();

        //6. Online Banking menusunden Pay Bills sayfasina gidin

        driver.findElement(By.xpath("//a[@id='online-banking']")).click();

        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

        // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("100");

        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2022-05-14");

        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //10. “The payment was successfully submitted” mesajinin ciktigini kontrol edin

      WebElement mesaj=driver.findElement(By.xpath("//div[@id='alert_content']"));
      //div/span[@title='$ 100 payed to payee sprint'] = Bu da olabilirdi

      if (mesaj.isDisplayed()){
          System.out.println("Test PASSED");
      }else   System.out.println("Test FAILED");

      driver.close();



    }

}

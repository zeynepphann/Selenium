package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
  //    1. Launch browser
  //2. Navigate to url 'http://automationexercise.com'
  //            3. Verify that home page is visible successfully
  //4. Click on 'Signup / Login' button
  //5. Verify 'Login to your account' is visible
  //6. Enter correct email address and password
  //7. Click 'login' button
  //8. Verify that 'Logged in as username' is visible
  //9. Click 'Logout' button
  //10. Verify that user is navigated to login page
  WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        //  1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        ///3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();


        // 4. 'Kaydol / Oturum Aç' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. 'Hesabınıza giriş yapın' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed();

        //6. Yanlış e-posta adresi ve şifre girin
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("zynphn@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

        //7. 'Giriş' düğmesini tıklayın
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        //8. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath(" //*[text()=' Logged in as ']")).isDisplayed();

        //9. 'Çıkış' düğmesini tıklayın
        driver.findElement(By.xpath("//*[text()=' Logout']")).click();

        //10. Kullanıcının giriş sayfasına yönlendirildiğini doğrulayın
        driver.findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed();
    }
}

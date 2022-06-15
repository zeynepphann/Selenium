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

public class Q05 {
//    1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//  3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and already registered email address
//7. Click 'Signup' button
//8. Verify error 'Email Address already exist!' is visible
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
    // driver.close();
    }

    @Test
    public void test01(){
        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        ///3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

        // 4. 'Kaydol / Oturum Aç' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed();

        //6. Adı ve önceden kayıtlı e-posta adresini girin
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Zeynep");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("zynphn@gmail.com");

        //7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("//*[text()='Signup']")).submit();

        //8. 'E-posta Adresi zaten var!' hatasını doğrulayın. görünür
        driver.findElement(By.xpath("//*[text()='Email Address already exist!']")).isDisplayed();

    }
}

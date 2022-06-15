package deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Day03_C03 {
    public static void main(String[] args) {

        //a. http://a.testaddressbook.com adresine gidiniz.
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com");


        // b. Sign in butonuna basin
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();


        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.name("session[email]"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButonu = driver.findElement(By.name("commit"));


        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();


        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));

        String expectedUserMail = "testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullaniciAdiElementi.getText())) {
            System.out.println("Expected kullanici testi PASSED");
        } else
            System.out.println("Expected kullanici testi FAILED");


        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement addressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));

        if ( addressesElementi.isDisplayed()){   //gorunuyor mu  true-false
           System.out.println("addresses testi PASSED");
        } else
           System.out.println("addresses testi FAILED");

        if (signOutElementi.isDisplayed()){
            System.out.println("sign out testi PASSED");
        } else
            System.out.println("sign out testi FAILED");



        // 3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki linkler sayisi "+ linklerListesi.size());
        for (WebElement each :linklerListesi
             ) {
            System.out.println(each.getText());
        }

        // Linkleri yazdiralim


        signOutElementi.click();

        driver.close();




    }
}

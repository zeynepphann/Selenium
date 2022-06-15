package day04_Xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  a. Verilen web sayfasına gidin.
        driver.get("http://a.testaddressbook.com/sign_in");

        //  b. Locate email textbox
        WebElement mailTextBox=driver.findElement(By.cssSelector("#session_email"));
        //  c. Locate password textbox
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_password"));
        //  d. Locate signin button
        WebElement signInButonu=driver.findElement(By.cssSelector("input[name='commit']"));

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!

        mailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();





    }
}

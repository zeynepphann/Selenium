package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06 {
    WebDriver driver;

    @Before
    public void setUp(){
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    } @After
        public void tearDown(){
        driver.close();
    }

    @Test
        public void test01(){
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[text()=' Contact us']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]")).isDisplayed();

        //6. Enter name, email, subject and message
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Zeynep");
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("zynphn@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("kart islemi");
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("kart islemi yaparken kart numarasi dogru olmasina ragmen hata veriyor");


        //7. Upload file
        driver.findElement(By.xpath("//input[@type='file']")).submit();
        driver.switchTo().alert().dismiss();

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        driver.findElement(By.xpath("(//*[text()='Success! Your details have been submitted successfully.'])[1]")).isDisplayed();

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("(//*[text()=' Home'])[2]")).click();
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

    }

}

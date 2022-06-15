package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q07 {


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
        //  1. Launch browser
        //  2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //  3. Verify that home page is visible successfully
        driver.findElement(By.xpath("/html[@lang='en']")).isDisplayed();

        //  4. Click on 'Test Cases' button
        driver.findElement(By.xpath("//*[text()=' Test Cases']")).click();

        //  5. Verify user is navigated to test cases page successfully
        driver.findElement(By.xpath("//*[text()='Test Cases']")).isDisplayed();

    }
}

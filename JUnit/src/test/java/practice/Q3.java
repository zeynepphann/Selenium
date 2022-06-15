package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q3 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button

    WebDriver driver;

    @Test
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Zeynep");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Han");


        //check the gender
        driver.findElement(By.id("sex-1")).click();

        //check the experience
        driver.findElement(By.id("exp-0")).click();

        //fill the date
        driver.findElement(By.id("datepicker")).sendKeys("17.05.2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //choose your continent -> Antartica
        WebElement ddm =driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Antartica");

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[.='Browser Commands']")).click();

        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();





    }
}
